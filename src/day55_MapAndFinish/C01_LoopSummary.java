package day55_MapAndFinish;

import java.util.*;

public class C01_LoopSummary {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList();
        list.add(15);
        list.add(20);
        for (Integer x:list) {
            System.out.println(x);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));

        }
        int i=0;
        while(i< list.size()){
            System.out.println(list.get(i));
            i++;
        }
         i=0;//yukarıda i arttığı için sıfırlıyoruz.

        do{
            System.out.println(list.get(i));
            i++;// i burda olmalı
        }while(i< list.size());



        }



    }

