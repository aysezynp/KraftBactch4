package InterviewSoruları;

import java.util.ArrayList;

public class InterviewSoru5 {


    /**
     * Given a string s, return the longest palindromic substring in s.
     * Example 1:
     * <p>
     * Input: s = "babad"
     * Output: "bab"
     * Explanation: "aba" is also a valid answer.
     * Example 2:
     * <p>
     * Input: s = "cbbd"
     * Output: "bb"
     */
    public static void main(String[] args) {
        String str = "asddsk";
        System.out.println(theLongestPalindrome1(str));
    }


    public static String theLongestPalindrome(String str) {

        ArrayList<String> listpalindromes = new ArrayList<>();
        int max=0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length()+1; j++) {
                String sub=str.substring(i,j);
                if (reverseString(sub)&&sub.length()>max){
                    listpalindromes.add(sub);
                    max=sub.length();
                }
            }
        }

        return listpalindromes.get(listpalindromes.size()-1);

    }
    public static String theLongestPalindrome1(String str) {

        ArrayList<String> listpalindromes = new ArrayList<>();
        int max=0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length()+1; j++) {
                String sub=str.substring(i,j);
                if (reverseString(sub)&&sub.length()>max){
                    listpalindromes.add(0,sub);
                    max=sub.length();
                }
            }
        }
        return listpalindromes.get(0);

    }

    public static boolean reverseString(String str) {
        StringBuilder builder = new StringBuilder(str);
        return str.equals(builder.reverse().toString());
    }


}




