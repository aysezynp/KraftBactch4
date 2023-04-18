package day33_Arrays_3;

import java.util.Arrays;

public class C04_Tasks {
    public static void main(String[] args) {
        System.out.println("SORU 1:");
        String str = "merhaba java insanları bugün nasılsınız";
        System.out.println("Arrays.toString(stringToArray(str)) = " + Arrays.toString(stringToArray(str)));
        System.out.println("..............................");

        System.out.println("SORU 2:");
        String str1 = "kayısı, armut, üzüm, çilek, nar";
        System.out.println("Arrays.toString(stringToArray2(str1)) = " + Arrays.toString(stringToArray2(str1)));
        System.out.println("..............................");

        System.out.println("SORU 3:");
        String str3 = "elma, armut, üzüm, çilek, nar";
        System.out.println(Arrays.toString(swapLastAndFirstIndex(str3)));
        System.out.println("..............................");

        System.out.println("SORU 4:");
        String str4 = "merhaba java insanları bugün nasılsınız";
        System.out.println("java = " + Arrays.toString(returnLetterr(str4)));
        System.out.println("..............................");

        System.out.println("SORU 5:");
        System.out.println(Arrays.toString(putTheNumbersInArray(6)));
        System.out.println("..............................");

        System.out.println("SORU 6:");
        int[] arr = {30, 20, 10, 40, 50};
        System.out.println("aritmeticAverage(arr) = " + aritmeticAverage(arr));
        System.out.println(averageOfMaxMİn(arr));
        System.out.println("..............................");

        System.out.println("SORU 7:");
        int[] arr1 = {30, 20, 10, 40, 50};
        System.out.println(Arrays.toString(fillTheLowestNumber(arr1)));
        System.out.println("..............................");

        System.out.println("SORU 8:");
        int[] arr2 = {30, 20, 10, 50, 40};
        System.out.println(Arrays.toString(fillTheLowestNumberExceptTheBiggestOne(arr2)));

        System.out.println("SORU 9:");
        String stra="merhaba java insanları bugün nasılsınız";
        System.out.println(Arrays.deepToString(splitArray(stra)));

    }


// SORU 1: merhaba java insanları bugün nasılsınız» gibi bir cümleyi her kelime bir
//         element olacak şekilde bir array a dönüştüren bir method yazın

    public static String[] stringToArray(String str) {
        return str.split(" ");

    }
//SORU 2: «kayısı, armut, üzüm, çilek, nar» cümlesinde ki meyve isimlerini her biri bir
//         element olacak şekilde bir array a atın. Elementlerden 5 den az harfi olan
//         varsa onun y
//         erine armut atayın

    public static String[] stringToArray2(String str) {
        String[] arr = str.split(", ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() < 5) {
                arr[i] = "armut";
            }
        }
        return arr;

    }

//SORU 3: «elma, armut, üzüm, çilek, nar» cümlesinde ki meyve isimlerini her biri bir
//         element olacak şekilde bir array a atın. İlk ve son idexi swaping yapın.

    public static String[] swapLastAndFirstIndex(String str) {
        String[] arr = str.split(", ");
        String temp = arr[arr.length - 1];
        Arrays.fill(arr, arr.length - 1, arr.length, arr[0]);
        Arrays.fill(arr, 0, 1, temp);
        return arr;
    }
//SORU 4:«merhaba java insanları bugün nasılsınız» gibi bir cümlenin ikinci kelimesinin
//        harflerinden bir döndüren method yazın.

    public static char[] returnLetterr(String str) {
        String[] arr = str.split(" ");
        String second = arr[1];
        char[] ch = second.toCharArray();
        return ch;
    }

//SORU 5:Bir method yazın int n parametre olarak alsın. n değeri kadar sayıları sıralı bir
//       biçimde bir array içine yerleştirsin. n = 5 Exm: [0,1,2,3,4]

    public static int[] putTheNumbersInArray(int n) {
        int[] numbers = new int[n];
        int x = 0;
        for (int i = 0; i < n; i++) {
            numbers[i] = i;
        }

        return numbers;
    }

    //SORU 6: Bir sayı dizisinin en büyük ve en küçük element lerinin aritmetik ortalamasını
//        veren bir method yazın
    public static int aritmeticAverage(int[] arr) {
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length - 1];

        return (min + max) / 2;
    }

    public static int averageOfMaxMİn(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }

        return (min + max) / 2;

    }

    //SORU 7: Bir sayı dizisinin en küçük sayısı ne ise sayı dizisini onunla dolduran bir
    //       method yazın
    public static int[] fillTheLowestNumber(int[] arr) {
        Arrays.sort(arr);
        Arrays.fill(arr, arr[0]);
        return arr;
    }

    //SORU 8: Bir sayı dizisinin en küçük sayısı ne ise sayı dizisini (en büyük değer hariç)
//        onunla dolduran bir method yazın
    public static int[] fillTheLowestNumberExceptTheBiggestOne(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max) {
                arr[i] = min;
            }
        }
        return arr;
    }

    //SORU 9:merhaba java insanları bugün nasılsınız» cümlesini [merhaba, java,
//       insanları] ve [bugün, nasılsınız] şeklinde 2 ayrı array a convert edin.
    public static String[][] splitArray(String str) {

        String[] str1 = str.split(" ");
        String[][] yeni = new String[2][];
        yeni[0] = Arrays.copyOfRange(str1, 0, 3);
        yeni[1] = Arrays.copyOfRange(str1, 3, 5);
        return yeni;

    }
}