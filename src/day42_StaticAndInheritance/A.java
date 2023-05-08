package day42_StaticAndInheritance;
//Static değişken-metot ile normal yani objeye ait değişken-metot arasındaki far

public class A {
    public static String staticVariable="Harun";
    public String normalVariable;


    public static void staticMethod(){
        //normalMethod;
        //System.out.println(normalVariable);
//Static metodler class ait old. için altında normal metot ve değişkenler kullanılamaz.
        String staticVariable;
        System.out.println("ben bir static metodum");

    }
    public void normalMethod(){
        System.out.println(normalVariable);
        staticMethod();
        System.out.println(staticVariable);
        System.out.println("ben bir normal metodum");
    }


}
