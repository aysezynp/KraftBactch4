package day12_SwitchCase;

import java.util.Scanner;

public class T02_5_25_50 {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.print("Lütfen bir sayı giriniz:");
        int sayi=scan.nextInt();

        if(sayi>5){
                System.out.println("sayi 5'ten büyüktür.");
            if (5<sayi&&sayi<25){
                System.out.println("sayi 5'den büyük 25'ten küçüktür");}
            else if(sayi>25){
                System.out.println("Sayı hem 5 hem de 25'ten büyüktür");
                if(sayi>50){
                    System.out.println("Sayı hem 5 hem 25 hem de 50 den büyüktür");}
            }
        }










    }
}
