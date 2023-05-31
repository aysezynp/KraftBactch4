package day56_JavaInterview;

public class C02_WrapperClass {
    public static void main(String[] args) {
        int a=99;
         byte b=33;

         a=b;
         b=(byte)a;


         Integer c=a;//Integer a int değer atabiliyorum
         c=a;
       //  c=b;//olmaz,Wrapper class uses its own data types

        char ch='%';
        Character ch1=ch;


        System.out.println("................................");

        String str="12345";
        int i=Integer.parseInt(str);
        System.out.println(i);

        Integer j=Integer.valueOf(str);
        System.out.println(j);

        System.out.println(Integer.max(9, 5));
        System.out.println(Integer.MAX_VALUE);
        System.out.println("Character.isDigit('5') = " + Character.isDigit('5'));
        System.out.println("Character.isLetter('S') = " + Character.isLetter('S'));


        int a1;//declaration
a1=100;//initialization/Assign



        System.out.println(a1);
    }



}
