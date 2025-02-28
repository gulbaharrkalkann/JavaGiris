package DesignPattern.Visitor.Pratik4;

import java.util.ArrayList;
import java.util.List;

public class FestivalStatistics implements TicketVisitor{
    private int totalRevenue=0;
    public int ticketCount=0;
    private List<String> ticketOwners=new ArrayList<>();

    @Override
    public void visit(StandartTicket standartTicket) {
        totalRevenue+=100;
        ticketCount++;
        ticketOwners.add(standartTicket.getOwnerName());
    }

    @Override
    public void visit(VIPTicket vipTicket) {
        totalRevenue+=200;
        ticketCount++;
        ticketOwners.add(vipTicket.getOwnerName());

    }

    @Override
    public void visit(BackstageTicket backstageTicket) {
totalRevenue+=500;
ticketCount++;
ticketOwners.add(backstageTicket.getOwnerName());



    }

    //İstatistikleri görmek için metod
    public void displayStatistics(){
        System.out.println("Toplam gelir : "+totalRevenue+" $");
        System.out.println("Satılan Bilet Sayısı : "+ticketCount);
        System.out.println("Bilet Sahipleri : "+ticketOwners);
    }


}
