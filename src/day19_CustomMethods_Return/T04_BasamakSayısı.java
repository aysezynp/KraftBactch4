package day19_CustomMethods_Return;

import java.util.Scanner;

public class T04_BasamakSayısı {
    public static void main(String[] args) {
        System.out.println("basamakSayisi(1284) = " + basamakSayisi(1284));
        System.out.println("basamakSayisi(132898) = " + basamakSayisi(132898));


    }

    /**
     * Kullanıcı tarafından girilen sayının kaç basamaklı olduğunu buln metot
     * @param sayi
     * @return
     */
    public static int basamakSayisi(int sayi) {
        int basamaksayisi = 0;
        while (sayi != 0) {
            sayi /= 10;
            basamaksayisi++;
        }
       return basamaksayisi;

    }

}
