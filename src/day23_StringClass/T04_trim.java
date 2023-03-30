package day23_StringClass;

public class T04_trim {
    public static void main(String[] args) {
        trim("    java programming language   ");
    }

    //Bir method yazın ve verilen string in önünde ve arkasında
    //boşluk varsa boşlukları alıp geri döndürsün
    public static void trim(String str){
        System.out.println(str);
        System.out.println(str.trim());

    }


}
