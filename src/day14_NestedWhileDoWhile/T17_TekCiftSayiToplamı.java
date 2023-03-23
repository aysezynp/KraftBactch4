package day14_NestedWhileDoWhile;

import java.util.Scanner;

public class T17_TekCiftSayiToplamı {
    public static void main(String[] args) {
       /* Kullanıcıdan 0 ile 1000 arasında bir sayı isteyin. Kullanıcın
        girdiği sayı dahil . 0 dan başlayarak kullanıcının girdiği sayıya kadar
        tek ve çift tamsayıların toplamını ayrı ayrı ekrana yazdıran programı
        yazınız*/

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir sayı yazınız:");
        int sayi= scan.nextInt();
        int ciftSayiToplamı=0;
        int tekSayiToplami=0;
        int i=0;
        int j=0;
        while(i<=sayi){
            if (i%2==0){
                ciftSayiToplamı+=i;}
            i++;}
            System.out.println("Çift sayıların Toplamı = " + ciftSayiToplamı);

        while(j<=sayi){
            if (j%2!=0){
                tekSayiToplami+=j;}
            j++;}
        System.out.println("Tek sayıların Toplamı = "+ tekSayiToplami);

        System.out.println(sayi+" sayısına kadar olan çift sayıların toplamı "+ciftSayiToplamı+" tek sayıların toplamı "+tekSayiToplami+"'dur.");

    }
        }







