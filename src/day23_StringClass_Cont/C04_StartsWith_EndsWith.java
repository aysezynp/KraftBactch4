package day23_StringClass_Cont;

public class C04_StartsWith_EndsWith {
    public static void main(String[] args) {
        String str= "Java is cool";
        System.out.println(str.startsWith("J"));
        System.out.println(str.startsWith("Ja"));
        System.out.println(str.startsWith("Java"));
        System.out.println(str.startsWith("java"));
        System.out.println(str.startsWith("Java is cool"));
        System.out.println(str.startsWith(str));
        System.out.println(str.startsWith(""));
        System.out.println(str.startsWith(" "));

        System.out.println("..........................................");

        System.out.println(str.endsWith("l"));
        System.out.println(str.endsWith("ol"));
        System.out.println(str.endsWith("ool"));
        System.out.println(str.endsWith("cool"));
        System.out.println(str.endsWith(str));


    }

}
