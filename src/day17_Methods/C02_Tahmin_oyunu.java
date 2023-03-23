package day17_Methods;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class C02_Tahmin_oyunu {
    public static void main(String[] args) {
        // Bilgisayarın tuttuğu 0 dahil-50 arası sayıyı 5 hamlede bulma
        //tuttuğu sayıdan düşük bir tahmin yaparsak yukarı
        //tuttuğu sayıdan yüksek bir tahmin yaparsak aşağı

        Scanner scan=new Scanner(System.in);
        Random random=new Random();
        int sayi=random.nextInt(50);
        System.out.println(sayi);
        int i=1;
        while(i<=5){
            System.out.println(i+".Tahmin:");
            int tahmin=scan.nextInt();
            if(tahmin>sayi&&i!=5){
                System.out.println("Aşağı");
            } else if(tahmin<sayi&&i!=5){
                System.out.println("Yukarı");
            }else if (tahmin==sayi){
                System.out.println("Tebrikler");

        }i++;
            if (i==6) {
                System.out.println("Maalesef bilemedin tuttuğum sayı:" +sayi);

            }

        }





















    }
}
