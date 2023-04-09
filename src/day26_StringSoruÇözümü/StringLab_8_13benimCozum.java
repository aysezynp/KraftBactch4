package day26_StringSoruÇözümü;

public class StringLab_8_13benimCozum {
    public static void main(String[] args) {
        System.out.println("kinKelimesi(\"kinlenmek\") = " + kinKelimesi("kinlenmek"));
        System.out.println("kinKelimesi(\"ekin ektim\") = " + kinKelimesi("ekin ektim"));
        System.out.println("kinKelimesi(\"keskin ilçesinden geçiyorum\") = " + kinKelimesi("keskin ilçesinden geçiyorum"));


        System.out.println("ilkIkiHarfSonundaVarMi(\"ankara\") = " + ilkIkiHarfSonundaVarMi("ankara"));
        System.out.println("ilkIkiHarfSonundaVarMi(\"salsa\") = " + ilkIkiHarfSonundaVarMi("salsa"));
        System.out.println("Soy isminiz: " + soyad(" Harun Kenan ÖZSOY "));
        System.out.println("yinelenenKarakteriSil(\"ananas\") = " + yinelenenKarakteriSil("ananas"));


    }
    //SORU 8: Kullanıcıdan bir kelime alın ve kin kelimesi başından veya ilk karakterden sonra
    //        gelip gelmediğini kontrol edin geliyorsa true gelmiyorsa false döndürün;
    //    Kinlenmek true
    //    Kin tutmak true
    //    Ekin ektim true
    //    Keskin ilçesinden geçiyorum false

    public static boolean kinKelimesi(String str) {
        str = str.toLowerCase();

        if (str.startsWith("kin") || str.substring(1, 4).equals("kin")) {
            return true;
        } else
            return false;
    }
    //SORU 9: Kullanıcıdan 2 kelime alın kısa kelime yi başta 2 defa uzun kelimeyi ortada 30
    //        defa kısa kelimeyi tekrar sonda 2 defa yazdıran metodu yazınız.

    public static String kisaKelimeBastaUzunKelimeOrtada(String str1, String str2, int ilkDongu, int ortaDongu, int sonDongu) {
        String result = "";
        if (str1.length() < str2.length()) {
            for (int i = 0; i < ilkDongu; i++) {
                result += str1;
            }
            for (int i = 0; i < ortaDongu; i++) {
                result += str2;
            }
            for (int i = 0; i < sonDongu; i++) {
                result += str1;
            }
        } else {
            for (int i = 0; i < ilkDongu; i++) {
                result += str2;
            }
            for (int i = 0; i < ortaDongu; i++) {
                result += str1;
            }
            for (int i = 0; i < sonDongu; i++) {
                result += str2;
            }
        }
        return result;

    }
    //SORU 10: Kullanıcıdan bir kelime veya söz alın ve ilk 5 karakterini yazdırın. 5 karakterin
    //         altında bir kelime girdiği taktirde 5 karaktere nokta ile tamamlayın.

    public static String ilkBesKarakter(String str, int karaktersayisi) {
        String result = str;
        if (str.length() <= karaktersayisi) {
            for (int i = str.length(); i < karaktersayisi; i++) {
                result += ".";
            }
            return result;
        }
            return str.substring(0, karaktersayisi);

    }
    //SORU 11.Kullanıcıdan bir kelime alın ve bu kelimenin ilk 2 harfi sonunda yer alıyorsa true
    //        almıyorsa false yazdırın.
    //Ankara false
    //Kafka true
    //Salsa true
    //Saksı false

    public static boolean ilkIkiHarfSonundaVarMi(String str){
        if(str==null||str.length()<2) return false;
        return str.substring(0, 2).equalsIgnoreCase(str.substring(str.length()-2, str.length()));

    }

    public static boolean ilkIkiHarfSonundaVarMi2(String str,int karakterSayisi){
        if(str==null||str.length()<karakterSayisi) return false;
        return str.substring(0, karakterSayisi).equalsIgnoreCase(str.substring(str.length()-karakterSayisi, str.length()));

    }

    //SORU 12. Kullanıcının konsoldan ad ve soyad bilgilerini konsoldan alın
    //         Ekrana "Soy isminiz ..(soyad).. dır." Yazan metodu yazınız

    public static String soyad(String str) {
      str=str.trim();
        int y = 0;
        for (int i = str.length(); i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                y = i;
                break;
            }
        }
        return str.substring(y-1);

    }

    //SORU 13. Kullanıcıdan bir dize sözcük alın ve yinelenen her karakteri kelimenizden
    //         çıkartarak sonuç döndüren metodu yazınız. (Büyük küçük duyarlı)

     public static String yinelenenKarakteriSil(String str){
        String result="";
        for(int i=0;i>str.length();i++){
            if(!result.contains(str.substring(i,i+1)))
                result+=str.substring(i,i+1);
        }return result;

     }

}
