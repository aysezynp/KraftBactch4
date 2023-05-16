package day54_LoopsAndMAp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionSort {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(12,43,2,4,5,1,99,67);
        List<String>list2=Arrays.asList("Harum","Ahmet");
        System.out.println(list2.get(0));
        System.out.println("max(list) = " + max(list));
        Collections.sort(list2);
        System.out.println(list2.get(0));
    }
public static int max(List<Integer>list){
        List<Integer>copylist=Arrays.asList(12,43,2,4,5,1,99,67);
     //   Collections.copy(copylist,list);
        Collections.sort(copylist);
        return copylist.get(copylist.size()-1);

}
}
