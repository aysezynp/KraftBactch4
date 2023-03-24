package day08_ScannerAndOperators;

public class C04_Castings {
    public static void main(String[] args) {
        float bodyTemperature= 36.5f;
        byte num1 = (byte) bodyTemperature;// explicit, narrowing, manual
        short num2 = (short) bodyTemperature;//explicit, narrowing, manual
        int num3= (int)bodyTemperature;//explicit, narrowing, manual
        float num4= bodyTemperature; //no casting
        double num5=bodyTemperature;//implicit,automatic, widening
        long num6= (long)bodyTemperature;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);


    }
}
