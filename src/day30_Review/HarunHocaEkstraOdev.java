package day30_Review;

public class HarunHocaEkstraOdev {
    public static void main(String[] args) {
        System.out.println("SORU 1:");
        System.out.println("containMethod(\"sevgi emek ister\",\"sev\") = " + containMethod("sevgi emek ister", "sev"));
        System.out.println("containMethod(\"sevgi emek ister\",\"ev\") = " + containMethod("sevgi emek ister", "ev"));
        System.out.println("containMethod(\"sevgi emek ister\",\"ali\") = " + containMethod("sevgi emek ister", "ali"));
        System.out.println(".................................................");
        System.out.println("SORU 2:");
        System.out.println("binaryMi(112) = " + binaryMi(112));
        System.out.println("binaryMi(100) = " + binaryMi(100));
        System.out.println("binaryMi(111) = " + binaryMi(111));
        System.out.println("binaryMi(911) = " + binaryMi(911));
        System.out.println("binaryMi(321) = " + binaryMi(321));
        System.out.println(".................................................");
        System.out.println("SORU 3:");
        System.out.println("ebob(1,7) = " + ebob(1, 7));
        System.out.println("ebob(6,12) = " + ebob(6, 12));
        System.out.println(".................................................");
        System.out.println("SORU 4:");
        System.out.println("ekok(36, 48) = " + ekok(36, 48));
        System.out.println("ekok(24,60) = " + ekok(24, 60));
        System.out.println(".................................................");
        System.out.println("SORU 5:");
        System.out.println("isEmpty(\"\") = " + isEmpty(""));
        System.out.println("isEmpty(\"hayal\") = " + isEmpty("hayal"));
        System.out.println("isEmpty(\" \") = " + isEmpty(" "));
    }

    //SORU 1: contain() kullanmadan contain metodunu yazınız? (2 kelime alan ve 2.kelimenin ilk kelimenin içinde olup olmadığını kontrol eden
    public static boolean containMethod(String str, String target) {
        if (str == null) return false;
        str = str.toLowerCase();
        target = target.toLowerCase();
        return str.indexOf(target)!=-1;
    }

    //SORU 2: Girilen bir sayının Binary olup olmadığını bulan bir metot yazın. 110 true  112 false
    public static boolean binaryMi(int num) {
        String num1 = num + "";
        int count = 0;
        for (int i = 0; i < num1.length(); i++) {
            if (num1.charAt(i)=='1'||num1.charAt(i)=='0') {
            }else{ count++;
            }
        }if(count!=0) return false;
        else return true;
    }

    //SORU 3:Girilen 2 adet sayının EBOB'unu bulan bir metot yazınız (en büyük ortak bölen)
    public static int ebob(int num1, int num2) {
        int result = 0;
        int min=Math.min(num1, num2);
        for (int i = 1; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0)
                result = i;
        }
        return result;
    }

    //SORU 4: Girilen 2 adet sayının EKOK'unu bulan bir metot yazınız (en küçük ortak kat)
    public static int ekok(int num1, int num2) {
        int result = 0;
        for (int i = num1 * num2; i > 0; i--) {
            if (i % num1 == 0 && i % num2 == 0)
                result = i;
        }
        return result;
    }

    //public static int ekok(int a,int b){
    //
    // return a*b/ebob(a,b);
    // }

    //SORU 5: Empty() metodunu kullanmadan girilen bir değerin boş (null değil) olup olmadğunu kontrol eden bir motot yazınız.

    public static boolean isEmpty(String str) {
     if(str==null)return false;
     else if(str.length()==0) return true;
     else return false;
    }


}











