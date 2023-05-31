package day55_MapAndFinish;

import day48_OOP_Review.ScrumTeam.Person;

import java.util.HashMap;
import java.util.*;

public class C04_MapExample {
    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci("Harun", "Koç", 15);
        Ogrenci ogrenci2 = new Ogrenci("ayse", "Calıskan", 17);
        Ogrenci ogrenci3 = new Ogrenci("Hatice", "Akıllı", 18);


    /*    List<Ogrenci> list = new ArrayList<>();//mesela burda binlerce öğrenci var ve ben birini çağırmak istiyorum,
        list.addAll(Arrays.asList(ogrenci1, ogrenci2, ogrenci3));
        System.out.println(list);
        //mesela burda binlerce öğrenci var ve ben birini çağırmak istiyorum,haticeyi bulmak istiyorum

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getIsim().equals("Hatice")) {
                System.out.println(list.get(i).getNo());
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNo() == 18) {
                list.get(i).ekleDers("Almanca");
                break;
            }
        }

        System.out.println(ogrenci3.getDersler());*/


     /* Map<Integer,Ogrenci>map=new HashMap<>();
        map.put(ogrenci1.getNo(),ogrenci1);
        map.put(ogrenci2.getNo(),ogrenci2);
        map.put(ogrenci3.getNo(),ogrenci3);
        System.out.println(map);

        map.get(18).ekleDers("Almanca");
        map.get(17).ekleDers("ingilizce");

        System.out.println(map.get(18));
        System.out.println(map.get(17));
        System.out.println(map.get(17).getIsim());*/

        Map<Integer, Ogrenci> map = new HashMap<>();
        map.put(ogrenci1.getNo(), ogrenci1);
        map.put(ogrenci2.getNo(), ogrenci2);
        map.put(ogrenci3.getNo(), ogrenci3);
        System.out.println(map);

        Map<Integer, Person> person = new HashMap<>();
        Person person1 = new Person("ayşe", 23, 'f');
        person.put(12, person1);

        List<Map> list = new ArrayList<>();//Lİstin içinde map objelerini tutar.
        list.add(map);
        list.add(person);
        System.out.println(list);

        Map<String, ArrayList> map1 = new TreeMap<>();

        Map<Integer, String> map2 = new TreeMap<>();
        map2.put(12, "harun");
        map2.put(3, "Çiçek");


        Map<String, Map<Integer, String>> yeniMap = new TreeMap<>();
        yeniMap.put("13", map2);
        System.out.println(yeniMap.get("13"));
        System.out.println(yeniMap.get("13").get(3));
        System.out.println(yeniMap.get("13").get(12).equals("harun"));




    }

}