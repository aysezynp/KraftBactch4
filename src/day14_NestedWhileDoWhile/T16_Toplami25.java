package day14_NestedWhileDoWhile;

import java.util.Scanner;

public class T16_Toplami25 {
    public static void main(String[] args) {
        /*Kullanıcıdan 2 adet sayı alın ve bunları toplayın 2 sayısının
        toplamı 25 ise programdan çıkış işlemi gerçekleştirin. 25 değil ise
        program kullanıcıdan iki sayı almaya devam etsin*/
        Scanner scan=new Scanner(System.in);

        int sayi1=0;
        int sayi2=0;
        int sum=sayi1+sayi2;

        while(sum!=25){
            System.out.print ("Lütfen bir sayı giriniz:");
            sayi1=scan.nextInt();
            System.out.print ("Lütfen bir sayı giriniz:");
            sayi2= scan.nextInt();
            sum=sayi1+sayi2;
            System.out.println(sum);
        }

    }

    }

