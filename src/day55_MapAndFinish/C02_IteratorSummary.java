package day55_MapAndFinish;

import java.util.*;

public class C02_IteratorSummary {
    public static void main(String[] args) {

        Set<Integer> set=new TreeSet<>();
        set.add(12);
        set.add(8);
        set.add(35);
        set.add(27);

//8,12,27,35

   Iterator<Integer>iterator=set.iterator();
   while(iterator.hasNext()){
      if(iterator.next()>25){
      iterator.remove();
          }
      } System.out.println(set);

        set.forEach(y-> System.out.println(y));

        List<String>list=Arrays.asList("harun","Ahmet","Mehmet");
        list.forEach(x-> System.out.println(x+" Hoşgeldiniz"));
   }

    }

