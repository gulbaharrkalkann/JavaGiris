package DesignPattern.Visitor.Pratik4;

public interface TicketVisitor {
    void visit(StandartTicket standartTicket);
    void visit(VIPTicket vipTicket);
    void visit(BackstageTicket backstageTicket);
}
