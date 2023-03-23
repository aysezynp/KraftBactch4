package day08_ScannerAndOperators;

public class C10_Odev2_3_4 {
    public static void main(String[]args){

        int number1 =20;
        int number2 =30;
        int number3 =40;
        int sum = number1+number2+number3;
        System.out.println(number1+"+"+ number2+"+"+number3+"="+sum);

        int km= 100;
        double mil= 100*0.625;
        System.out.println(km+" km "+mil+ " mil yapar.");


        int yaricap= 3;
        double area= Math.PI*Math.pow(yaricap,2);
        double perimeter= 2*Math.PI*yaricap;
        System.out.println(yaricap+" cm yarıçaplı dairenin çevresi; "+ perimeter+ " cm'dir alanı ise "+ area+ " cm2'dir.");

    }
}
