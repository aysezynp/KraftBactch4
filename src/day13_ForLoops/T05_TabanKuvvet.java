package day13_ForLoops;

import java.util.Scanner;

public class T05_TabanKuvvet {

    public static void main(String[] args) {
        //Kullanıcıdan taban ve kuvvet bilgilerini alarak ekrana sonucu
        //yazdıran programı yazdırınız.(2 üzeri 4 =16)

        Scanner scan = new Scanner(System.in);
        System.out.print("Taban giriniz:");
        int taban = scan.nextInt();
        System.out.print("Kuvvet giriniz:");
        int kuvvet = scan.nextInt();
        int sonuc = 1;

        for (int i = 0; i < kuvvet; i++) {
            sonuc *= taban;
        }
        if(kuvvet==0&&taban==0){
            System.out.println("Tanımsız");
        }else

        {

            System.out.println(taban + " üzeri " + kuvvet + " = " + sonuc);
        }


    }

}