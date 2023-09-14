package InterviewSoruları;

import day44_FinalAndHiding.C;

import java.awt.List;
import java.sql.SQLOutput;
import java.util.*;
import java.util.concurrent.Callable;

public class InterviewSoru {
    public static void main(String[] args) {


        String str = "samsung,'OEM Samsung Washing Machine Pulsator Washplate Cap Shipped With WA48J7700AW, WA48J7700AW/A2, WA48J7700AW/AA', 20916," +
                "samsung,'OEM Samsung Chrome Washing Machine Washplate Pulsator Cap Shipped With WA52M7750AV, WA52M7750AV/A4, WA52M7750AW, WA52M7750AW/A4', 91995," +
                "samsung,'SAMSUNG Washing Machine Spring Hanger, DC61-01257M', 22970," +
                "samsung,'Samsung DC97-17022B Assy Detergent', 32959," +
                "samsung,'Samsung DC66-00470A DAMPER SHOCK', 29981," +
                "samsung,'DC64-00519D Samsung Washing Machine Door Lock Washer Dryer Dishwashe -MP#GH4498 349Y49HBRG9109150', 52000," +
                "samsung,'Samsung DC97-16991A Assembly Filter', 13000";


        String[] array = str.split("samsung,'");
       // System.out.println(Arrays.toString(array));
        for (String s : array) {
            System.out.println(s+ " ");
        }

        System.out.println(("......................................."));

        Map<String, String> mapList = new TreeMap<>();

        for (int i = 1; i < array.length; i++) {
            String[] split = array[i].split("',");
            mapList.put(split[1], split[0]);
        }
        //1.YOl foreach ile yazdırma
        mapList.forEach((k, v) -> System.out.println("samsung,'" + v + "'," + k));

        System.out.println(("......................................."));

        //2.yol mapList key üzerinden yazdırma
        Iterator<String> iterator = mapList.keySet().iterator();
        Iterator<String>iterator1=mapList.values().iterator();


      //  while(iterator.hasNext()){
        //            String key=iterator.next();
        //            System.out.println("samsung,'"+mapList.get(key)+"',"+key);
        //   }

        //3.YOl mapList value üzerinden yazdırma
        while(iterator1.hasNext()){
            String value=iterator1.next();
            System.out.println("samsung,'"+value+iterator.next());
        }

    }

}

