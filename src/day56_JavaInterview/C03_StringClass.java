package day56_JavaInterview;

public class C03_StringClass {
    public static void main(String[] args) {
        //String literals are shared in String pool
        //String literal is faster than new keyword
        String str = " school";
        String str1 = "school";
        String str2 = new String("school");
        String str3 = new String("school");


        str.toUpperCase();//"SCHOOL" new string object, have no referance after this line eligible for garbage collection
        System.out.println(str);//strings are immutable "school"

        String str4 = str1.toUpperCase();
        System.out.println(str4);

     //   StringBuilder stringBuilder="school";
      //  StringBuilder stringBuilder1="school";//StringBuilder ve StringBuffer sınıflarından literalway ile obje oluşturamıyoruz
                                              //String  literal string pool,cannot be used in StringBuffer and StringBuilder Classes

        StringBuffer stringBuffer = new StringBuffer("school");
        System.out.println("stringBuffer = " + stringBuffer);

        StringBuilder stringBuilder = new StringBuilder("school");
        System.out.println("stringBuilder = " + stringBuilder);

        System.out.println("....................................................");
        str1.concat("garden");//school garden
        System.out.println("str1 = " + str1); //school yazar//immutable

        stringBuilder.append(" garden");//StringBuilder ve StringBuffer are mutable
        System.out.println("stringBuilder = " + stringBuilder);

        stringBuffer.append(" garden");
        System.out.println("stringBuilder = " + stringBuilder);


        System.out.println("stringBuffer.reverse() = " + stringBuffer.reverse());
        System.out.println("stringBuilder.reverse() = " + stringBuilder.reverse());


    }
}