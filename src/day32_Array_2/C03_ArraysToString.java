package day32_Array_2;

import java.util.Arrays;

public class C03_ArraysToString {
    public static void main(String[] args) {
        String [] arr=new String[4];
        arr[0]="Harun";
        arr[1]="Mehmet";
        arr[2]="celal";
        arr[3]="emine";
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        System.out.println("toString(arr) = " + toString(arr));

    }
 public static String toString(String[]array){
        String result="[";
     for (int i = 0; i < array.length; i++) {
         if(i== array.length-1){
             result+=array[i]+"]";
         }else{
             result+=array[i]+", ";
         }
     }return result;


 }



}
