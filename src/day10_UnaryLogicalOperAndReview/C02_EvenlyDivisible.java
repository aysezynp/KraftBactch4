package day10_UnaryLogicalOperAndReview;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C02_EvenlyDivisible {
    public static void main (String[]args){
        Scanner scan=new Scanner (System.in);
        System.out.print("Lütfen bir sayı giriniz:");
        int number=scan.nextInt();
        boolean isDvisibleby2= number%2==0;
        boolean isDvisibleby3=number%3==0;
        boolean isDvisibleby5=number%5==0;
        System.out.println(number+" is divisible by two: "+ isDvisibleby2);
        System.out.println(number+" is divisible by three: " +isDvisibleby3);
        System.out.println(number+" is divisible by five: " +isDvisibleby5);












        /*2. Create a class called C01_EvenlyDivisible,and write a program that gets an integer number from user
                check if a number is evenly divisible by 2, 3, 5

        Ex:
        number = 65;*/
    }
}
