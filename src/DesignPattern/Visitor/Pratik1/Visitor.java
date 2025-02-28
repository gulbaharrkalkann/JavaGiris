package DesignPattern.Visitor.Pratik1;
//Visitor arayüzü her element türü için visit metodu içerir
public interface Visitor {
    void visitBook(Book book);//Book türündeki nesneler için bir davranış tanımlar
    void visitDVD(DVD dvd);//DVD türündeki nesneler için bir davranış tanımlar
}
