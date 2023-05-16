package day50_Exceptions_Collection;



import day48_OOP_Review.ScrumTeam.Person;


import java.util.ArrayList;
import java.util.Arrays;

public class C06_Collection_1 {
    public static void main(String[] args) {

        ArrayList<Person> arrayList = new ArrayList<>();
        Person person1 = new Person("harun", 25, 'm');
        Person person2 = new Person("mehmet", 34, 'm');
        Person person3 = new Person("eda", 43, 'f');

        arrayList.add(person1);
        arrayList.add(person2);
        arrayList.add(person3);
        System.out.println(arrayList);

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(25);
        arrayList1.add(25);
        arrayList1.add(35);


        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(25);
        arrayList2.add(45);
        arrayList2.add(55);

        System.out.println(arrayList1.size());
        System.out.println(arrayList1.contains(25));
        arrayList1.addAll(arrayList2);
        //25,25,35,25,45,55

        System.out.println(arrayList1.size());
        // System.out.println(arrayList1.isEmpty());
        //  arrayList1.clear();
        // arrayList1.remove(0);
        // arrayList1.removeAll(arrayList2);
        //25,25,35,25,45,55 içinden 25,45,55 çıkar diyor 25 e bak tüm 25 leri sil,45 e bak tüm 45 leri sil
        //
        //   System.out.println(arrayList1.get(0));
        //   System.out.println(arrayList1.size());
        //   System.out.println(arrayList1);
        //   System.out.println(arrayList1.contains(25));
        System.out.println(arrayList1.containsAll(arrayList2));
        System.out.println(arrayList1);
    }
}