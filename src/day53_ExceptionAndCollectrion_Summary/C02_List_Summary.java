package day53_ExceptionAndCollectrion_Summary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

    public class C02_List_Summary {
        public static void main(String[] args) {
            List<String> list=new ArrayList<>();

            list.addAll(Arrays.asList("Harun","Mehmet","Ahmet"));
            list.add("celal");
            System.out.println(list);
            System.out.println(list.size());
            System.out.println(list.isEmpty());
            System.out.println(list.remove(0));
            System.out.println(list);//Mehmet,Ahmet,Celal
            list.addAll(Arrays.asList("Harun","Mehmet","Ahmet"));//Mehmet,Ahmet,Celal,Harun,Mehmet,Ahmet
            //list.removeAll(Arrays.asList("Mehmet","Ahmet"));//Celal,Harun
            //System.out.println(list);
            //list.retainAll(Arrays.asList("Mehmet","Ahmet"));
            //System.out.println(list);
            System.out.println(list.contains("Harun"));
            list.containsAll(Arrays.asList("Mehmet","Ahmet","Mahmut"));
            list.clear();
            System.out.println(list);

        }
    }


