package day24_StringClass_Cont;

public class T09_Nickname {

    //İsminizin ilk 3 harfi ve soy isminizin son 3 harfi ile nickname
    //oluşturan bir method yazın.

    public static void main(String[] args) {
        System.out.println("nickname(\"zeynep\", \"ARSLAN\") = " + nickname("zeynep", "ARSLAN"));
        System.out.println("nickname(\"Canan\", \"AKCAN\") = " + nickname("Canan", "AKCAN"));
    }

    public static String nickname(String isim,String soyisim){
      String nickname= isim.substring(0,3).concat(soyisim.substring(soyisim.length()-3,soyisim.length()));
      return nickname;
}




}