package day26_StringSoruÇözümü;

public class StringLab_1_7HocaCozum {
    public static void main(String[] args) {
        System.out.println("kelimeninIlkUcHarfi(\"MErhaba\") = " + kelimeninIlkUcHarfi("Merhaba"));
        System.out.println("kelimeninIlkUcHarfi(\"Ali\") = " + kelimeninIlkUcHarfi("Ali"));
        System.out.println("boslukDoldurYuzde(\" Mer haba \") = " + boslukDoldurYuzde(" Mer haba "));
        System.out.println("kelimeninYarisiDondur(\"sanayagı\") = " + kelimeninYarisiDondur("sanayagı"));
        System.out.println("kelimeninYarisiDondur2(\"sanatyagı\") = " + kelimeninYarisiDondur2("sanatyagı"));
        System.out.println("kelimedeIlkHarfDegistir(\"edirne\",\"e\",\"a\") = " + kelimedeIlkHarfDegistir("edirne", "e", "a"));
        System.out.println("kelimedeIlkHarfDegistir(\"kasaba\",\"a\",\"i\") = " + kelimedeIlkHarfDegistir("kasaba", "a", "i"));
        System.out.println("herHarfUcKere(\"Ali\") = " + herHarfUcKere("Ali"));
        System.out.println("herHarfAdetKere(\"Mehmet\",4) = " + herHarfAdetKere("Mehmet", 4));
        System.out.println("tekIndeksliSunString(\"MErhaba\",3) = " + tekIndeksliSubString("MErhaba", 3));
        System.out.println("ciftIndeksliSubString(\"MErhaba Dünya\",3,7) = " + ciftIndeksliSubString("MErhaba Dünya", 3, 7));
        System.out.println("karakterSay(\"Merhaba\",\"a\") = " + karakterSay("Merhaba", "a"));
        System.out.println("karakterSay2(\"Edirne\",'e') = " + karakterSay2("Edirne", 'e'));
        System.out.println("karakterSay3(\"edirne\",\"e\") = " + karakterSay3("edirne", "e"));
        System.out.println("harfiSil(\"merhaba\",\"a\") = " + harfiSil("merhaba", "a"));
        System.out.println("harfiSil2(\"Merhaba\",'a') = " + harfiSil2("Merhaba", 'a'));


    }

    //SORU1; Kullanıcıdan bir input alın ve girilen inputun ilk 3 harfini yazan , 3 kelimeden az
    //       ise inputu döndüren bir metot yazınız.

    public static String kelimeninIlkUcHarfi(String str) {
        if (str.length() < 3)
            return str;
        else
            return str.substring(0, 3);
    }

    //SORU 2;Kullanıcıdan bir dize sözcük alın ve her boşluğa % ibaresi ekleyin.

    public static String boslukDoldurYuzde(String str) {
        return str.replace(" ", "%");

    }

    //SORU 3; Kullanıcın girdiği eşit uzunlukta bir kelimenin 2. yarısını döndüren bir program
    //        yazdırın.
    //Sanayagı yagı
    //Mutluluk uluk

    public static String kelimeninYarisiDondur(String str) {
        return str.substring(str.length() / 2);

    }

    public static String kelimeninYarisiDondur2(String str) {
        if (str.length() % 2 == 0)
            return str.substring(str.length() / 2);
        else
            return str.substring(str.length() / 2 + 1);
    }

    public static String kelimeninYarisiDondur3(String str) {
        //sanatyagı
        //012345678                     int(5.0)=5
        // (int)Math.ceil(4,5)=5.0
        //4,5
        return str.substring((int) Math.ceil((double) str.length() / 2));

    }

    //SORU 4=Kullanıcıdan bir kelime , değiştirmek istediği harfi/harfleri ve yeni harfi/harfleri
    //       alan ve buna göre kelimede/dizede sadece ilk bulduğu yeri değiştiren metodu
    //       yazınız.


    public static String kelimedeIlkHarfDegistir(String str, String eski, String yeni) {
        return str.replaceFirst(eski, yeni);
    }

    //SORU 5:Kullanıcıdan bir kelime alın ve her harfini 3 defa yazdırın.
    //       Merhaba MMMeeerrrhhhaaabbbaaa
    //       Ali AAAllliii
    public static String herHarfUcKere(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 3; j++) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static String herHarfAdetKere(String str, int adet) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < adet; j++) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    //Tek index numarası alan substring metod yazınız.
    public static String tekIndeksliSubString(String str, int index) {
        String result = "";
        for (int i = index; i < str.length(); i++) {
            result += str.charAt(i);
        }
        return result;
    }

    //çift index numarası alan substring metod yazınız.
    public static String ciftIndeksliSubString(String str, int startIndex, int endIndex) {
        String result = "";
        for (int i = startIndex; i < endIndex; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    //SORU 6: Kullanıcıdan bir kelime ve bir karakter alın ve bu kelimenin istenen karakterin
    //        kaç adet olduğunu döndüren metodu yazınız. (büyük küçük harf göz ardı
    //        edilecek)
    //Ankara,a 3
    //Edirne,e 2

    public static int karakterSay(String str, String karakter) {
        return str.length() - str.replace(karakter, "").length();

    }

    public static int karakterSay2(String str, char c) {
        String x = c + "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equalsIgnoreCase(x)) {
                count++;
            }

        }return count;

    }
    public static int karakterSay3(String str,String c){
        str=str.toLowerCase();
        c=c.toLowerCase();
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals(c)){
                count++;
            }

        }return count;

    }
    //Soru 7: Kullanıcıdan bir kelime ve bir harf alın kelimenizin içinde bu harfin hepsi
    //          kaldırılmış şekilde string döndüren programı yazınız.
    //           (Merhaba, a) Merhb

    public static String harfiSil(String str, String c){//String c yerine char c olarak alırsak
       //String x=c+""; return de c  yerine x yazarsak
        return str.replace(c,"");
            }

    public static String harfiSil2(String str, char target){
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)!=target){
                result+=str.charAt(i);
            }

        }return result;

    }

}








