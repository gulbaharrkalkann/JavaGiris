package DesignPattern.Visitor.Pratik4;

public class StandartTicket extends Ticket {

    public StandartTicket(String ownerName) {
        super(ownerName);
    }

    @Override
    public void accept(TicketVisitor visitor) {
        visitor.visit(this);
    }
}
