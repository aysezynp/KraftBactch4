package day32_Array_2;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class C04_Arrays_Methods {
    public static void main(String[] args) {
        //System.out.println("kelimeDepola()[0] = " + kelimeDepola()[0]);

        /*Soru 1 ile ilgili sonuçlar
        int arr[]={24,25,26,27,28,29,30};
        int arr1[]={20,21,22};
        System.out.println("uzunlukKontrol(arr) = " + uzunlukKontrol(arr));
        System.out.println("uzunlukKontrol(arr1) = " + uzunlukKontrol(arr1));
        if(uzunlukKontrol(arr)){
            System.out.println("uzunluk 5'ten büyüktür");
        }else{
            System.out.println("uzunluk 5'ten küçüktür");
        }*/
        //-------------------------------------------------------------------
        /*soru 2 sonuç:
        int arr1[] = {5,20,21,22};
        System.out.println("varMıYokMu(arr1) = " + varMıYokMu(arr1));
        System.out.println(varMıYokMu2(arr1, 21));*/

    /*SORU 3 sonuç
        int arr[]={24,25,26,27,28,29,30};
        int arr1[]={20,21,22};
        int arr2[]={20,22,24};
        System.out.println("ilkElemeanlarıEsitMi(arr,arr1) = " + ilkElemeanlarıEsitMi(arr, arr1));
        System.out.println("ilkElemeanlarıEsitMi(arr1,arr2) = " + ilkElemeanlarıEsitMi(arr1, arr2));*/

    /*soru 4 sonuç
        String arr[]={"ayşe","mehmet"};
        String arr1[]={"ali","zekiye"};
        System.out.println(Arrays.toString(yeniArray(arr, arr1)));
        System.out.println("yeniArray(arr,arr1)[0] = " + yeniArray(arr, arr1)[0]);*/
    /*Soru 5 ve 6
        int arr1[]={4,5,6};
        System.out.println("toplam(arr1) = " + toplam(arr1));
        System.out.println("Arrays.toString(toplamVeCarpim(arr1)) = " + Arrays.toString(toplamVeCarpim(arr1)));
        System.out.println("toplamVeCarpim(arr1)[0] = " + toplamVeCarpim(arr1)[0]);*/
        int arr1[] = {20, 21, 22};
        int arr2[] = {2, 3, 4};
        System.out.println(Arrays.toString(arrayBirlestir(arr1, arr2)));
        System.out.println(Arrays.toString(arrayBirlestir2(arr1, arr2)));


    }

    public static String[] kelimeDepola() {
        Scanner scan = new Scanner(System.in);
        String str[] = new String[3];
        System.out.print("1.kelime: ");
        String kelime1 = scan.nextLine();
        str[0] = kelime1;
        System.out.print("2.kelime: ");
        String kelime2 = scan.nextLine();
        str[1] = kelime2;
        System.out.print("3.kelime: ");
        String kelime3 = scan.nextLine();
        str[2] = kelime3;
        return str;
    }

    //SORU 1: Bir method yazın ve int[] kabul etsin. length i 5 den büyükse true döndürsün.

    public static boolean uzunlukKontrol(int x[]) {
        return (x.length > 5);
    }

    //Soru 2:Bir method yazın int array kabul etsin array in içinde 5 olup olmadığını kontrol etsin.

    public static boolean varMıYokMu(int array[]) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 5)
                return true;
        }
        return false;
    }

    public static boolean varMıYokMu2(int array[], int sayi) {
        for (int a : array) {
            if (a == sayi) {
                return true;
            }
        }
        return false;
    }

    //SORU 3: Bir method yazın ve 2 array kabul etsin ilk elemanları eşitse true döndürsün.

    public static boolean ilkElemeanlarıEsitMi(int[] x, int[] y) {
        return x[0] == y[0];
    }

    public static boolean ilkElemeanlarıEsitMi(String[] str1, String[] str2) {
        return str1[0].equalsIgnoreCase(str2[0]);
    }

    //SORU 4. 2 array kabul eden bir method yazın ve arraylerin llk elemanları ile yeni bir array döndürsün.

    public static String[] yeniArray(String str[], String str1[]) {
        String yeni[] = new String[2];
        yeni[0] = str[0];
        yeni[1] = str1[0];

        return yeni;

    }
    //SORU 5.Int array in elemanlarının toplamını veren bir method yazın

    public static int toplam(int[] array) {
        int result = 0;
        for (int y : array) {   //for (int i=0; i<array.length;i++)
            result += y;        //result+=array[i];
        }
        return result;
    }

    //SORU 6:İnt array ın elemanlarının toplamını ve çarpımını yeni bir array içinde döndüren bir method yazın.

    public static int[] toplamVeCarpim(int[] arr) {
        int toplam = 0;
        int carpim = 1;
        for (int x : arr) {
            toplam += x;
            carpim *= x;
        }
        // int[]yeni={toplam,carpim};
        int[] yeni = new int[2];
        yeni[0] = toplam;
        yeni[1] = carpim;

        return yeni;

    }
    //SORU 7=Verilen 2 arrayi birleştirip array döndüren bir method yazın.

    public static int[] arrayBirlestir(int[] x, int[] y) {
        int[] yeni = new int[x.length + y.length];
        for (int i = 0; i < x.length; i++) {
            yeni[i] = x[i];
        }
        for (int i = x.length, j = 0; i < yeni.length; i++) {
            yeni[i] = y[j];
            j++;
        }
        return yeni;
    }

    public static int[] arrayBirlestir2(int[] x, int[] y) {
        int[] yeni = new int[x.length + y.length];
        for (int i = 0, j = 0; i < yeni.length; i++) {
            if (i < x.length) {
                yeni[i] = x[i];
            } else {
                yeni[i] = y[j];
                j++;
            }
        }
        return yeni;
    }


}