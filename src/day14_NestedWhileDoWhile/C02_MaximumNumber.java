package day14_NestedWhileDoWhile;


import java.util.Scanner;

public class C02_MaximumNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
//        Write a program that asks the user to enter a number for 5 times.
        //return the max number



        int max= Integer.MIN_VALUE;

        for(int i=1;i<=5;i++) {
            System.out.print("Enter a number:");
          int num= scan.nextInt();

          if (num>max){
              max=num;
          }

        }


        System.out.println("max = " + max);

    }














    }

