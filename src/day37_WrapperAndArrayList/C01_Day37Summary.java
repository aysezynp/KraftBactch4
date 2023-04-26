package day37_WrapperAndArrayList;

public class C01_Day37Summary {
    public static void main(String[] args) {
        /*Boolean b = Character.isDigit(Integer.toString(100).split(" ")[0].charAt(0));
        // "100"                              [1,0,0]  "1"       '1'

        System.out.println(b);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println("Integer.max(40,60) = " + Integer.max(40, 60));

        String s="5";
        Integer k=Integer.valueOf(s);// return Integer
        int x=Integer.parseInt(s);//return int */

        //Şifreleme validasyon isim/soyisim**21414/=

        System.out.println("nameControl(\"Har/un bey   \") = " + nameControl("Har/un bey   "));
        if(nameControl("Harun bey")){
            System.out.println("Password giriniz");
    }else{
            System.out.println("hatalı işlem isim soyisim tekrar deneyiniz");
        }
    }

    public static boolean nameControl(String str){
        //Kriterler sayı olmaz
        //boşluk haricinde karakter olamaz

        for (int i = 0;  i<str.length() ; i++) {
            if(Character.isDigit(str.charAt(i))||!Character.isLetter(str.charAt(i))){
                if(str.charAt(i)!=' '|| str.charAt(i)!='-'){
                  return false;
                }
            }
        }
        return true;
    }










}