package day08_ScannerAndOperators;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class C06_ScannerTask1 {
    public static void main(String[] args) {
        //kullanılan bir sayi alin
        //sayının karesini alin konsola yazdirin

        Scanner scan=new Scanner (System.in);
        System.out.print ( "Lütfen bir sayi girin:");
        int girilenSayi= scan.nextInt();
        System.out.println("Girilen sayi= "+girilenSayi);
        System.out.println("Girilen sayi= "+girilenSayi*girilenSayi);


        scan.close();


    }
}
