package day24_StringClass_Cont;

public class C08_Palindrome {
    public static void main(String[] args) {
        /*String word="civic";
        String reverse="";
        for (int i=word.length()-1;0<=i;i--){
            reverse=reverse.concat(word.substring(i,i+1));
        }
         boolean isPalindrome=reverse.equals(word);
        System.out.println("isPalindrome = " + isPalindrome);*/


        //           01234 length=5
        String word="madam";
        String reversed="";
        for (int i=word.length()-1;0<=i;i--){
            reversed=reversed.concat(word.substring(i,i+1));

            }
        System.out.println(reversed);


        System.out.println("............................................");
        String word1="madam";
        String reversed1="";
        for(int i=word1.length()-1;0<=i;i--){
            reversed1+=word1.charAt(i);
        }

        System.out.println(reversed1);
        boolean palindrome=word1.equals(reversed1);
        System.out.println("palindrome = " + palindrome);

    }

    }



