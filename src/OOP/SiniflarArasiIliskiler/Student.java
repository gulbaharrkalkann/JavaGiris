package OOP.SiniflarArasiIliskiler;

public class Student {
    private String name;
    private String surname;
    private String idNo;
    private String address;
    private int not;

    public Student(String name,String surname,String idNo,String address,int not){
        this.name=name;
        this.surname=surname;
        this.idNo=idNo;
        this.address=address;
        if (not>100||not<0){
            not=0;
        }
        this.not=not;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNot() {
        return not;
    }

    public void setNot(int not) {
        if (not>100||not<0){
            not=0;
        }
        this.not = not;
    }
}
