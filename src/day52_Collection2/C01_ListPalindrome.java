package day52_Collection2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ListPalindrome {
    public static void main(String[] args) {
       List<String>list=new ArrayList<>();
       list.addAll(Arrays.asList("kazık","adanada","kazak","radar","ses","harun","ses","radar","ses"));
        System.out.println(findPalindromeInList(list));

    }
    //list içerisinde bulunan palindrom (terside kendisi ile ayni olan kelimeler)
    // kelimeleri ekrana yazdıran metodu yazınız.string olarak dönen metodu yazınızç a,kazak,radar,ses,harun
    //adanada,kazak,radar,ses



public static String findPalindromeInList(List<String>list){
      String result="";
    for (int i = 0; i < list.size(); i++) {
        String str= list.get(i);
        String reverse="";
        for (int j = str.length()-1; j>=0 ; j--) {
            reverse+=str.charAt(j);//substring(j,j+1)
            }
        if(str.equalsIgnoreCase(reverse)){
            result+=str+" ";
            list.removeAll(Arrays.asList(str));
            i--;}
        }return result;
    }




}




