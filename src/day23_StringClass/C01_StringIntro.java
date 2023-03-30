package day23_StringClass;

public class C01_StringIntro {
    public static void main(String[] args) {
        String str1= "hello";   //literal way---Heap memory---String pool
        String str2="hello";    //str2---String pooldaki "hello"yu işaret eder.
        String str3="Hello";    //literal way---Heap memory---String pool

        String str4=new String("hello");  //string object ---heap memory
        boolean bl;
        //System.out.println(bl);   //local variable initialize etmedi hata verir
        bl=str1==str2;   //true
        bl= str1.equals(str2); // true

        bl= str1.equals(str3); //false
        bl=str1==str3;//false


        bl= str1.equals(str4); //true referansları karşılaştırmıyor,farklı object olması ile ilgileniyor
                               //  sadece string içeriği ile ilgileniyor
        bl=str4==str1; ////false since diffrent objects with diffrence



    }
}
