package day54_LoopsAndMAp;

import java.util.*;

public class C01_Loops {
    public static void main(String[] args) {

   /* String[]arr={"Harun","Mehmet","Ahmet"};
        for  (String str:arr) {
            System.out.print (str+" ");

        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }*/
  //   Set set1=new HashSet<>();                //en eski javada bu şekilde yazılıyordu bu da  Set<Object>set=new HashSet<>(); demekti. 1.varyasyon
    // Set <Integer>set2=new HashSet<Integer>();//daha sonra bu şekilde bir tanımlama oldu 2.varyasyon
     //Set<Integer>set3=new HashSet<>();        //en son varyasyonda sağdaki Integer a gerek olmadığı düşünüldü.

        //her üç varyasyonda kullanılabiliniyor

    List<Integer>list=new ArrayList<>();
    list.add(25);
    list.add(35);
    list.add(8);
    list.add(14);

     /*   for (Integer sayi:list) {
            System.out.print (sayi+" ");
        }
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            System.out.print (list.get(i)+" ");
        }
        System.out.println();*/

//25 den küçük olan sayıları silip List ekrana yazdırın.
//25,35,8,14
       /* for (int i = 0; i < list.size(); i++) {
            if(list.get(i)<25){
                list.remove(list.get(i));
                i--;
            }
                   }
        System.out.println(list);

        //25,35,8,14
        for (Integer sayi:list) { //for each loop ta ne kadar dönmesi gerektiğini size belirliyor.
                                  //25,35 i yazıp 8 e geldiğinde 8 küçük olduğundan siliyor 4 olan size 3 oluyor ve döngü sona eriyor 14 ü kontrol bile etmiyor
                                  // .For i ile yaparsak index i azaltabiliriz.
            if(sayi<25){
                list.remove(sayi);
            }
        }
        System.out.println(list);*/

        Set<Integer>set=new HashSet<>();
        set.add(25);
        set.add(35);
        set.add(8);
        set.add(14);
      /*  for (Integer sayi:set) {
            System.out.print(sayi+" ");

        }*/
        //for i ile yapamayız setlerde get metodu yok,index no alamıyoruz.

//Set içerisinde 25 den küçük olan sayıları silip Seti ekrana yazdırın.
        //25,35,8,14

     /*   Set<Integer>set1=new HashSet<>();
        for (Integer sayi:set) {
          if(sayi>=25){
              set1.add(sayi);
          }
        }
        System.out.println(set1);*/

     /*   Iterator<Integer>iterator=set.iterator();
        //25,35,8,14
        while(iterator.hasNext()){
            Integer sayi=iterator.next();
            if(sayi<25){
                iterator.remove();
            }
        }
        System.out.println(set);*/

     List<String>list1=Arrays.asList("Harun","Ahmet","Hasan");

    /* Iterator itr=list1.iterator();
        System.out.println("itr.next() = " + itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.hasNext());

       // System.out.println(itr.next());hata veriyor çünkü sona geldi*/


//ForEach METOT
        for (String str:list1) {
            System.out.println(str);
        }

        list1.forEach(x-> System.out.println(x));//list1 in elemenalrının tek tek x atar ve yazar
        set.forEach(y-> System.out.println(y));
        set.forEach(y-> System.out.println(y-2));

        set.forEach(y->list.add(y));// set in her bir elemanını list e ekledim
        System.out.println(list);
        }

    }




