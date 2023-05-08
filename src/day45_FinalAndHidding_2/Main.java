package day45_FinalAndHidding_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
     //   FinalAndHiiding obje1=new FinalAndHiiding();
     //   FinalAndHiiding obje2=new FinalAndHiiding();


       final ArrayList<String>arrayList=new ArrayList<>();
        ArrayList<String>arrayList1=new ArrayList<>();
     //  arrayList=arrayList1;arrayList final old. için referansı değiştiremem
       // arrayList1=arrayList;//yapabilirim

       arrayList.add("Harun");
       arrayList.add(0,"Mehmet");
       arrayList.add("ahmet");//mehmet,harun,ahmet
       arrayList.remove(1);
    //    System.out.println(arrayList.get(1));

      /*  A a=new A();
        System.out.println(a.x);
        B b=new B();
        System.out.println(b.x);

        A.metot();
        B.metot();
        System.out.println(A.y);
        System.out.println(B.y);*/



    }

}
