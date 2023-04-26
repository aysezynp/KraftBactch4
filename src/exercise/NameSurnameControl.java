package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class NameSurnameControl {
    public static void main(String[] args) {
        System.out.println(length(new int[]{2, 3, 4}));

    }
//Bir method yazın ve int[] kabul etsin. length i 5 den büyükse true döndürsün.
    public static boolean length(int[]arr){
        boolean bl=false;
        if(arr.length>5){
           bl=true;
        }return bl;
    }






        }



