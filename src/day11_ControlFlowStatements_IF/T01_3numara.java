package day11_ControlFlowStatements_IF;

import java.util.Scanner;

public class T01_3numara {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 3 numara giriniz");
        System.out.print("a sayısı: ");
        int a=scan.nextInt();
        System.out.print("b sayısı:");
        int b=scan.nextInt();
        System.out.print("c sayısı:");
        int c= scan.nextInt();

       if((a>=b)&&(a>=c)){
             System.out.println("En büyük sayı: "+ a);}
        else if((b>=a)&&(b>=c)){
             System.out.println("En büyük sayı: "+b);}
        else{
             System.out.println("En büyük sayı:" + c);
        }



 /*if(Math.max(a,b)==a&&Math.max(a,c)==a){
            System.out.println("En büyük sayı: "+ a);}
        else if((Math.max(a,b)==b&&Math.max(b,c)==b)){
            System.out.println("En büyük sayı: "+b);}
        else{
            System.out.println("En büyük sayı: "+ c);}*/

        }
    }

