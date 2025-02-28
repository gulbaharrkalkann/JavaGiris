package OOP.MaceraOyunu;

public class ToolStore extends NormalLocation{
    public ToolStore(Player player){
        super(player,"Mağaza");
    }
    @Override
   public boolean onLocation() {
        System.out.println("Mağazaya Hoşgeldiniz.");
        boolean showMenu = true;
        while (showMenu) {
            System.out.println("1- Sİlahlar");
            System.out.println("2-Zırhlar");
            System.out.println("3-Çıkış Yap");
            System.out.print("Seçiminiz : ");
            int selectCase = Location.scanner.nextInt();
            while (selectCase < 1 || selectCase > 3) {
                System.out.println("Geçersiz değer tekrar giriniz : ");
                selectCase = scanner.nextInt();
            }
            switch (selectCase) {
                case 1:
                    printWeapon();
                    buyWeapon();
                case 2:
                    printArmor();
                    buyArmor();
                case 3:
                    System.out.println("Bİr daha bekleriz .");
                    showMenu = false;
                    break;
            }

        }
        return true;
    }
    public void printWeapon(){
        System.out.println("-----Silahlar------");
        System.out.println();
        for (Weapon w : Weapon.weapons()){
            System.out.println(" Id : "+w.getId()+w.getName()+" <Para : "+w.getPrice()+" , Hasar : "+w.getDamage()+">");
        }
        System.out.println("0- çıkış yap");
    }
    public void buyWeapon(){
        System.out.println("Bir silah seçiniz");
        int selectWeaponId= scanner.nextInt();
        while (selectWeaponId<0 ||selectWeaponId>Weapon.weapons().length){
            System.out.println("Geçersiz değer tekrar giriniz : ");
            selectWeaponId=scanner.nextInt();
        }
        if (selectWeaponId !=0){
            Weapon selectedWeapon =Weapon.getWeaponObjById(selectWeaponId);
            if (selectedWeapon != null){
                if (selectedWeapon.getPrice()>this.getPlayer().getMoney()){
                    System.out.println("Yeterli paranız bulunmamaktadır.");
                }else {
                    //Satın alma gerçekleştiği alan
                    System.out.println(selectedWeapon.getName()+" silahını satın aldınız..");

                    int balance=this.getPlayer().getMoney()-selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan Paranız :"+ this.getPlayer().getMoney());
                    System.out.println("Önceki Silahınız : "+this.getPlayer().getInventory().getWeapon().getName());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                    System.out.println("Yeni Silahınız : "+this.getPlayer().getInventory().getWeapon().getName());
                }
            }
        }


    }
    public void printArmor() {
        System.out.println("Zırhlar : ");
       for (Armor a : Armor.armors()){
           System.out.println(a.getId()+" - "+a.getName()+
                   " < Para : "+a.getPrice()+ ", Zırh : "+a.getBlock()+" >");
       }
    }
    public void buyArmor() {
        System.out.println("Bir silah seçiniz");
        int selectArmorId = scanner.nextInt();
        while (selectArmorId < 1 || selectArmorId > Armor.armors().length) {
            System.out.println("Geçersiz değer tekrar giriniz : ");
            selectArmorId = scanner.nextInt();
        }
        if (selectArmorId !=0){
            Armor selectedArmor=Armor.getArmorById(selectArmorId);
            if (selectedArmor != null){
                if (selectedArmor.getPrice()>this.getPlayer().getMoney()){
                    System.out.println("Yeterli paranız bulunmamaktadır");
                }else {
                    System.out.println(selectedArmor.getName()+" zırhını satın aldınız.");
                    this.getPlayer().setMoney(this.getPlayer().getMoney()-selectedArmor.getPrice());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                    System.out.println("Kalan Bakiye :"+this.getPlayer().getMoney());
                }
            }
        }

    }
}

