package day24_StringClass_Cont;

public class T08_IsminBasHarfiSoyIsimde {
    public static void main(String[] args) {

        //İsminizin baş harfi soyadınızda varsa soy adınızı isminizin
        //baş harfinden arındırıp yazdıran bir method oluşturun

        System.out.println("isimSoyisim(\"Ayşe\", \"KARAKAYA\") = " + isimSoyisim("Ayşe", "KARAKAYA"));
        System.out.println("isimSoyisim(\"Zeynep\",\"DEMİR\") = " + isimSoyisim("Zeynep", "DEMİR"));

    }
    public static String isimSoyisim(String isim, String soyisim) {
        if (soyisim.contains(isim.substring(0, 1))) {
            String yeniSoyisim = soyisim.replace(isim.substring(0, 1),"");
            return yeniSoyisim;
        }else{
            return "İsminizin baş harfi soy isminizde bulunmamaktadır";
        }

    }
}