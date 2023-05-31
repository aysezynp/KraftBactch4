package day56_JavaInterview;

import java.util.ArrayList;
import java.util.Arrays;

public class C07_Anagram {
    public static void main(String[] args) {
        //write a program that can check if str1 and str2 are built out same chars
        String str1="kitap";
        String str2="katip";
        System.out.println(isAnagram(str1, str2));
        System.out.println(isAnagram(str1, str2));
        char[] ch1=str1.toCharArray();
        char[]ch2=str2.toCharArray();
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));
        boolean isAnagram=Arrays.equals(ch1,ch2);
        System.out.println(isAnagram);
    }

public static boolean isAnagram(String str1,String str2){
        char[]ch1=str1.toCharArray();
        Arrays.sort(ch1);
        char[]ch2=str2.toCharArray();
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);


}
}
