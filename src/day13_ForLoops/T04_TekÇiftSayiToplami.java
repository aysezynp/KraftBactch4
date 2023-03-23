package day13_ForLoops;

import java.util.Scanner;

public class T04_TekÇiftSayiToplami {

        public static void main (String[]args){
            //Kullanıcıdan 0 ile 1000 arasında bir sayı isteyin. Kullanıcın
            //girdiği sayı dahil . 0 dan başlayarak kullanıcının girdiği sayıya kadar
            //tek ve çift tamsayıların toplamını ayrı ayrı ekrana yazdıran programı
            //yazınız.
            Scanner scan = new Scanner(System.in);
            System.out.print ("Lütfen 0 ile 1000 arasında bir tam sayi giriniz: ");
            int sayi = scan.nextInt();
            int tekToplam=0;
            int ciftToplam=0;

           for (int i=0; i<=sayi;i+=2){
               ciftToplam+=i;}
            System.out.println("Çift sayıların Toplamı = " + ciftToplam);
            for (int i=1; i<=sayi;i+=2){
                tekToplam+=i;}
            System.out.println("Tek Sayıların Toplamı = " + tekToplam);










        }
}