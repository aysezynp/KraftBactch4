package day09_OperatorsCont;

import java.util.Scanner;

public class C07_PhoneNumber {
    public static void main (String[]args){

        Scanner input= new Scanner (System.in);
        System.out.print("Country code:");
        int countryCode= input.nextInt();
        System.out.print("Area code:");
        int areaCode= input.nextInt();
        System.out.print("Local number:");
        int localNumber= input.nextInt();
        System.out.println( "Your phone number is +"+"("+countryCode+")"+areaCode+"-"+localNumber);





    }
}
