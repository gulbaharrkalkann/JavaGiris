package OOP.Interface.Pratik3;

public class BBankasi implements IBanka {
    private String bankaAdi;
    private String terminalId;
    private String password;

    public BBankasi(String bankaAdi,String terminalİd,String password){
        this.bankaAdi=bankaAdi;
        this.terminalId=terminalId;
        this.password=password;
    }



    public String getBankaAdi() {
        return bankaAdi;
    }

    public void setBankaAdi(String bankaAdi) {
        this.bankaAdi = bankaAdi;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    @Override
    public boolean connect(String ipAddress) {
        System.out.println("Kullanıcı ip : "+ipAddress);
        System.out.println("Makina ip : "+hostIpAddress);
        System.out.println(this.bankaAdi+" Bağlanıldı");

        return false;
    }

    @Override
    public boolean payment(double price, String cardNumber, String date, String cvc) {
        System.out.println("Bankadan cevap bekleniyor");
        System.out.println("İşlem başarılı oldu");

        return false;
    }
}



