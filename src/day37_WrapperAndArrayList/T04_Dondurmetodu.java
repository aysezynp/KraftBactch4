package day37_WrapperAndArrayList;

import java.util.ArrayList;

public class T04_Dondurmetodu {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(5);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println("(dondur(arr, 3)) = " + (dondur(arr, 3)));

    }
//yeni bir ArrayLİst oluşturup içerisine 5 adet sayı ekleyin.
//dondur (int x) x kadar sayıyıkendi içerinde döndürsün
//12345 dondur(1) 51234  dondur(2)45123 dondur(3) 34512

     public static ArrayList<Integer> dondur(ArrayList<Integer> arr,int x){
         for (int i = 0; i < x; i++) {
             arr.add(0, arr.get(arr.size()-1));
             arr.remove(arr.size()-1);
         }
             return arr;
         }
     }
