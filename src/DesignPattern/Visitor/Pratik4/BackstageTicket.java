package DesignPattern.Visitor.Pratik4;

public class BackstageTicket extends Ticket{
    public BackstageTicket(String ownerName){
        super(ownerName);
    }

    @Override
    public void accept(TicketVisitor visitor) {
        visitor.visit(this);
    }
}
