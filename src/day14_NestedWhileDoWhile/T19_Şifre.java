package day14_NestedWhileDoWhile;

import java.util.Scanner;

public class T19_Şifre {
    public static void main(String[] args) {
      /*  Şifre tanımlayın ve kullanıcıya ekrandan 5 defa şifreyi
        girmesini isteyin. Her bulamadığında şifre doğru değildir tekrar
        deneyin ikazı çıksın. Şifreyi bulursa «tebrikler şifre doğru» yazısı
        gösterildikten sonra programdan çıkış işlemi gerçekleşsin.*/
        Scanner scan=new Scanner(System.in);
        String sifre="Bahar";
        String tahmin= "";
        int hak=5;

        System.out.println("Parolayı tahmin ediniz toplam 5 hakkınız var");
        while(0<hak){
            System.out.println("Lütfen şifreyi giriniz:");
            tahmin=scan.nextLine();
           if(tahmin.equals(sifre)){
                System.out.println("Tebrikler şifre doğru");
                break;
            }else{
                System.out.println("Şifre doğru değildir. Tekrar deneyiniz.");
                hak--;
            }

        }












    }
}
