package day38_Constructors;

import java.sql.Array;
import java.util.ArrayList;

public class C02_RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(40);
        list.add(50);
        list.add(10);
        System.out.println(list);
       ArrayList<Integer>result=new ArrayList<>();
        for (Integer each: list) {
            if(result.contains(each)){
                continue;
            }
                result.add(each);

        }
        System.out.println(result);
    }

    //Remove  the duplicate elements in an array list

}
