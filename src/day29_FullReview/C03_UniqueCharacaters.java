package day29_FullReview;

public class C03_UniqueCharacaters {
    public static void main(String[] args) {
        System.out.println("uniqueChar(\"AABCCD\") = " + uniqueChar("AABCCD"));
    }

    //Write a method that can return the unique characters from a String
    //
    //            Ex:
    //                input:
    //                    AABCCD
    //
    //                output:
    //                    BD
    //
    //            Hint: You will need indexOf() and lastIndexOf()
    //                  if the first and last index numbers of the character are same, then it's unique
    //

     public static String uniqueChar(String str){
        String result="";

         for (int i = 0; i <str.length() ; i++) {
             String ch=str.charAt(i)+"";
             if(str.indexOf(ch)==str.lastIndexOf(ch)){
                 result+=ch;
             }
         }return result;
     }








}
