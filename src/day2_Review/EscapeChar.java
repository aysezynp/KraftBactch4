package day2_Review;

import java.sql.SQLOutput;

public class EscapeChar {
    public static void main(String[]args) {
        System.out.println("P\n\ta\nz\n\ta\nr\n\tt\ne\n\ts\ni");

     int num=9;
     byte by=127;
     short sh=558;
     long l= 22243565788L;
        //System.out.println(l);

        float f=5.8f;
        double d= 5.5;

        char c= 'h';
        boolean b= true;
        int num1= 1_000_000_000;
System.out.println(num1);

        byte byteMin=Byte.MIN_VALUE;
        byte byteMax=Byte.MAX_VALUE;

        short shortMin= Short.MIN_VALUE;
        Short ShortMax= Short.MAX_VALUE;

        System.out.println("byteMin = " + byteMin);
        System.out.println("byteMax = " + byteMax);
        System.out.println("shortMin = " + shortMin);
        System.out.println("ShortMax = " + ShortMax);

        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);

        System.out.println("Long.MIN_VALUE = " + Long.MIN_VALUE);
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);

        System.out.println("Float.MIN_VALUE = " + Float.MIN_VALUE);
        System.out.println("Float.MAX_VALUE = " + Float.MAX_VALUE);

        System.out.println("Double.MIN_VALUE = " + Double.MIN_VALUE);
        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);

    }
}
