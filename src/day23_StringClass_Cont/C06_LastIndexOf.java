package day23_StringClass_Cont;

public class C06_LastIndexOf {
    public static void main(String[] args) {
        //indexOf() ilk bulunanın indeksini getiriyor
        //last i

        String str= "Merhaba";
        System.out.println("str.indexOf(\"a\") = " + str.indexOf("a"));
        System.out.println("str.lastIndexOf(\"a\") = " + str.lastIndexOf("a"));
        System.out.println("...........................");

        int length=str.length();
        System.out.println(length);
        int lengthFinal=str.replace("a","").length();
        System.out.println(str+ " içerisinde a "+(length-lengthFinal)+ " adet mevcuttur.");
    }

}
