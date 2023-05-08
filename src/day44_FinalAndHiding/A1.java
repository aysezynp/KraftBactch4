package day44_FinalAndHiding;

public class A1 {
    int a=20;
    static {
        System.out.println("A static blok çalıştı");
    }
    {
        System.out.println("A instance blok çalıştı");
    }
    public A1(){
        System.out.println("A const. çalıştı");
     }
}
