package mentoring;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Array {
    public static void main(String[] args) {
        //ArrayList=resizable array
        //ArrayLİst içine obje depolayabiliyoruz(String,Double,Integer.....)
        //primitive depolayamayız (int, boolean, double...)

        ArrayList<Integer>integers;//null
        integers=new ArrayList<>();
        float f=(float)4.2;
        if(f==4.2){
            System.out.println("a");
        }else System.out.println("b");


        ArrayList<Integer>integers1=new ArrayList<>();
        ArrayList<String>fruits=new ArrayList<>();
        ArrayList<Double>doubles=new ArrayList<>();//size vermek zorunda değiliz

        //add();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Strawberry");
        System.out.println(fruits);
     //   fruits.add(0,"At index 0");
    //    System.out.println(fruits);


        //get();
        System.out.println(fruits.get(0));
        System.out.println(fruits.get(1));
        System.out.println(fruits.get(2));

        //set();
        fruits.set(2, "Orange");
        System.out.println(fruits);

        //Remove an Item
        //remove();
        //1.Removing by index

        //fruits.remove(2);
        //System.out.println(fruits);

        //2.Removing by value;
        //fruits.remove("Banana");
        //System.out.println(fruits);


        //Size of ArrayList
        //size();

        System.out.println(fruits.size());//3

        fruits.remove("Banana");
        System.out.println(fruits.size());

        fruits.add(1,"Banana");
        System.out.println(fruits.size());

        //size değişebiliyor buna da dinamic size deniliyor
        for (int i = 0; i < fruits.size(); i++) {
            System.out.print(fruits.get(i)+" ");
        }

        //sort of ArrayLİst
        //Alphabetically

        //numerically

      /*  ArrayList<String>arrayList=new ArrayList<>();
       ArrayList<>arrayList1=new ArrayList<>();
        arrayList.add("Ali");
        arrayList.add(5);
        Object[]object={};
*/

    }

}
