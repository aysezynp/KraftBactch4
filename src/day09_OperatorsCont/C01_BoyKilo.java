package day09_OperatorsCont;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C01_BoyKilo {
    public static void main (String []args){

        Scanner input = new Scanner(System.in);

        System.out.println("Boyunuzu giriniz:");
        double boy = input.nextDouble();

        System.out.println("Kilonuzu giriniz");
        double kilo = input.nextDouble();


        System.out.println("Lütfen isminizi giriniz: ");
        String isim= input.next();

        input.nextLine();
        System.out.println("Soyisminizi giriniz: ");
        String soyİsim= input.nextLine();


        System.out.println(isim+ " Boyunuz : "+ boy+ " m Kilonuz: "+ kilo+ " kg");
















    }



}
