package day24_StringClass_Cont;

public class T07_İsimSoyisim {

    //İsminizi ve soyadınız hangisi kısa ise diğerine onun boyuna
    //kısaltın yani fazla karakterleri atın. Ve isminizle soy adınızı
    //birleştirin.

    public static void main(String[] args) {
        System.out.println("kısaltma(\"Abdülkerim\",\"DEMİR\") = " + kısaltma("Abdülkerim", "DEMİR"));
        System.out.println("kısaltma(\"Ayşe\",\"ARSLAN\") = " + kısaltma("Ayşe", "ARSLAN"));

    }
        public static String kısaltma(String name, String surname){
            if(name.length()<surname.length()) {
                String kısaltma = surname.substring(0, name.length());
                String sonuc = name.concat(kısaltma);
                return sonuc;
            }else{
                String kısaltma2= name.substring(0,surname.length());
                String sonuc2=name.substring(0,surname.length()).concat(surname);
               return sonuc2;}


        }
    }

