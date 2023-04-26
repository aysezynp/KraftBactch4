package day39_ConstructorOverloading;

public class C01_StudentObjects {
    public static void main(String[] args) {
        Student student1 = new Student("mehmet", 25, 'm', 95, 123456);
        System.out.println((student1.name));

        System.out.println(student1);

        Student student2=new Student("ali",23,'f',76,12458);
        System.out.println(student2.name);
        System.out.println(student2);
    }
}
