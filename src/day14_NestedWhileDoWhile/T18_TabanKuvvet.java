package day14_NestedWhileDoWhile;

import java.util.Scanner;

public class T18_TabanKuvvet {
    public static void main(String[] args) {
      /*  Kullanıcıdan taban ve kuvvet bilgilerini alarak ekrana sonucu
        yazdıran programı yazdırınız.(2 üzeri 4 =16) bu işlemleri sonuç 0
        olana kadar devam ettirin. Sonuç 0 ise programdan çıkış işlemi
        yaptırın*/
        Scanner scan= new Scanner (System.in);
        int taban=0;
        int kuvvet=0;
        int sonuc=1;


        while(sonuc!=0){
        System.out.print("Taban giriniz:");
        taban= scan.nextInt();
        System.out.print("Kuvvet giriniz:");
        kuvvet= scan.nextInt();
        sonuc=(int)Math.pow(taban,kuvvet);

        System.out.println(taban+" üzeri " +kuvvet+ " = "+ sonuc);}





    }
}
