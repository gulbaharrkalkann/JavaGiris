package DesignPattern.Visitor.Pratik4;

public class VIPTicket extends Ticket{

    public VIPTicket(String ownerName) {
        super(ownerName);
    }

    @Override
    public void accept(TicketVisitor visitor) {
        visitor.visit(this);
    }
}
