package day13_ForLoops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {
        /*
         kullanicidan pozitif bir tamsayi alin
         sayi cift ise "sayi cift"
         degilse "tek sayi" yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir pozitif bir sayı alınız:");
        int num=scan.nextInt();

        if (num%2==0){
            System.out.println("çift sayı");
        }
        else {
            System.out.println("tek");
        }
        System.out.println(".......................................");

        System.out.println(num%2==0? "Çift sayi": "Tek sayi");
        String result= (num%2==0? "Çift sayi": "Tek sayi");
        System.out.println(result);



    }
}
