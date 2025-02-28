package DesignPattern.Visitor.Pratik4;

import java.util.ArrayList;
import java.util.List;

/*
Önerilen Senaryo
Bir müzik festivalinde farklı türde biletler var:

Standart Bilet: Temel giriş sağlar.
VIP Bilet: Standart bilet özelliklerine ek olarak yemek ve içecek kuponları içerir.
Backstage Bilet: VIP özelliklerine ek olarak sahne arkası erişim sağlar.
Her bilet türünün farklı bir fiyatı vardır ve festivalin düzenleyicisi toplam gelir ve kişi başına ortalama gelir gibi istatistikleri görmek istiyor.
 */
public class Main {
    public static void main(String[] args) {

        //Bilet listesini oluştur

        List<Ticket> tickets=new ArrayList<>();
        tickets.add(new StandartTicket("Ahmet"));
        tickets.add(new VIPTicket("Elif"));
        tickets.add(new BackstageTicket("Can"));
        tickets.add(new StandartTicket("Zeynep"));
        tickets.add(new VIPTicket("Mert"));

        FestivalStatistics statistics=new FestivalStatistics();

        for (Ticket ticket : tickets){
            ticket.accept(statistics);
        }

        statistics.displayStatistics();
    }
}
