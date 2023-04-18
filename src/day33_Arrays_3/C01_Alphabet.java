package day33_Arrays_3;

import java.util.Arrays;

public class C01_Alphabet {
    public static void main(String[] args) {
        char[]alphabet;
        alphabet=new char[26];
     //alphabet[0]='Z'; //90
     //alphabet[1]='Y'; //89

        char ch='Z';
        for (int i=0;i<alphabet.length;i++){
            alphabet[i]=ch;
            ch--;
        }
        System.out.println(Arrays.toString(alphabet));

        char ch1='a';
        for (int i=0;i<alphabet.length;i++){
            alphabet[i]=ch1;
            ch1++;
        }
        System.out.println(Arrays.toString(alphabet));


    }
}
// In a char[] write all of the alphabet in reversed orde