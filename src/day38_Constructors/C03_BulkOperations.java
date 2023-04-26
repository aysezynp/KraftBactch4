package day38_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class C03_BulkOperations {
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
        ArrayList <Integer>list1=new ArrayList<>();
        list1.addAll(list);
        ArrayList <Integer>list2=new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        System.out.println("..................................");
        ArrayList <String> jobTitles=new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA","Full Stack Automation Engineer"," Java Developer",
                "SDET","Software Development Engineer in Test", "Test Engineer"));
        System.out.println(jobTitles);



    }
}
