package day37_WrapperAndArrayList;


import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class C02_ArrayList {
    public static void main(String[] args) {
        ArrayList<String>arrList=new ArrayList<>();//kapasite belirlememe gerek yok
        System.out.println(arrList.isEmpty());
        //add
        arrList.add("harun");
        arrList.add("ziya");
        System.out.println(arrList.isEmpty());
        //arrList.clear();       //arraylistin içerisini tamamen siler
        //System.out.println(arrList.isEmpty());
        //System.out.println(arrList.get(0));
        //System.out.println(arrList.get(1));
        //System.out.println(arrList.size());
        System.out.println(arrList);
        arrList.add(0,"mehtap");
        arrList.add(1,"ümit");
        System.out.println(arrList);
        arrList.remove(1);
        System.out.println(arrList);

        arrList.add(0,"ali");
        arrList.set(1,"mehmet");
        System.out.println(arrList);
        System.out.println(arrList.indexOf("mehmet"));
        System.out.println(arrList.indexOf("mahmut"));



    }
}