package day14_NestedWhileDoWhile;

import java.util.Scanner;

public class C01_MinumumNumber {
    public static void main(String[] args) {
         /*
Write a program that asks the user to enter a number for 5 times.
return the minumum number

 */

        Scanner scan = new Scanner(System.in);
        /*int min= Integer.MAX_VALUE;

        for (int i=1; i<=5;i++){

            System.out.println("Enter a num");
            int num=scan.nextInt();
            if(num<min){
                min=num;
            }

        }
        System.out.println("min="+min);*/
// 3 KERE OLSAYDI;

        int min= Integer.MAX_VALUE;
        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter a number: ");
            int num = scan.nextInt();
            if (num<min){
                min=num;
            }

        }
        System.out.println("min = " + min);
    }

}
































