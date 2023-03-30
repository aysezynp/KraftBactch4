package day23_StringClass;

public class T02_StringOdev {
    public static void main(String[] args) {

        //Adınızın ve soyadınızın kaç karakterden oluştuğunu konsola yazdırın.
        String ad="Zeynep Nilda";
        String soyad="ARSLAN";
        System.out.println("ad.length() = " + ad.length());
        System.out.println("soyad.length() = " + soyad.length());

        System.out.println(".................................................");


        System.out.println(adSoyadBüyükHarf("Zeynep nilda", "arslan"));
    }

     //Adınızın ve soyadınızı büyük harfle yazdıran bir method yazın
      public static String adSoyadBüyükHarf(String ad, String soyad){
           return ad.toUpperCase()+" "+soyad.toUpperCase();



}

}
