package day52_Collection2;





import java.util.*;

public class C03_SetPractice {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90));
        list.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90));
        list.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90));
        list.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90));
        System.out.println("list = " + list);
        System.out.println("list.get(3) = " + list.get(3));


        Set<Integer>hashset=new HashSet<>();                               //Random ve index no kullanamayız
         hashset.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,30,100));
         hashset.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,30,100));
         hashset.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,30,100));
         hashset.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,30,100));
         hashset.addAll(Arrays.asList(null,null,null,null));
         System.out.println("hashset = " + hashset);

        System.out.println(".................................................");
        Set<Integer>linkedHashSet=new LinkedHashSet<>();                     //insert Order Preserved
        linkedHashSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,30,100));
        linkedHashSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,30,100));
        linkedHashSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,30,100));
        linkedHashSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,30,100));
        linkedHashSet.addAll(Arrays.asList(null,null,null,null));
        System.out.println("linkedHashSet = " + linkedHashSet);

        System.out.println(".................................................");

       Set<Integer>treeSet=new TreeSet<>();                                   //Sorted Ascending
       treeSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,30,100));
       treeSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,30,100));
       treeSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,30,100));
       treeSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,30,100));
     //treeSet.addAll(Arrays.asList(null,null,null,null));//runtime exception treeset does not accept null values
       System.out.println("treeSet = " + treeSet);






    }

}
