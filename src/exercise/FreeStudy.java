package exercise;


import java.util.Arrays;

public class FreeStudy {
    public static void main(String[] args) {
        System.out.println(reverse("I love Java"));
    }
    /* write a program that can reverse the second word of the sentence
        Ex:
        sentence="I love Java";
                  0    1   2
        output;
        I evol java
        */
    public static String reverse(String str) {
        String[] strArr = str.split(" ");
        String result = "";

        String reversed = "";
        for (int i = strArr[1].length() - 1; 0<=i; i--) {
            reversed += strArr[1].charAt(i);
        }
        strArr[1]=reversed;
        for (String yeni : strArr) {
            result += yeni + " ";
        }
        return result;
    }


}



