package day23_StringClass_Cont;

public class C05_Substring {
    public static void main(String[] args) {
        String str= "Java Programming Language";

        //substring metodu iki şekilde kullanılabilir
        //tek parametreli, 0 indexten başlar sonuna kadar kısmı alır

        System.out.println(str.substring(5));
        System.out.println(str.substring(0));
        System.out.println(str.substring(17));
        System.out.println(str.substring(str.length()));//empty index, hiçlik
        System.out.println(str.substring(str.length()-3));
        System.out.println(str.substring(str.length()-8));
        System.out.println(str.substring(2, 4));
        System.out.println(str.substring(5, 16));
        System.out.println(str.substring(0, 1));
        System.out.println(str.substring(str.length()-1, str.length()));
        System.out.println(str.substring(5,5));//hiçlik
        System.out.println(str.substring(4,5)); //" "
       // System.out.println(str.substring(5, 3));//hata StringIndexOutOFBoundException




    }
}
