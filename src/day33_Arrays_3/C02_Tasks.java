package day33_Arrays_3;

import java.util.Scanner;

public class C02_Tasks {
    public static void main(String[] args) {


    }

    //İnt arry in en büyük elemanının döndüren bir method yazın
    public static int maxOfArray(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;

    }

    public static int minOfArray(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }

    public static int[] swapFirstAndLast(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        return arr;
    }

    public static int[] reverseArray(int[] arr) {
        int[] reversedArr = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--) {
            reversedArr[j] = arr[i];
            j++;
        }
        return reversedArr;
    }

    // Bir methodla verilen array ın teksayı indexinde bulunan elemanların toplamını alın.

    public static int tekIndexToplam(int[] arr) {
        int toplam = 0;
        for (int i = 1; i < arr.length; i += 2) {
            toplam += arr[i];
        }
        return toplam;
    }
    public static String[] createStringArray(){
        Scanner scan=new Scanner(System.in);
        System.out.println("String arrayin uzunluğunu giriniz:");
        int length=scan.nextInt();
        scan.nextLine();//
        String[] strArr=new String[length];
        for (int i = 0; i < strArr.length; i++) {
            System.out.println("String arrayin"+(i+1)+"elemanını giriniz:");
            strArr[i]=scan.nextLine();
        }
        return strArr;
    }





}
