package InterviewSoruları;

import java.awt.*;
import java.awt.List;
import java.util.*;

public class InterviewSoru3 {
    public static void main(String[] args) {
        //ava sorusu: Milano'dan yapılan bir tester interviewde sorulmuş..
        //String str="128 2 3693 65 89 25 10" str içerisindeki boşlukla ayrılmış sayıların sayı değerleri toplanarak
        // küçükten büyüğe dizili olarak yeniden bir stringe tanımlayan metod nedir?
        // Bu soru için cevap String result="1 2 7 11 11 17 21" şeklinde olmalıdır.
        // (düzenlendi)
        //[10:22]
        String str="128 2 3693 65 89 25 10";
        System.out.println(sortOfNumbers(str));
    }

    /**
     *
     * @param str
     * @return
     */
   public static String sortOfNumbers(String str){
       ArrayList<Integer>list=new ArrayList<>();
       String[] array = str.split(" ");
         for (int i = 0; i < array.length; i++) {
            int number=Integer.parseInt(array[i]);
            Integer sumOfDigits=sumOfDigits(number);
            list.add(sumOfDigits);
        }
       Collections.sort(list);
       String result=list.toString().replace(",","").replace("[","\"").replace("]","\"");
       return "String result= ".concat(result);
    }

    /**
     *
     * @param number
     * @return
     */
   public static int sumOfDigits(int number){
       int total=0;
       int lastDigit=number%10;
       total=lastDigit;
       number=number/10;
    while(number!=0){
         lastDigit=number%10;
         total+=lastDigit;
         number=number/10;
    }
    return total;
   }

}


