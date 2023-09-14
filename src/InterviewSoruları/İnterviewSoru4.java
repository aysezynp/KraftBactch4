package InterviewSoruları;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class İnterviewSoru4 {
    //Java sorusu için faydalı bilgi:  bir stringdeki
    //replaceAll("[^0-9]", "")  --->  rakam dışındaki karakterleri siler
    //replaceAll("[0-9]", "") ---> rakamları siler
    //replaceAll("[0-9A-Za-z]", "")  --> rakam, büyük harf ve küçük harf dışındakileri siler
    public static void main(String[] args) {

        String str = "red2 blue3 black4 green1";
        String str1="pink1 brown4 purple2 green5 black3";
        System.out.println(orderColors(str));
        System.out.println("orderColors(str1) = " + orderColors(str1));

    }
    public static String orderColors(String str){
        String[]strArr=str.split(" ");
        String result="";
        for (int i = 0; i <strArr.length ; i++) {
           strArr[i]=(strArr[i].substring(strArr[i].length()-1)).concat(strArr[i].substring(0,strArr[i].length()-1));

           }
        Arrays.sort(strArr);
        for (String r:strArr) {
            result+=r+" ";
        }
        result=result.replaceAll("[0-9]", "");
        return result;
    }
}
