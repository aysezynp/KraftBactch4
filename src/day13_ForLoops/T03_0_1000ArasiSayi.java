package day13_ForLoops;

import java.util.Scanner;

public class T03_0_1000ArasiSayi {
    public static void main(String[] args) {
         //Kullanıcıdan 0 ile 1000 arasında bir sayı isteyin. Kullanıcı
        // girdiği sayı dahil . 0 dan başlayarak kullanıcının girdiği sayıya kadar
        //olan tamsayıların toplamını ekrana yazdıran programı yazınız.

        Scanner scan= new Scanner(System.in);
        System.out.print
                ("Lütfen 0 ile 1000 arasında bir tam sayi giriniz: ");
        int sayi=scan.nextInt();
        int toplam=0;

        for(int i=0; i<=sayi;i++){
            toplam=toplam+i;}

        System.out.println("Toplam= "+ toplam);


           }
}
