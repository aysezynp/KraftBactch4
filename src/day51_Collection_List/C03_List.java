package day51_Collection_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class C03_List {
    public static void main(String[] args) {
        List<Integer>list1=new ArrayList<>();
        list1.addAll(Arrays.asList(5,10,15,20,25));
        list1.add(5);
        System.out.println(list1);
        System.out.println(list1.get(2));//arrayLİst is better than Linkedlist wrt get() feature

        List<Integer>list2=new ArrayList<>();
        list2.addAll(Arrays.asList(5,10,15,20,25));
        list2.add(5);
        list2.add(9);
        list2.remove(list2.indexOf(9));
        System.out.println(list2);
        System.out.println("list2.get(3) = " + list2.get(3));

        List<Integer>list4=new Stack<>();
        list4.addAll(Arrays.asList(5,10,15,20,25));
        System.out.println("((Stack)list4) = " + ((Stack) list4));
        System.out.println("((Stack) list4).peek() = " + ((Stack) list4).peek());
        System.out.println("((Stack) list4).pop() = " + ((Stack) list4).pop());
        System.out.println("list4 = " + list4);
        System.out.println("((Stack) list4).push(30) = " + ((Stack) list4).push(30));
        System.out.println("((Stack) list4) = " + ((Stack) list4));
    }

}
