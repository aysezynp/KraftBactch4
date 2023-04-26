package day37_WrapperAndArrayList;

import java.util.ArrayList;

public class C04_ArrayList3 {
    public static void main(String[] args) {
//Birinci arrayList e elma, armut, kayısı, üzüm, erik;
//İkinci arrayListe e armut, kayısı, üzüm değerlerini atayalım ve
//İlk arrayList in içinden ikinci arrayList i çıkartalım.

        ArrayList<String>fruit1=new ArrayList<>();
        fruit1.add("elma");
        fruit1.add("armut");
        fruit1.add("kayısı");
        fruit1.add("üzüm");
        fruit1.add("erik");

        ArrayList<String>fruit2=new ArrayList<>();
        fruit2.add("armut");
        fruit2.add("kayısı");
        fruit2.add("üzüm");

        fruit1.removeAll(fruit2);
        System.out.println(fruit1);

    }
}
