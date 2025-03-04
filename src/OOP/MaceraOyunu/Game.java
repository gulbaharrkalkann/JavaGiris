package OOP.MaceraOyunu;

import java.util.Scanner;

public class Game {
    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Macera Oyununa hoşgeldiniz");
        System.out.println("Lütfen bir isim giriniz : ");
        String playerName = scanner.nextLine();

        Player player = new Player(playerName);
        System.out.println("Sayın" + player.getName() + " Bu karanlık ve sisli adaya Hoşgeldiniz.");
        System.out.println("Lütfen bir karakter seçiniz.");
        player.selectChar();
        Location location=null;
        while (true) {
player.printInfo();
            System.out.println("Bölgeler");
            System.out.println("1-Güvenli Ev --> Burası sizin için güvenli bir ev,Düşman yoktur");
            System.out.println("2-Eşya Dükkanı --> Silah veya zırh satın alabilirsiniz.");
            System.out.println("3-Mağara --> Ödül *Yemek* Dikkatli ol canavar çıkabilir.");
            System.out.println("4-Orman --> Ödül *Odun* Dİkkatli ol karşına vampir çıkabilir.");
            System.out.println("5-Nehir --> Ödül *Su* Dikkatli ol burada karşına ayı çıkabilir.");
            System.out.println("0- Çıkış Yap --> Oyundan çıkış yapılıyor");
            System.out.print("Gitmek istediğiniz bölgeyi seçiniz :");
            int selectLocation = scanner.nextInt();
            switch (selectLocation) {
                case 0:
                    location=null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location=new Cave(player);
                    break;
                case 4:
                    location=new Forest(player);
                    break;
                case 5:
                    location=new River(player);
                    break;

                default:
                    System.out.println("Lütfen geçerli bir bölge giriniz.");
            }
            if (location==null){
                System.out.println("Bu karanlık ve sisli adadan çabuk vazgeçtin");
                break;
            }
            if (!location.onLocation()){
                System.out.println("Game Over");
                break;
            }

        }
    }
}
