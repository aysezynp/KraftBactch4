package day54_LoopsAndMAp;

import java.util.*;
public class C02_CollectionSort {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 43, 2, 4, 5, 1, 99, 67);
        List<String> list2 = Arrays.asList("Harun", "Ahmet");
        System.out.println(list.get(0));
        //System.out.println(max(list));//listteki max değeri veriyor
        //System.out.println(list.get(0));
        //System.out.println(Collections.max(list));//list teki max değeri veriyor.
        //Collections.reverse(list);//list i ters çeviriyor
        //System.out.println(list.get(0));

        int max=max2(list);
        System.out.println(list.get(0));// 12 olamsı gerekirken değiştiridiğim için 1 verdi


//Collections metodları orjinal yapıyı değiştirdiği için metodlarda yeni
// bir Array oluşturup değerleri onun içine atıp işlemlerimizi onun üzerinden yapmak daha sağlıklı
    }


    public static int max2(List<Integer> list) {                      //hatalı kullanım
        Collections.sort(list);
        return list.get(list.size() - 1);

    }

    public static int max(List<Integer> list) {                        //doğru kullanım
        List<Integer> copylist = new ArrayList<>();
        list.forEach(y -> copylist.add(y));//copylist.addAll(list);
        Collections.sort(copylist);
        return copylist.get(copylist.size() - 1);

    }

}

