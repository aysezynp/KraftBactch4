package day24_StringClass_Cont;

public class C03_StringIsEmpty {
    public static void main(String[] args) {

        // isEmpty() Stringin boş olup olmadığını kontrol eder

        String s1="MErhaba";
        System.out.println(s1.isEmpty());

        String s2="";
        System.out.println(s2.isEmpty());
        System.out.println(s2.isBlank());

        String s3=" ";
        System.out.println(s3.isEmpty());
        System.out.println(s3.isBlank());

    }




}
