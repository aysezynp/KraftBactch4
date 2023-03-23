package day10_UnaryLogicalOperAndReview;

public class C04_UnaryOperators {
    public static void main (String[]args){
        int num1=+3;
        int num2=-2;
        System.out.println(num1>0);
        System.out.println(num2>0);

        System.out.println("----------------------------------------");

        int a = 10;
        ++a;// pre increment: sayının değerini hemen 1 artirıyor//a=11
        System.out.print(a);

        System.out.println("----------------------------------------");

        --a;//pre decrement: sayının değerini hemen 1 azaltıyor//a=10
        System.out.println("a = " + a);

        int b= 99;
        System.out.println(++b);//100

        int c=99;
        System.out.println(c++);//post increment c'yi konsola 99 yazdırcak ancak c=100;
        System.out.println(c);

        System.out.println("----------------------------------------");



        int x=201;
        System.out.println(--x);//pre decrement x=200;
        int y=201;
        System.out.println(y--);//post decrement y'yi konsola 201 y=200;
        System.out.println(y);


        System.out.println("----------------------------------------");
        int z=44;
        System.out.println(++z);//Pre increment 45 yazar ve  z=45
        System.out.println(z++);//post increment 45 yazar z=46
        System.out.println(z);

        int i=42;
        System.out.println(--i);//pre decrement 41 i=41
        System.out.println(i--);//post decrement 41 i=40
        System.out.println(i);

    }
}
