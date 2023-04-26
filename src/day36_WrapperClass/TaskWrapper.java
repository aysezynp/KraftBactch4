package day36_WrapperClass;

import java.util.Arrays;

public class TaskWrapper {
    public static void main(String[] args) {
        String str = "^+!j12*/-a_|v-:!a ?07??()&+mer20**ayse17;";
        System.out.println(Arrays.toString(findDigitsStr(str)));
        System.out.println("........................................");
        System.out.println(Arrays.toString(findDigitsInt(str)));


    }
    //String içindeki sayıları bir array içinde döndüren bir metot yazınız.
    public static String[] findDigitsStr (String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                result += str.charAt(i);}
        }
        String[] arr = result.split("");
        return arr;
    }

    public static int[] findDigitsInt (String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                result += str.charAt(i);}
        }
        String[] arr = result.split("");
        int[]numbers=new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            numbers[i]=Integer.parseInt(arr[i]);
        }
            return numbers;
        }

    }


