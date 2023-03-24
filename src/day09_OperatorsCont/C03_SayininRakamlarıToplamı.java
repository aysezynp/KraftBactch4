package day09_OperatorsCont;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C03_SayininRakamlarıToplamı {

    public static void main(String[] args) {
        //Kullanicidan 3 basamakli bir sayi alin
        // ve sayinin rakamlar toplamini yazdirin

        Scanner scan=new Scanner (System.in);
        System.out.println("Lütfen 3 basamakli pozitif bir sayı giriniz");

        int number=scan.nextInt(); //142---> 1+4+2;
        int lastDigit= number%10; //2
        int totalOfDigit= lastDigit;

        number=number/10;//14
        lastDigit= number%10;//4
        totalOfDigit=totalOfDigit+ lastDigit;//2+4=6

        number=number/10;//14/10=1
        lastDigit=number%10;//1
        totalOfDigit= totalOfDigit+lastDigit; //6+1=7

        System.out.println("Girilen sayinin rakamlar toplamı "+ totalOfDigit);










    }




}
