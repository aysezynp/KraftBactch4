package day44_FinalAndHiding;

public class C1 extends B1 {
    int c=10;
    static {
        System.out.println("C static blok çalıştı");
    }
    {
        System.out.println("C instance blok çalıştı");
    }
    public C1(){
        System.out.println("C const. çalıştı");
    }
}
