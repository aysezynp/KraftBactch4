package day10_UnaryLogicalOperAndReview;

import java.util.Scanner;

public class C03_SwapVariables {
    public static void main (String[]args){

   /* int a=10;
    int b=15;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
       int temp=a;

        a=b;
        b=temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);*/
        Scanner scan=new Scanner (System.in);
        System.out.print ("a sayısı için bir tamsayı giriniz:");
        int a=scan.nextInt();
        System.out.print("b sayısı için bir sayı giriniz:");
        int b= scan.nextInt();
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);



    }





}
