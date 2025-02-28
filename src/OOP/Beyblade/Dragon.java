package OOP.Beyblade;

public class Dragon extends Beyblade{
    private String kutsalCanavar;
    private String gizliYetenek;

    public Dragon(String beybladeci,int donusHizi,int saldiriGucu,String kutsalCanavar,String gizliYetenek){
        super(beybladeci,donusHizi,saldiriGucu);
        this.kutsalCanavar=kutsalCanavar;
        this.gizliYetenek=gizliYetenek;
    }
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal Canavar Adı : "+kutsalCanavar);
        System.out.println("Gizli Yetenek : "+gizliYetenek);
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybleydci()+" "+kutsalCanavar+" ı ortaya çıkarıyor..");
        System.out.println(getBeybleydci()+"nin Saldırısı : Hayalet Kasırgası ");
    }

}


