package day30_Review;

public class C02_DigitsLetterSpecialChars {
    public static void main(String[] args) {
     seperateCharacters("ABCDExyz1234567890) (*&^%$#@!");
    }


 /*Create a method that takes a String and returns 3 different String of Letters, digits and special chars
     * of that string. space is not considered as a special char */

    public static void seperateCharacters(String str) {
        String letters = "";
        String digits = "";
        String specialChars = "";
        for (int i = 0; i < str.length(); i++) {//checks if ch is A_Z
            char ch = str.charAt(i);//each char of str
            if (ch >= 'A' && ch <= 'Z') {
                letters += ch;
            } else if (ch >= 'a' && ch <= 'b') {
                letters += ch;
            } else if (ch >= '0' && ch <= '9') {
                digits += ch;
            } else {
                if (ch != ' ')
                    specialChars += ch;
            }
        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);

    }


















}



