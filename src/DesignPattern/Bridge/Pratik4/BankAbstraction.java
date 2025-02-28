package DesignPattern.Bridge.Pratik4;

abstract class BankAbstraction {
    protected MoneyAccountAbstraction account;
    abstract void depositUsd(double amount);
    abstract void depositEuro(double amount);

    public BankAbstraction(MoneyAccountAbstraction account){
       super();
       this.account=account;
    }
}
