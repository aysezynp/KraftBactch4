package mentoring;

import java.util.Arrays;

public class ArraysMethod {
    public static void main(String[] args) {
        String names[]={"ayşe","emine","umit","ugur","engin","sener","serkan"};

        for (String s:names) {
            System.out.print(s+" ");
        }
        System.out.println();
        //toString
        System.out.println("toString ile yazdırma "+Arrays.toString(names));

         //sort elemanları sıralar
        Arrays.sort(names);
        System.out.println("Sort edilmiş hali"+ Arrays.toString(names));

    }



}
