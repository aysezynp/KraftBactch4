package mentoring;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLİstOdev {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 10 adet tam sayı giriniz");
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(scan.nextInt());
        arr.add(scan.nextInt());
        arr.add(scan.nextInt());
        arr.add(scan.nextInt());
        arr.add(scan.nextInt());
        arr.add(scan.nextInt());
        arr.add(scan.nextInt());
        arr.add(scan.nextInt());
        arr.add(scan.nextInt());
        arr.add(scan.nextInt());
        System.out.println(arr);
        System.out.println(uniqueSort(arr));

    }

    public static ArrayList<Integer> uniqueSort(ArrayList<Integer> arrayList) {
        Integer temp;
        for (int i = 0; i < arrayList.size(); i++) {
            for (int k = i + 1; k < arrayList.size(); k++) {
                if ((arrayList.get(k) < arrayList.get(i))) {
                    temp = arrayList.get(i);
                    arrayList.set(i, arrayList.get(k));
                    arrayList.set(k, temp);

                }

            }
        }
        return arrayList;
    }
}