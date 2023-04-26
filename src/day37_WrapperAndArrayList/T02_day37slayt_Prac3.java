package day37_WrapperAndArrayList;

import java.util.ArrayList;

public class T02_day37slayt_Prac3 {
    public static void main(String[] args) {
        //ArrayList<Integer> myList = getList(20);//return method
        //System.out.println(myList);
        //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
        System.out.println(writeTheNumbersToSize(20));
    }

    public static ArrayList<Integer> writeTheNumbersToSize(int size){
        ArrayList<Integer>myList= new ArrayList<>(size);
        for (int i = 1; i <= size; i++) {
            myList.add(i);
        }return myList;
    }
}
