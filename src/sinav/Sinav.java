package sinav;

public class Sinav {
    public static void main(String[] args) {
        System.out.println("sayitoplam(20) = " + sayitoplam(20));
        System.out.println("harfAdet(\"merhaba\",'a') = " + harfAdet("merhaba", 'a'));
        System.out.println("faktoriyelHesapla(5) = " + faktoriyelHesapla(5));
        System.out.println("concat(\"emel\",\"gel\") = " + concat("emel", "gel"));
        System.out.println("concat(\"emel\",\"eve\",\"gel\") = " + concat("emel", "eve", "gel"));
        System.out.println("polindrome(\"kelek\") = " + polindrome("kelek"));
        System.out.println("kontrol(\"ahmet\",\"AHmet\") = " + kontrol("ahmet", "AHmet"));
        System.out.println(kontrol("ahmet", "ahmet"));

    }

    //Soru 1=Kullanıcının girdiği sayısal bir ifadeyi alan ve 1den başlayarak girilen sayı
    //dahil toplamını veren metodu yazınız.

    public static int sayitoplam(int num) {
        int result = 0;
        for (int i = 1; i <= num; i++) {
            result += i;
        }
        return result;
    }
    //Soru 3:Kullanicidan bir String bir de char deger alin. Stringin icinde kac tane char
    //       oldugunu donen bir metodla sayiyi hesaplatin. Stringde kac adet o harften
    //       oldugunu da asagidaki formatta ekrana yazdirin. İpucu: length(),

    public static int harfAdet(String str, char ch) {
        String k = ch + "";
        return str.length() - str.replace(k, "").length();
    }

    //Soru 4:Girilen sayının faktoriyelini döndüren bir metot yazını

    public static int faktoriyelHesapla(int sayi) {
        int faktoriyel = 1;
        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i;
        }
        return faktoriyel;
    }
    //Soru 5:Concat işlemi yapan 2 adet ve 3 adet değer alacak iki farklı overloading metot
    //       yazınız.

    public static String concat(String str1, String str2) {
        return str1.concat(str2);
    }

    public static String concat(String str1, String str2, String str3) {
        return (str1.concat(str2)).concat(str3);
    }

    //Soru 6: Girilen kelimenin polindrom olup olmadığını kontrol eden bir metot yazınız.
    public static boolean polindrome(String str) {
        String reversed = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reversed += str.substring(i, i + 1);
        }
        return reversed.equalsIgnoreCase(str);
    }

    //soru 7:equalsIgnorecase() metodunu kullanmadan girilen 2 string türündeki değeri
    //       büyükküçük harfleri baz almadan kontrol eden bir metot yazınız.
     public static boolean kontrol(String str1, String str2) {
     return str1.toLowerCase().equals(str2.toLowerCase());

    }

}


