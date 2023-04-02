package day24_StringClass_Cont;

import java.util.Scanner;

public class T04_TwoString {
    public static void main(String[] args) {
        //1.yol; System.out.println(kelime());
        boolean flag = true;
          while(flag) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Kelime 1: ");
            String kelime1 = scan.nextLine();
            System.out.print("Kelime 2: ");
            String kelime2 = scan.nextLine();
              flag=!soru5(kelime1,kelime2);
        }
    }


    /*Bir method yazın dönüş tipi olsun kullanıcıdan 2 string istesin ve
    eğer stringlerin length i eşitse girdiğiniz kelimelerin karekter
    sayısı eşit mesajı döndürsün eğer aynı stringler gönderildiyse, bu
    kelimeler aynı mesajı döndürsün. Kelimeler her anlamda farklı
    ise kullanıcıyı aynı sürece sokun*/


    //1.yol
        public static String kelime() {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Kelime 1: ");
            String kelime1 = scan.nextLine();
            System.out.print("Kelime 2: ");
            String kelime2 = scan.nextLine();
            if (kelime1.equals(kelime2)) {
                return "Girdiğiniz kelimeler aynıdır.";
            } else if ((kelime1.length() == kelime2.length())) {
                return "Girdiğiniz kelimelerin karakter sayısı eşittir.";
            } else {
                continue;
            }

        }

    }

    public static boolean soru5(String kelime1, String kelime2) {
        if(kelime1.equals(kelime2)) {
            System.out.println("Girdiğiniz kelimeler aynıdır.");
            return true;
        }else if ((kelime1.length() == kelime2.length())) {
            System.out.println("Girdiğiniz kelimelerin karakter sayısı eşittir.");
            return true;
        }else{
            System.out.println("Kelimeler aynı değil ve uzunlukları aynı değil");
        }
        return false;
    }
}