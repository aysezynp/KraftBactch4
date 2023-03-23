package day3_MentöringTypeConversion_Castling;

public class _02_NarrowingCasting {
    public static void main(String[] args) {
       /* double deger= 5.8;
        int num=6;
        num = (int) deger;
        System.out.println(num);
        */
        /*double y= 2.3;
        short s= 2;
        y=s;
        System.out.println(y);
        s=(short)y;
        System.out.println("s = " + s);*/

        int a=128;// byte -128 de +127ye kadar toplam 257
        //265-257=9
        byte b=18;
        b= (byte)a;
        System.out.println("b = " + b);


    }
}
