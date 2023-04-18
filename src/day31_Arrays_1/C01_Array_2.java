package day31_Arrays_1;

public class C01_Array_2 {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 105;
        array[1] = 89;
        array[2] = 63;
        array[3] = 56;
        array[4] = 107;
        System.out.println(array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        for (int x : array) {
            System.out.println(x + " ");
        }
        int count = 0;
        for (int x : array) {
            if (x % 2 == 0) {
                count++;
            }
        }
        System.out.println("count = " + count);

        int count1 = 0;
        for (int x : array) {
            if (x % 2 != 0) {
                count1++;
            }
        }
        System.out.println("count1 = " + count1);


        int result = 0;
        for (int x : array) {
            result += x;
        }
        System.out.println("toplam=" + result);

        int result1 = 0;
        for (int i = 0; i < array.length; i++) {
            result1 += array[i];

        }
        System.out.println("toplam1=" + result);
        System.out.println("arrayMetot() = " + arrayMetot());

    }

    public static String[] arrayMetot() {
        String[] array = {"harun", "ayşe"};
        return array;

    }

    public static String arrayMetot1(String[] arr) {

        return arr[0];

    }
}