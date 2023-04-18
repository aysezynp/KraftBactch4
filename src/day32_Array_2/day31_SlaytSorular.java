package day32_Array_2;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class day31_SlaytSorular {
    public static void main(String[] args) {
        int arr1[] = {23, 21, 22, 25};
        int arr2[] = {1, 2, 3, 4, 5};
        System.out.println("Soru 8:");
        System.out.println("enBüyükEleman(arr1) = " + enBuyukEleman(arr1));
        System.out.println("enKucukEleman(arr1) = " + enKucukEleman(arr1));
        System.out.println("................................................");
        System.out.println("Soru 9:");
        System.out.println(Arrays.toString(yerDegistirme(arr1)));
        System.out.println("................................................");
        System.out.println("Soru 10:");
        System.out.println(Arrays.toString(reversed(arr1)));
        System.out.println("................................................");
        System.out.println("Soru 11:");
        System.out.println("tekIndexToplam(arr2) = " + tekIndexToplam(arr2));
        System.out.println("tekIndexToplam2(arr2) = " + tekIndexToplam2(arr2));
        System.out.println("................................................");
        System.out.println("Soru 12:");
        System.out.println(Arrays.toString(stringOlusturma()));
    }

    //SORU 8: İnt arry in en büyük elemanını döndüren bir method yazın
    public static int enBuyukEleman(int[] arr) {
        int enBuyuk = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > enBuyuk) {
                enBuyuk = arr[i];
            }
        }
        return enBuyuk;
    }

    public static int enKucukEleman(int[]arr){
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }return min;

    }

    //SORU 9:Bir array oluşturun ve ilk ve son element leri swap(yer değiştirme) yapın.
    public static int[] yerDegistirme(int[] arr) {//23, 21, 22, 25}
        int temp=arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=temp;
        return arr;
    }

    //SORU 10. Bir method yazın ve verilen arry in elemanlarını tersden sıralayıp yeni bir array döndürsün.
    public static int[] reversed(int[] arr) {
        int[] yeni = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--) {
            yeni[j] = arr[i];
            j++;
        }
        return yeni;
    }
    //SORU 11. Bir methodla verilen array ın teksayı indexinde bulunan elemanların toplamını alın.

    public static int tekIndexToplam(int[] arr) {
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                toplam += arr[i];
            }
        }
        return toplam;
    }
    public static int tekIndexToplam2(int[] arr) {
        int toplam = 0;
        for (int i = 1; i < arr.length; i+=2) {
                toplam+= arr[i];
            }   return toplam;
        }

    //SORU 12.Kullanıcıdan oluşturmak istediği string array in bilgilerini alarak string array oluşturan
    //bir method yazın. Alınacak bilgiler array ın length i ve elamanları olsun

    public static String[] stringOlusturma() {
        Scanner scan=new Scanner(System.in);
        System.out.print("Oluşturmak istediğiniz array in uzunluğunu giriniz: ");
        int length=scan.nextInt();
        scan.nextLine();
        String[] str = new String[length];
        for (int i = 0; i < length; i++) {
            System.out.print("String arrayin "+(i+1)+". elemanını giriniz:");
            str[i]= scan.nextLine();
        }
       return str;
        }



}

