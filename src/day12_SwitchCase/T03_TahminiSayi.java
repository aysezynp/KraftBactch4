package day12_SwitchCase;

import java.util.Scanner;

public class T03_TahminiSayi {
    public static void main(String[] args) {
        int sayi=40;
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen tahmininizi yazınız(sayı tam bir sayıdır):");
        int tahmin=scan.nextInt();

        if (tahmin<sayi){
            if((sayi/2)<tahmin){
                System.out.println("Tahmininiz sayıdan küçük ama yakındır");}
            else if (tahmin<(sayi/2)){
                    System.out.println("Tahmininiz sayıdan küçük ve uzaktır");}
            }
        else if (tahmin>sayi){
            if((sayi*2)<tahmin){
                System.out.println("Tahmininiz sayıdan büyük ve uzaktır ");}
            else if((sayi*2)>tahmin){
                System.out.println(("Tahmininiz sayıdan büyük ama yakındır"));}
            }
        else {
            System.out.println("Sayıyı doğru tahmin ettiniz.TEBRİKLERRR.");
        }


        }








}
