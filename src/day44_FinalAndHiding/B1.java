package day44_FinalAndHiding;

public class B1 extends A1 {
    int b=10;
    static {
        System.out.println("B static blok çalıştı");
    }
    {
        System.out.println("B instance blok çalıştı");
    }
    public B1(){

        System.out.println("B const. çalıştı");
    }



}
