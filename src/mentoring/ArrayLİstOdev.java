package mentoring;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLİstOdev {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 6 adet tam sayı giriniz");
        ArrayList<Integer> arr = new ArrayList<>();
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
        ArrayList<Integer>unıque=new ArrayList<>();
      outerLoop:  for (int i = 0; i <arrayList.size() ; i++) {
            for (int j = 0; j < unıque.size() ; j++) {
                if(arrayList.get(i)==unıque.get(j)){
                    continue outerLoop;
                }
            }unıque.add(arrayList.get(i));

        }
        Integer temp;
        for (int i = 0; i < unıque.size(); i++) {
            for (int k = i + 1; k < unıque.size(); k++) {
                if (( unıque.get(k) <  unıque.get(i))) {
                    temp =  unıque.get(i);
                    unıque.set(i,  unıque.get(k));
                    unıque.set(k, temp);
                }
            }
        }

        return unıque;
    }
}