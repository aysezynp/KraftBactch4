package day10_UnaryLogicalOperAndReview;

public class T04_Unary2 {
    public static void main(String[]args){

        int i=10;
        i= --i+ ++i + --i + i++;
        System.out.println(i);

        int i2=10;
        i2= i2++ + i2-- * -i2++ * --i2;
        System.out.println (i2);

        int i3=10;
        i3= i3++-i3++/--i3*i3++;
        System.out.println (i3);



    }


}
