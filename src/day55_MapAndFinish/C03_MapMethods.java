package day55_MapAndFinish;

import java.util.HashMap;
import java.util.*;
import java.util.TreeMap;

public class C03_MapMethods {
    public static void main(String[] args) {
   /*<Integer,String> map=new TreeMap<>();
    map.put(12,"Harun koç");
    map.put(13,"Ziya arslan");*/

        Map<Integer,String> map2=new TreeMap<>();
        map2.put(12,"Harun koç");
        map2.put(13,"Ziya arslan");

     //  System.out.println(map.get(13));
     //  System.out.println(map.values());//valueları Collection olarak döndüd
     //  Collection<String>collection=map.values();

     /* Set<Integer>set=map.keySet();//keyleri set içerisine atar
      List<Integer>list=new ArrayList<>();
      set.forEach(x->list.add(x));
      Collections.sort(list);
      Integer ID=Collections.max(map.keySet())+1;
      Integer ID2= list.get(list.size()-1)+1;
      map.put(ID,"ayşe yılmaz");
     //map.clear();
        map.containsKey(12);//true

        System.out.println("map.remove(12) = " + map.remove(12));*/
        //System.out.println(map.remove(12, "Harun koç"));

        //System.out.println(map.entrySet());


        //System.out.println("map.equals(map2) = " + map.equals(map2));
       // map.forEach((k,v)-> System.out.println("key: "+k+", value: "+v));
       // System.out.println(map.isEmpty());
        //map.putAll(map2);
        Map<Integer,String> map=new TreeMap<>();
        map.put(12,"Harun koç");
        map.put(13,"Ziya arslan");
      //  System.out.println(map.replace(12, "Ayşe Aşcı"));//String döndürür eski veriyi döndürür ve işlemi yapar
      //  System.out.println(map.replace(12,"Harun koç","Emine Hanım"));
      //  System.out.println(map.replace(15,"Harun koç","Emine Hanım"));

        System.out.println(map);
    }
}
