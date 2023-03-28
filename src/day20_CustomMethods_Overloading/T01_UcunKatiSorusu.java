package day20_CustomMethods_Overloading;

import java.util.Scanner;

public class T01_UcunKatiSorusu {
    public static void main(String[] args) {
    metot();

    }
   public static void metot(){
    Scanner scan=new Scanner(System.in);
    System.out.print("Lütfen bir sayı giriniz\nSayı 1:");
    int num1=scan.nextInt();
    System.out.print("Lütfen bir sayı giriniz\nSayı 2:");
    int num2= scan.nextInt();
    if (num2%3!=0){
        num2=ucunKatı(num2);
        System.out.println("3 ün katı Sayı 2: " + num2);
        metot(num1,num2);
   }else
         metot(num1,num2);
    }

     public static int ucunKatı(int num3){
        int num4=3*num3;
       if (num3%3!=0)
           num3=num4;
       return num4;
           }

     public static void metot(int num1,int num2){
        System.out.println(num1+num2);
           }




}

