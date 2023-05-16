package day55_MapAndFinish;

import java.util.HashMap;
import java.util.Map;

public class C04_MapExample {
    public static void main(String[] args) {
        Ogrenci ogrenci=new Ogrenci("Harun","Koç",15);
        Ogrenci ogrenci2=new Ogrenci("ayse","Calıskan",17);
        Ogrenci ogrenci3=new Ogrenci("Hatice","Akıllı",18);

       Map<Integer,Ogrenci> map=new HashMap<>();
       map.put(ogrenci.getNo(),ogrenci);
       map.put(ogrenci2.getNo(),ogrenci2);
       map.put(ogrenci3.getNo(),ogrenci3);

       map.get(18).ekleDers("Almanca");
       map.get(17).ekleDers("İngilizce");
        System.out.println(map.get(17).getIsim());
        System.out.println(map.get(17).getDersler());
        System.out.println(map.get(17).toString());
    }
}
