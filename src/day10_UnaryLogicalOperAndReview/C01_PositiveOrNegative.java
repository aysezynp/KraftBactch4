package day10_UnaryLogicalOperAndReview;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C01_PositiveOrNegative {

    public static void main(String[]args){
        /*Create a class called C01_PositiveAndNegative, and  write a program that can identify if the user entered number is
        positive, or negative or zero.
                Ex:
        number = 200*/


        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen sayı giriniz:");
        int number = scan.nextInt();
        boolean b1= number>0;
        boolean b2= number<0;
        boolean b3= number==0;
        System.out.println(number+ " is positive number:"+b1);
        System.out.println(number+" is negative number:"+b2);
        System.out.println(number+" is zero:"+b3);




    }
}
