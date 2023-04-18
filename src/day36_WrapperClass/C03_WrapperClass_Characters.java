package day36_WrapperClass;

public class C03_WrapperClass_Characters {
    public static void main(String[] args) {

        //Character.isLetter()     harf olup olmadığını
        //Character.isDigit()      Sayı/rakam olup olmadığını kontrol ediyor
        //Character.isAlphabetic() harf olup olmadığını

        System.out.println(Character.isAlphabetic('A'));
        System.out.println(Character.isAlphabetic('β'));


//String değer içerisindeki gömülü kelimeyi bulunuz
//String değer içerisindeki gömülü cümleyi çıkartınız.
        String str="|''11'>>///M++>,,_//e%%&/'-&&r//%<>/)h>%//'9a+%^^^((b><###a678* +%&&/))<+J>>>" +
                ">56a##v||;;;a~>>> 4500001<<İ##n--//+%^^s>><<|478a12%%n" +
                "*-<<|>>012345l679--a**//##++34r``~~((ı[234]+||";
    /*     String result="";
        for (int i = 0; i <str.length() ; i++) {
            if(Character.isLetter(str.charAt(i))||str.charAt(i)==' '){
            result+=str.charAt(i);}
        }

        System.out.println(result);*/

String harf="";
String sayiler="";
String karakter="";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))){
           harf+=str.charAt(i);

        }else if(Character.isDigit(str.charAt(i))){
        sayiler+=str.charAt(i);
        }else{
            karakter+=str.charAt(i);
            }
        }

        System.out.println("harf = " + harf);
        System.out.println("sayiler = " + sayiler);
        System.out.println("karakter = " + karakter);



    }




}
