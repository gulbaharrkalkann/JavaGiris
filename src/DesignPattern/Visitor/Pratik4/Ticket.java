package DesignPattern.Visitor.Pratik4;

public abstract  class Ticket {
    private String ownerName;

    public Ticket(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public abstract void accept(TicketVisitor visitor);
}
