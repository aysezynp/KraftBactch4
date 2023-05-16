package mentoring;


import java.util.*;


public class soru {
    public static void main(String[] args) {
     List<Integer>list1=new ArrayList<>();
     list1.addAll(Arrays.asList(2,2,5,6,9,5,8,4,6));
        System.out.println(uniqueNumbers(list1));

        List<String>list2=new ArrayList<>();
        list2.addAll(Arrays.asList("yakacak","bulacak","kalacak","sevgi","buluş","zamlanacak","yakacak"));
        System.out.println(endingWithAcak(list2));
    }

    //List'in içerindeki eşi olmayan (çifti olmayan) uniq sayıları bulun list olarak döndürelim ;
//2,2,5,6,9,5,8,4,6 //9,8,4
//5,6,9,5,8,4,6

    public static List<Integer> uniqueNumbers(List<Integer>list){
        List<Integer>list1=new ArrayList<>();
        int count=list.size();//9
        while(!list.isEmpty()){
            int temp=list.get(0);
            list.removeAll(Arrays.asList(list.get(0)));
            if(list.size()==count-1){
                list1.add(temp);
            }
            count=list.size();
                    }
        return list1;
    }



   public static Set<String> endingWithAcak(List<String>list){
        Set<String>result=new HashSet<>();
       for (int i = 0; i < list.size(); i++) {
           String str=list.get(i);
           if(str.endsWith("acak")){
               result.add(str);
           }

       }    return result;
   }


















    public static boolean sonuBitiyorsa (String str, String target){
        str = str.toLowerCase();
        target = target.toLowerCase();
        return str.endsWith(target);
    }



}