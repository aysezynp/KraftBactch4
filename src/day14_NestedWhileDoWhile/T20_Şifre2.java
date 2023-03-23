package day14_NestedWhileDoWhile;

import java.util.Scanner;

public class T20_Şifre2 {

    public static void main(String[] args) {
        /*Şifre tanımlayın ve kullanıcıya ekrandan 5 defa şifreyi
        girmesini isteyin. Şifreyi bulursa «tebrikler şifre doğru» yazısı
        gösterildikten sonra programdan çıkış işlemi gerçekleşsin.
        Her bulamadığında şifre doğru değildir … hakkınız kalmıştır. Lütfen
        tekrar deneyin ikazı çıksın. Sonuncuda hakkınız kalmamıştır yazısı
        çıkarak programı sonlandırın*/

        Scanner scan = new Scanner(System.in);
        String sifre = "Bahar";
        String tahmin = "";
        int hak = 5;

        System.out.println("Parolayı tahmin ediniz toplam 5 hakkınız var");
        while (0 < hak) {
            System.out.println("Lütfen şifreyi giriniz:");
            tahmin = scan.nextLine();
            if (tahmin.equals(sifre)) {
                System.out.println("Tebrikler şifre doğru");
                break;
            } else {
                System.out.println("Şifre doğru değildir. " + --hak + " hakkınız kalmıştır.");
                if(hak==0){System.out.println("Hakkınız kalmamıştır.");}
            }

        }
    }
}
