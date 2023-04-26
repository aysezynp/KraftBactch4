package day37_WrapperAndArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class T01_day37slayt_Prac5 {
    public static void main(String[] args) {
        //"10","100","101","1000" sayılarını stringNums isimli arrayList e atalım.
        ArrayList<String> stringNums = new ArrayList<>();
        stringNums.add("10");
        stringNums.add("100");
        stringNums.add("101");
        stringNums.add("1000");
        System.out.println(stringNums);
        System.out.println("toIntArrayList(stringNums) = " + toIntArrayList(stringNums));
        System.out.println("Arrays.toString(toIntArray(stringNums)) = " + Arrays.toString(toIntArray(stringNums)));
    }
//"10","100","101","1000" sayılarını stringNums isimli arrayList e atalım.
//toIntList(stringNums); methodu Integer bir arrayList e convert edip
//döndürelim

    public static ArrayList<Integer> toIntArrayList(ArrayList<String> arrList){
        ArrayList<Integer> intNums=new ArrayList<>();
        for (int i = 0; i <arrList.size(); i++) {
            intNums.add(Integer.valueOf(arrList.get(i)));
        }
        return intNums;
    }
//stringNums isimli arrayList i
//toIntArr(stringNums); methodu ile int bir array e convert edip
//döndürelim.

    public static int[] toIntArray (ArrayList<String> arrList){
        int[] arr= new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++) {
            arr[i]=Integer.parseInt(arrList.get(i));
        }
        return arr;
    }






}

