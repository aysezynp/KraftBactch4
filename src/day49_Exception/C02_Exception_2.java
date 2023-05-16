package day49_Exception;

import java.util.Scanner;

public class C02_Exception_2 {
    public static int count = 0;

    public static void main(String[] args) {
        // System.out.println("Koda başladı");
        //System.out.println(5 / 0);
        //System.out.println("kod bloğu devam ediyor.....");

     /*   System.out.println("0");
        try {
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            System.out.println(5/0);
            System.out.println("5");
        }catch (Exception e){
            System.out.println("6");
            try {
                System.out.println(5/0);
            }catch (Exception f){
                System.out.println("7");
            }

        }

        System.out.println("8");*/

        System.out.println(faktoriyel(1234567890));
      //  System.out.println(sayiGiris());
    }

    //faktöriyel hesabı yapan bir metod yazınız.

    public static int faktoriyel(int num) {
        try {
            int faktoriyel = 1;
            for (int i = 1; i <= num; i++) {
                faktoriyel *= i;
            }
            return faktoriyel;
        } catch (Exception e) {
            System.out.println("Hata:"+e.getMessage());
            return -1;
        }
    }

    //While ve for looplar kullanmadan 3 hak verin ve
    // int değeri doğru girmez ise kullanıcıya ikaz vererek programdan atın

    /*    public static int count = 0;// sayiGris metodo için kullanılmıştır
    public static int sayiGiris() {
          try {
              Scanner scan = new Scanner(System.in);
              System.out.print("Sayi: ");
              int sayi = scan.nextInt();
              return sayi;
          } catch (Exception e) {
              count++;
              if (count == 3) {
                  System.out.println("Hakkınız bitmiştir");
                  System.exit(0);
              }
              System.out.println((3-count)+"hakkınız kalmıştır, lütfen tekrar deneyiniz.");
              return sayiGiris();
          }
      }*/
    //Countu metodum dışında da kullanmak istiyorsam , countu metod içinde sıfırlayabilirim
    public static int sayiGiris() {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("Sayi: ");
            int sayi = scan.nextInt();
            count = 0;
            return sayi;
        } catch (Exception e) {
            count++;
            if (count == 3) {
                System.out.println("Hakkınız bitmiştir");
                count = 0;
                System.exit(0);
            }
            System.out.println((3 - count) + "hakkınız kalmıştır, lütfen tekrar deneyiniz.");
            return sayiGiris();
        }

    }
}