package day20_CustomMethods_Overloading;

public class T03_IhsanHoca {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "Krafttech";

        int i2;
        double d2;
        String str;
        i2=sum(5);
        d2=sum(5.0);
        str=sum(" is the best place to learn");
        System.out.println(i+i2);
        System.out.println(d+d2);
        System.out.println(s+str);
    }
    public static int sum(int y) {
        return y;
    }
    public static double sum(double y) {
        return y;
    }
    public static String sum(String y) {
        return y;
    }
}