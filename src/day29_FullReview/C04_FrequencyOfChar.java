package day29_FullReview;

public class C04_FrequencyOfChar {
    public static void main(String[] args) {
        System.out.println("frequencyOfChar(\"AAABBBC\",\'A\') = " + frequencyOfChar("AAABBBC", 'A'));
    }

//Write a method that can return the frequency of a char from a String
//
//            Ex:
//                str = "AAABBBC" ch = 'A'
//
//            Output:
//                3/

public static int frequencyOfChar(String str,char ch){
        int freq=0;
    for (int i = 0; i < str.length(); i++) {
        if(str.charAt(i)==ch){
            freq++;
        }
    }

    return freq;
}





















   /* public static int frequencyOfChar(String str, char ch) {
        int freq=0;
        for (int i = 0; i <str.length() ; i++) {
            char eachChar=str.charAt(i);
            if(eachChar==ch){
                freq++;
            }
        }

     return freq;
    }
*/



}