package day44_FinalAndHiding;

public class C extends B {
    int a = 5;

    void method() {
        System.out.println(a);
        //this.a ya da sadece a dersek bu classtaki a
        //yani 5 gelir.
    }

    void method1() {
        System.out.println(super.a);
        //bu a ise B classındaki  10 değerini verir, çünkü C'nin süper class B
    }

    //A ve B ve C classlarındak
     //değişkenlerin ismi farklı olursa this  ya da super keywordlerine ihtiyaç yok


    void metodC() {
        metodA();//super dersem de olur demesem de
        metodB();
        System.out.println(a);
    }
    void metodA() {
        System.out.println(super.a);
       //this. metodA();bu şekilde  yazarsam bu sınıftakiA metodu
        super.metodA();// A classındaki metod A
    }

}