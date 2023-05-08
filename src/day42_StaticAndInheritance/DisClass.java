package day42_StaticAndInheritance;

public class DisClass {
    public static int a=4;



    public class icClass{
       public static int b=5;



    }



}
class Main{
    public static void main(String[] args) {
        System.out.println(DisClass.a);
        System.out.println(DisClass.icClass.b);

    }
}