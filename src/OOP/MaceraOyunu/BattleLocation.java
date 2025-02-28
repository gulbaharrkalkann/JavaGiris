package OOP.MaceraOyunu;

import java.util.Random;

public class BattleLocation extends Location{
   private Obstacle obstacle;
   private String award;
   private int maxObstacle;

    public BattleLocation(Player player,String name,Obstacle obstacle,String award,int maxObstacle){
        super(player, name);
        this.obstacle=obstacle;
        this.award=award;
        this.maxObstacle=maxObstacle;
    }


    @Override
    public boolean onLocation(){
        int obsNumber=this.randomObstacleNumber();
        System.out.println("Şuan buradasınız : "+this.getName());
        System.out.println("Dİkkat Et Burada : "+obsNumber+" tane "+this.getObstacle().getName()+" yaşıyor.");
        System.out.println("Savaşmak için S,kaçmak için K'ya bas");
        String selectCase=scanner.nextLine();
        selectCase=selectCase.toUpperCase();
        if (selectCase.equals("S")&&combat(obsNumber)){

               System.out.println(this.getName()+ " tüm düşmanları yendiniz !");


        }
        if (this.getPlayer().getHealthy()<=0){
            System.out.println("Öldünüz");
            return false;
        }

        return true;
    }
    public boolean combat(int obsNumber){

        for (int i=1;i<=obsNumber;i++){
            this.getObstacle().setHealth(this.getObstacle().getOriginalHealth());
            playerStats();
            obstacleStats(i);
            while (this.getPlayer().getHealthy()>0&&this.getObstacle().getHealth()>0){
                System.out.println("Vurmak için V veya Kaçmak için K");
                String selectCombat =scanner.nextLine().toUpperCase();
                if (selectCombat.equals("V")){
                    System.out.println("Sİz vurdunuz !");
                   this.getObstacle().setHealth(this.obstacle.getHealth()-this.getPlayer().getTotalDamage());
                    afterHit();
                    if (this.getObstacle().getHealth()>0){
                        System.out.println();
                        System.out.println("Canavar size vurdu !");
                        int obstacleDamage=this.getObstacle().getDamage()-this.getPlayer().getInventory().getArmor().getBlock();
                        if (obstacleDamage<0){
                            obstacleDamage=0;
                        }
                        this.getPlayer().setHealthy(this.getPlayer().getHealthy()-obstacleDamage);
                        afterHit();
                    }
                }else {
                    return false;
                }
            }
            if (this.getObstacle().getHealth()<this.getPlayer().getHealthy()){
                System.out.println("Düşmanı yendiniz.");
                System.out.println(this.getObstacle().getAward()+" Para kazandınız.");
                this.getPlayer().setMoney(this.getPlayer().getMoney()+this.getObstacle().getAward());
                System.out.println("GÜncel Paranız : "+this.getPlayer().getMoney());
            }else {
                return false;
            }
        }
        return true;

    }
    public void afterHit(){
        System.out.println("Canınız : "+this.getPlayer().getHealthy());
        System.out.println(this.getObstacle().getName()+ " Canı : "+this.getObstacle().getHealth());
        System.out.println();
    }
    public void playerStats(){
        System.out.println("Oyuncu Değerleri : ");
        System.out.println("------------------------------");
        System.out.println("Sağlık : "+this.getPlayer().getHealthy());
        System.out.println("Sİlah : "+this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Zırh : "+this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Bloklama : "+this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Hasar : "+this.getPlayer().getTotalDamage());
        System.out.println("Para : "+this.getPlayer().getMoney());


    }
    public void obstacleStats(int i){
        System.out.println(i+" . "+this.getObstacle().getName()+ " Değerleri");
        System.out.println("--------------------------------");
        System.out.println("Sağlık : "+this.getObstacle().getHealth());
        System.out.println("Hasar : "+this.getObstacle().getDamage());
        System.out.println("Ödül : "+this.getObstacle().getAward());
    }
public int randomObstacleNumber(){
    Random r=new Random();
    return r.nextInt(this.getMaxObstacle())+1;
}
    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }
}
