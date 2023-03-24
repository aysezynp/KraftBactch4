package day14_NestedWhileDoWhile;

import java.util.Scanner;

public class T15_0_1000ArasiSayi {
    public static void main(String[] args) {
       /* Kullanıcıdan 0 ile 1000 arasında bir sayı isteyin. Kullanıcın
        girdiği sayı dahil . 0 dan başlayarak kullanıcının girdiği sayıya kadar
        olan tamsayıların toplamını ekrana yazdıran programı yazınız*/
        Scanner scan=new Scanner(System.in);

        System.out.print ("Lütfen 0 ile 1000 arasında bir tam sayi giriniz: ");
        int sayi=scan.nextInt();
        int toplam=0;
        int i=0;
        while(i<=sayi){
            toplam+=i;
              i++;}
            System.out.println(toplam);


        }



    }

