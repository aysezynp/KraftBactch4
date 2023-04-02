package day24_StringClass_Cont;

import java.util.Scanner;

public class C01_StringReview {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("isminizi giriniz");
        String isim=scan.nextLine();

        // Yavuz Selim
        //ismin son harfini al
        // length(),charAt()

        int uzunluk=isim.length();
        char sonHarf=isim.charAt(uzunluk-1);//toplam karakter sayısından 1 çıkarıp sonindeksi buluyorum

        //equals()
        System.out.println(isim==" Yavuz Selim "); //false referanslar farklı
        System.out.println(isim.equals(" Yavuz Selim ")); //true
        System.out.println(isim.equalsIgnoreCase(" Yavuz SeLim ")); //true

        //toUpperCase toLowerCase
        System.out.println(isim.toLowerCase());
        System.out.println(isim.toUpperCase());

        //trim()
        System.out.println(isim.trim());
        System.out.println(isim);

        //indexOf
        System.out.println(isim.indexOf("S"));
        System.out.println(isim.indexOf("Selim"));



     //replace
        System.out.println(isim.replace(" ", ""));
        System.out.println(isim.replace("vuz", "giz"));
        String message="Merhaba";
        System.out.println(message);
        System.out.println(message.replace('a', 'e'));
        System.out.println(message.replaceFirst("a", "e"));


    }



}
