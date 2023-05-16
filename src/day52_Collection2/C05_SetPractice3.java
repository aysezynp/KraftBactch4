package day52_Collection2;


import java.util.*;

public class C05_SetPractice3 {

    public static void main(String[] args) {
   String[]arr={"book","book","notebook","pen","pencil","pen","spoon","ruler","phone","mirror","phone","brush"};

        Set<String>uniqueItemsInMyBag=new HashSet<>(Arrays.asList(arr));
        System.out.println(uniqueItemsInMyBag);

        Set<String>uniqueItemsInMyBag2=new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println(uniqueItemsInMyBag2);

        Set<String>uniqueItemsInMyBag3=new TreeSet<>(Arrays.asList(arr));
        System.out.println(uniqueItemsInMyBag3);




    }
}
