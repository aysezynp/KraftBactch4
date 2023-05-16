package day54_LoopsAndMAp;

import java.util.*;

public class C03_MapExample {
    public static void main(String[] args) {
       // Map map=new HashMap<>();1.jenerayon
        //   key    value
      /*  Map<String, String> map = new HashMap<>();
        map.put("12345", "Harun");//collction daki add yerine put
        map.put("123456", "Harun2");
        map.put("1234567", "Harun3");
        System.out.println(map.get("123456"));//datayı ekrana key ile çağırıyoruz*/

        //manav meyveler ve fiyatlar

     Map<String,Double>meyveFiyat=new HashMap<>();
        meyveFiyat.put("elma", 3.75);
        meyveFiyat.put("elma", 3.90);//yeni elma yı eskisinin üzerine yazar,iki kere yazmaz, aynı obje ama fiyat değişti
        meyveFiyat.put("muz", 56.90);
        meyveFiyat.put("çilek", 50.0);
        meyveFiyat.put("armut", 30.0);
        //  meyveFiyat.remove("elma");//elmaların hepsini siler
        //  meyveFiyat.clear();//hepsini siler

        System.out.println(meyveFiyat.containsKey("elma"));
        System.out.println(meyveFiyat.containsValue(56.90));
        Set<String>set=meyveFiyat.keySet();
        set.forEach(x-> System.out.println(x));
        System.out.println(".......................");
        for (String str:set) {
            System.out.println(meyveFiyat.get(str));
        }

        System.out.println(set);



        //TreeMap {armut=30.0, elma=3.75, muz=56.9, çilek=50.0} key e göre doğal sıralama yapıyor,
        // HashMap {{muz=56.9, elma=3.75, armut=30.0, çilek=50.0} HAsh tablosuna göre sıralama yapıyor.

        System.out.println(meyveFiyat);

        Map <Integer,String> map=new TreeMap<>();
        map.put(35,"İzmir");
        map.put(34,"İstanbul");
        map.put(06,"Ankara");
        map.put(07,"Antalya");

        Set<Integer>set2=map.keySet();
        set2.forEach(x-> System.out.print(x+" "));
        for (Integer y:set2) {
            System.out.println(y+","+map.get(y));
        }

        }


















    }



