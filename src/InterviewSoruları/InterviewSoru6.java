package InterviewSoruları;

import javax.naming.ldap.Control;
import java.util.Stack;

public class InterviewSoru6 {
    //valid parantheses : verilen bir string'de parantezler uygun olarak açılıp kapandığını kontrol eden metod..
    //eğer uygun ise true, değilse false sonucunu vermeli..
    //valid nasıl kontrol edilecek:
    //1- eğer bir parantez açılmış ise kapanmalı
    //2- açık parantez kalmamalı
    //3-açılmamış parantez kapanmamalı (düzenlendi)
    public static void main(String[] args) {
        String str1 = "())";
        String str2 = "()(()(()))";
        String str3 = "(()))()()(()";
        String str4 = "())(";


        System.out.println("controlParenthesis(str4) = " + controlParenthesis(str4));
        System.out.println("controlParenthesis(str3) = " + controlParenthesis(str3));


    }
public static boolean controlParenthesis(String str){
        while(str.contains("()")){
            str=str.replace("()","");}

        return str.isEmpty();
}

        public static boolean controlParenthesis1 (String str) {
            Stack<Character>stack = new Stack<>();

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(') {
                    stack.push(str.charAt(i));
                } else if (str.charAt(i) ==')') {
                    if (stack.isEmpty()) {
                        return false;
                    }

                    char open = getOpenParent(str.charAt(i));
                    char stackOpen = stack.pop();
                    if (stackOpen != open) {
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        }

        public static char getOpenParent(char c) {
            if(c==')'){
                return '(';
            }else
                return 'i';
    }

   public static boolean controlParenthesis2(String str){
       char[] chars = str.toCharArray();
       int count=0;
       for (int i = 0; i < chars.length; i++) {
           if(chars[i]=='('){
               count++;
           }
           if(chars[i]==')'){
               count--;
           }
           if(count<0){
               return false;
           }
       }
       return count==0;
   }


}








