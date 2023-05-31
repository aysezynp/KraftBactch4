package day42_StaticAndInheritance;
import static java.lang.Math.*;//Static olmak zorunda
public class MainClass {
    public static void main(String[] args) {

     A a=new A();
        System.out.println(a.normalVariable);
         a.normalMethod();

     /*   B b=new B();
        B b1=new B();
        B b2=new B(5);

     Math.pow(4,5);
       pow(4,5);*/


     //INHERITANCE(animal ve bird classları)

       /* Animal animal=new Animal();
        Bird bird=new Bird();
        bird.name="yakup";
        bird.yemekYe();
        bird.uc();*/

        Papagan papagan=new Papagan();
        Bird bird=new Bird();
        Animal animal=new Animal();


        Child child=new Child("ali","tester");
        System.out.println(child.name);
        System.out.println(child.meslek);
    }
}
