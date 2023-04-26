package day37_WrapperAndArrayList;

import java.util.ArrayList;
import java.util.Random;

public class T03_day37slayt_Prac4 {
    public static void main(String[] args) {
        //random(20); bir method oluşturup 20 size li 20 ye kadar random
        //rakamlardan oluşan bir ArrayList döndüren method oluşturalım.
        //Random class using example/Random class kullanım örneği
        //Random rm = new Random();
        //rm.nextInt(20)random20()
        System.out.println(random20(20));

    }

    public static ArrayList<Integer> random20(int capasity) {
        Random rm = new Random();
        ArrayList<Integer> arrListNew = new ArrayList<>(capasity);
        for (int i = 0; i <capasity; i++) {
            arrListNew.add(rm.nextInt(20));
        }return arrListNew;
    }
}

