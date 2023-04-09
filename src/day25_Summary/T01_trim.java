package day25_Summary;

public class T01_trim {
    public static void main(String[] args) {
        System.out.println("  Merhaba  ");
        System.out.println(trim("  Merhaba  "));
    }

    public static String trim(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if(str.substring(i,i+1).equals(" ")){
                continue;
            }else{
                result+=str.substring(i,i+1);

            }}
        return result;
}
}