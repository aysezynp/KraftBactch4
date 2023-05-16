package day52_Collection2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C04_SetPractice2 {
    public static void main(String[] args) {
        String str="Yattın mi \n" +
                "Yorgun musun\n" +
                "Uyu düşünme beni\n" +
                "Ben ki hiç düşünülmedim senden öncesi";

        //Bu String içinde kaç farkli harf var?




        Set<Integer> set1=new HashSet<>();
        set1.add(5);

        System.out.println("uniqueLetterCount() = " + uniqueLetterCount(str));


    }

    public static int uniqueLetterCount(String str){
    String []arr= str.replace(" ","").split("");
    Set<String>uniqueCharSet=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
               uniqueCharSet.add(arr[i]);
        }
         return uniqueCharSet.size();

            }


}
