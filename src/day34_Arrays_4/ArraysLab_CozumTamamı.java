package day34_Arrays_4;

import day33_Arrays_3.C02_Tasks;

import java.util.Arrays;
import java.util.Random;

public class ArraysLab_CozumTamamı {
    public static void main(String[] args) {
        System.out.println("SORU 1:");
        int[] num = {3, 4, 5, 6, 7, 8};
        System.out.println(sumOfNumbers(num));
        System.out.println("..................................................");

        System.out.println("SORU 2:");
        System.out.println(sumOfEvenNumbers(num));
        System.out.println("..................................................");

        System.out.println("SORU 3:");
        int[] num1 = {2, 3, 3, 2, 5, 4, 3};
        System.out.println(sumOfnNumber(num1, 3));
        System.out.println(sumOfnNumber(num1, 2));
        System.out.println("..................................................");

        System.out.println("SORU 4:");
        int[] num2 = {30, 20, 10, 40, 50};
        System.out.println(Arrays.toString(minAndMaxNumbersOfArray(num2)));
        System.out.println("..................................................");

        System.out.println("SORU 5:");
        System.out.println(Arrays.toString(fillWithTheLowestNumber(num2)));
        System.out.println("..................................................");

        System.out.println("SORU 6:");
        System.out.println(Arrays.toString(numbersBetweenTwoInt(8, 15)));
        //[1,2,-8,-9] [-1,0,-7,11]
        System.out.println("..................................................");

        System.out.println("SORU 7:");
        int[] arr1 = {1, 2, -8, -9};
        int[] arr2 = {-1, 0, -7, 11};
        System.out.println(Arrays.toString(createOneArrayFromTwoArrays(arr1, arr2)));
        System.out.println("..................................................");

        System.out.println("SORU 8:");
        System.out.println("..................................................");

        System.out.println("SORU 9:");
        int[] arr3 = {1, 2, 3, 4};
        System.out.println(Arrays.toString(reverseArray(arr3)));
        System.out.println("..................................................");

        System.out.println("SORU 10:");
        System.out.println(Arrays.toString(createArraylengthTen()));
        System.out.println("..................................................");

        System.out.println("SORU 11:");
        System.out.println(Arrays.toString(createArrayWithNumbersBetweenFifty_Eighty()));
        System.out.println("..................................................");

        System.out.println("SORU 12:");
        System.out.println(howManyNumber125());
        System.out.println("..................................................");

        System.out.println("SORU 13:");
        System.out.println(theSecondlargestNumber());
        System.out.println("..................................................");

        System.out.println("SORU 14:");
        int[] arr4 = {2, 3, 3, 4, 5, 6, 5, 6, 3};
        int[] arr5 = {2, 4, 5, 8, 8};
        int[] arr6 = {1, 2, 3};
        System.out.println(threeOrderedNumbers(arr4));
        System.out.println(threeOrderedNumbers(arr5));
        System.out.println("threeOrderedNumbers(arr6) = " + threeOrderedNumbers(arr6));
        System.out.println("..................................................");

        System.out.println("SORU 15:");
        System.out.println("(aloneNumbers(new int[]{2, 3, 3, 4, 5, 6, 5, 6, 3})) = " + (aloneNumbers(new int[]{2, 3, 3, 4, 5, 6, 5, 6, 3})));
        System.out.println("(aloneNumbers(new int[]{2, 2, 5, 8, 8})) = " + (aloneNumbers(new int[]{2, 2, 5, 8, 8})));
        System.out.println("(aloneNumbers(new int[]{2, 2, 5, 8, 8})) = " + (aloneNumbers(new int[]{1, 2})));
        System.out.println("..................................................");

        System.out.println("SORU 16:");

        System.out.println("..................................................");

        System.out.println("SORU 17:");
        System.out.println("dublicateNumber(new int[]{1,2,8,1}) = " + dublicateNumber(new int[]{1, 2, 8, 1}));
        System.out.println("dublicateNumber(new int[]{25,89,78,98}) = " + dublicateNumber(new int[]{25, 89, 78, 98}));
        System.out.println("dublicateNumber(new int[]{25,25,25,98}) = " + dublicateNumber(new int[]{25, 25, 25, 98}));
        System.out.println("..................................................");

        System.out.println("SORU 18:");
        String str = "Bir fil ormanda boylu boyunca uzanmış, yüksek sesle horlayarak uyuyordu. Filin yemek \n" +
                "//          dolu karnı horlarken bir aşağı bir yukarı gidiyordu. Filin horlama sesini duyan fare yuvasından çıkıp \n" +
                "//          sesin olduğu tarafa gitti, filin horlarken sallanan karnı farenin hoşuna gitti. Usulca çıkıp filin karnının \n" +
                "//          üzerine oturdu, salıncak gibi bir o yana bir bu yana sallanırken eğleniyordu.";
        System.out.println("letterCount(str) = " + letterCount(str));
        System.out.println("..................................................");

        System.out.println("SORU 19:");
        System.out.println("duplicateWord(\"araba ile yola çıktık fakat araba arıza yaptı\") = " + duplicateWord("araba ile yola çıktık fakat araba arıza yaptı"));
        System.out.println("duplicateWord(\"araba ile yola çıktık fakat arıza yaptı\") = " + duplicateWord("araba ile yola çıktık fakat arıza yaptı"));
        System.out.println("..................................................");

        System.out.println("SORU 20:");
        System.out.println("Arrays.toString(fillWithMinNumber(new int[]{5, 7, 1, 9})) = " + Arrays.toString(fillWithMinNumber(new int[]{5, 7, 1, 9})));
        System.out.println("..................................................");

        System.out.println("SORU 21:");
        System.out.println("Arrays.toString(putOneIfFiveAfterEight(new int[]{6, 5, 8, 6, 8, 5, 8})) = " + Arrays.toString(putOneIfFiveAfterEight(new int[]{6, 5, 8, 6, 8, 5, 8})));
        System.out.println("Arrays.toString(putOneIfFiveAfterEight(new int[]{5,7,8,5,9})) = " + Arrays.toString(putOneIfFiveAfterEight(new int[]{5, 7, 8, 5, 9})));
        System.out.println("..................................................");

        System.out.println("SORU 22:");
        System.out.println("primeNumbers(new int[]{21,7,29,12}) = " + primeNumbers(new int[]{21, 7, 29, 12}));
        System.out.println("..................................................");

        System.out.println("SORU 23:");
        System.out.println("Arrays.toString(sortNumbers(new int[]{21,7,29,12})) = " + Arrays.toString(sortNumbers(new int[]{21, 7, 29, 12})));
        System.out.println("Arrays.toString(sortNumbers(new int[]{5,10,2,4})) = " + Arrays.toString(sortNumbers(new int[]{5, 10, 2, 4})));
    }

//SORU 1:Array’in içerisindeki tüm sayıların toplamını veren metodu yazınız.

    public static int sumOfNumbers(int[] arr) {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return sum;
    }

    //SORU 2:Array’in içerisindeki tüm çift sayıların toplamını veren metodu yazınız.
    public static int sumOfEvenNumbers(int[] arr) {
        int sum = 0;
        for (int x : arr) {
            if (x % 2 == 0) {
                sum += x;
            }
        }
        return sum;
    }

    //SORU 3:Array’in içerisindeki tüm 3 sayılarının toplamını veren metodu yazınız.
    public static int sumOfnNumber(int[] arr, int n) {
        int sum = 0;
        for (int x : arr) {
            if (x == n) {
                sum += x;
            }
        }
        return sum;
    }

//SORU 4:Array’in içerisindeki en büyük ve en küçük sayıyı bulan metodu yazınız.

    public static int[] minAndMaxNumbersOfArray(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        int[] minMax = new int[2];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        minMax[0] = min;
        minMax[1] = max;
        return minMax;
    }

//SORU 5:Array’in içerisindeki en küçük sayıyı tüm indekslere atayan bir metod yazınız.

    public static int[] fillWithTheLowestNumber(int[] arr) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = min;
        }
        return arr;
    }

//SORU 6.2 adet integer sayı alan ve arasındaki sayıları indekslere atayan metodu yazınız.

    public static int[] numbersBetweenTwoInt(int x, int y) {
        int min = Math.min(x, y);
        int max = Math.max(x, y);
        int[] arr = new int[(max - min) + 1];
        for (int i = 0, j = x; i < arr.length; i++) {
            arr[i] = j;
            j++;
        }
        return arr;
    }
//SORU 7: 2 adet array kabul eden ve sonucunda bu 2 array’in verileri ile birlikte tek bir array
//        oluşturan metodu yazınız.
//        [1,2,-8,-9] [-1,0,-7,11] -------→ [1,2,-8,-9,-1,0,-7,11]

    public static int[] createOneArrayFromTwoArrays(int[] x, int[] y) {
        int newLength = x.length + y.length;
        int[] newArr = new int[newLength];
        for (int i = 0; i < x.length; i++) {
            newArr[i] = x[i];
        }
        for (int i = x.length, j = 0; i < newLength; i++) {
            newArr[i] = y[j];
            j++;
        }
        return newArr;
    }
//SORU 8: 2 array kabul eden, ilk array in içerindeki tüm sayılar ikinci arrayin içinde yer alıyorsa true
//        yer almıyorsa false yazdıran metodu yazınız.
//[5,4,3,2,1] , [1,2,3,4,5,7,9] true
//[5,4,3,2,1,7,5] , [1,2,3,4,5] false

    //public static boolean  secondArrayContainsFirst(int[] x,int[] y){


//SORU 9: Array’in içerisindeki sayıları ters çevirerek yeni bir array oluşturan metodu yazınız.

    public static int[] reverseArray(int[] x) {
        int[] reversed = new int[x.length];
        for (int i = x.length - 1, j = 0; i >= 0; i--) {
            reversed[j] = x[i];
            j++;
        }
        return reversed;
    }
//SORU 10: Boyutu 10 olan bir array oluşturun ve içerisine Random sınıfını kullanarak 0-100 arasında
//         rastgele sayılar atayın ve ekrana bu verileri yazdıran metodu yazınız.

    public static int[] createArraylengthTen() {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(0, 100);
        }
        return arr;
    }

//SORU 11: Boyutu 500 olan bir array oluşturun ve içerisine Random sınıfını kullanarak 50-80
//         arasında rasgele sayılar atayın.

    public static int[] createArrayWithNumbersBetweenFifty_Eighty() {
        Random random = new Random();
        int[] arr = new int[500];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50, 80);
        }
        return arr;
    }
//SORU 12: Boyutu 500 olan bir array oluşturun ve içerisine Random sınıfını kullanarak 120-140
//         arasında rasgele sayılar atayın. Oluşturduğunuz Array in içerinde kaç adet 125 sayısı vardır?

    public static int howManyNumber125() {
        Random random = new Random();
        int[] arr = new int[500];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(120, 140);
        }
        int count = 0;
        for (int x : arr) {
            if (x == 125) {
                count++;
            }
        }
        return count;
    }
//SORU 13:: Boyutu 500 olan bir array oluşturun ve içerisine Random sınıfını kullanarak 120-140
//          arasında rasgele sayılar atayın. Oluşturduğunuz Array içerisindeki en büyük 2. sayıyı bulun

    public static int theSecondlargestNumber() {
        Random random = new Random();
        int[] arr = new int[500];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(120, 140);
        }//[4,8,6,9}
        int max = arr[0];
        int secondLargest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                secondLargest = max;
                max = arr[i];
            } else if (arr[i] > secondLargest && arr[i] < max) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;

    }

//SORU 14:Array’in içerisinde ard arda 3 adet sıralı sayı var ise true döndüren metodu yazınız.

    public static boolean threeOrderedNumbers(int[] arr) {
        for (int i = 0; i < arr.length - 2; ++i) {
            if (arr[i] == arr[i + 1] - 1 && arr[i + 1] == arr[i + 2] - 1) {
                return true;
            }
            continue;

        }
        return false;
    }
//SORU 15: Array’in içerindeki eşi olmayan yalnız sayıları bulan ve bunları ekrana yazdıran metodu
//         yazınız. (sağında veya solunda aynı sayı yoksa yalnızdır.)
    //      [2,3,3,4,5,6,5,6,3] → 2,4,5,6,3
    //      [2,2,5,8,8] →5
    //     [2,2,3] → 3
    //   [1,2] → 1,2

    public static String aloneNumbers(int[] arr) {
        String result = "";
        for (int i = 1; i <= arr.length - 2; i++) {
            if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1] && arr[i - 1] != arr[i + 1]) {
                result += arr[i] + " ";
            }
        }
        if (arr[0] != arr[1]) {
            result += arr[0] + " ";
        }
        if (arr[arr.length - 1] != arr[arr.length - 2]) {
            result += arr[arr.length - 1] + " ";
        }
        return result;
    }

//SORU 16: Array’in içerisinde en çok bulunan sayıyı veren metodu yazınız. (eşitlik durumda herhangi
//          birini alabilir,1 den fazla bulunmuyorsa -1 döndürecek)
    //  [2,3,3,3,6,6,5,6,3] → 3
    // [2,4,5,8,8] → 8

       /* public static int theMostNumber(int[]arr) {
            int mostNumber = 0;
            int sayi = 0;//2,3,3,3,6,6,5
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                int num = arr[i];
                if (num >= 1 && num == arr[i - 1])
                    continue;
                else {
                    for (int j = i; j < arr.length; j++) {
                        if (arr[j] == num) {
                            count++;
                        }
                    }
                    if (count > sayi) {
                        sayi = count;
                        mostNumber = num;
                    }
                }
                if (count == 1)
                    return -1;

                else
                    return mostNumber;
            }
        }*/

//SORU 17::Array’in içerindeki dublicate sayı varsa true yoksa false döndüren metodu yazınız.
//[1,2,8,1] true
//[25,89,78,98] false

    public static boolean dublicateNumber(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1])
                return true;
        }

        return false;
    }
//SORU 18: «Bir fil ormanda boylu boyunca uzanmış, yüksek sesle horlayarak uyuyordu. Filin yemek
//          dolu karnı horlarken bir aşağı bir yukarı gidiyordu. Filin horlama sesini duyan fare yuvasından çıkıp
//          sesin olduğu tarafa gitti, filin horlarken sallanan karnı farenin hoşuna gitti. Usulca çıkıp filin karnının
//          üzerine oturdu, salıncak gibi bir o yana bir bu yana sallanırken eğleniyordu.» kelimesinde kaç adet o
//          harfi vardır. (Büyük ve küçük ihmal edilecek)

    public static int letterCount(String str) {
        str = str.toLowerCase();
        char[] ch = str.toCharArray();
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'o') {
                count++;
            }
        }
        return count;
    }
//SORU 19: Verilen bir cümlenin içerinde dublicate kelime varsa true yoksa false döndüren metodu
//         yazınız.

    public static boolean duplicateWord(String str) {
        String[] strArr = str.split(" ");

        for (int i = 0; i < strArr.length - 1; i++) {
            for (int j = i + 1; j < strArr.length; j++) {
                if (strArr[i].equals(strArr[j])) {
                    return true;
                }
            }
        }
        return false;
    }

//SORU 20: Array’in içerisindeki en küçük sayıyı bulan ve array in ilk indeksine bu sayıyı atayan diğer
//         indekslere 0 atayan metodu yazınız

    public static int[] fillWithMinNumber(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[0]) {
                min = arr[i];
            }
        }
        arr[0] = min;
        Arrays.fill(arr, 1, arr.length, 0);
        return arr;
    }
//SORU 21: Array’in içerisindeki sayılardan 5 den sonra 8 geliyorsa 8 yerine 1 atayan metodu yazınız
//[6,5,8,6,8,5,8] →[6,5,1,6,8,5,1]
//[5,7,8,5,9] → [5,7,8,5,9

    public static int[] putOneIfFiveAfterEight(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 5 && arr[i + 1] == 8) {
                arr[i + 1] = 1;
            }
        }
        return arr;
    }

    //SORU 22: Array’in içerisindeki asal sayıları bularak ekrana yazdıran metodu yazınız.
    public static String primeNumbers(int[] arr) {
        String prime = "";

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            if (arr[i] < 2) {
                continue;
            }
            for (int j = 2; j < arr[i]; j++) {
                if (arr[i] % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                prime += arr[i] + " ";
            }
        }
        return prime;
    }

    //SORU 23. Array’in içerisindeki sayıları artan düzeyde sıralayınız. (Arrays.sort kullanılmayacak)
    //[21,7,29,12] ----→ [7,12,21,29]
    public static int[] sortNumbers(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

//SORU 24: Array’in içerisindeki ard arda aynı olan sayıları hariç tutarak dublicate olmayan sayıların
//         toplamını veren metodu yazınız.

//[1,1,2,3] → 5
//[2,5,5,5,9] →11
//[5,5,5,5,9] →9
//[5,5,5,5,5] →0
//[5,1,5,1,5] →17

   /* public static int sumOfNotDuplicateNumbers(int[] arr) {


    }*/


}