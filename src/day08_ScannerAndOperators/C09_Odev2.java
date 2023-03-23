package day08_ScannerAndOperators;

import java.util.Scanner;

public class C09_Odev2 {

    public static void main(String[]args){

        //Bir java programı yazın number1, number2,number3 ve
        //sum şeklinde 4 değişkenimiz olsun. Program sayıların
        //toplamınıversin. Konsolda aşağıdakigibi bir çıktıalın.
        //Sample output:
        Scanner scan = new Scanner (System.in);

        System.out.println ("number1 giriniz:");
        int number1= scan.nextInt();
        System.out.println("number 2 giriniz:");
        int number2= scan.nextInt();
        System.out.println("number3 giriniz:");
        int number3= scan.nextInt();
        int sum= number1+number2+number3;

        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);
        System.out.println("number3 = " + number3);
        System.out.println(number1+"+"+ number2+"+"+number3+"="+sum);









    }



}
