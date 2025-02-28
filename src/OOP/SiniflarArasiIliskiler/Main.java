package OOP.SiniflarArasiIliskiler;

public class Main {
    public static void main(String[] args) {

        Student st1=new Student("gül","kalkan","427649","AA",100);
        Student st2=new Student("Seyithan","Bozkurt","427676","BB",100);
        Student st3=new Student("kübra","mercan","427654","Sugar",55);

       Instructor teacher=new Instructor("Mahmut","Çetindağ","CENG");



        Course mat=new Course("Mat-101","MAT",teacher);
        System.out.println(mat.getInstructor().getName());
        Student[] stu={st1,st2,st3};

        System.out.println("Ortalama : "+mat.calcAvarage(stu));
    }
}
