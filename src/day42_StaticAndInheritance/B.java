package day42_StaticAndInheritance;


public class B {
    public static int s = 3;
    public int z=5;//normalde böyle atama yapmıyoruz.
    public int n;

    static{
        System.out.println("Blok1 çalıştı");
    }
    {
        System.out.println("Blok2 çalıştı");
    }

    public B() {

        System.out.println("boş con. çalıştı");
    }

    public B(int n){
        this.n=n;

        System.out.println("dolu con. çalıştı");
    }


}
