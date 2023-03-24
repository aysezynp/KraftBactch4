package day13_ForLoops;


import java.util.Scanner;

public class C03_NegativePozitiveTernary {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print ("Lütfen bir sayı giriniz: ");
        int n=scan.nextInt();


        if(n>0){
            System.out.println("Pozitive number");
        }else if (n<0){
            System.out.println("Negative number");
        }else{
            System.out.println("Zero");}
        System.out.println("---------------------------------------");


String result= (n>0)? "Pozitive number":(n<0)? "negative number": "zero";
        System.out.println(result);




    }
}
