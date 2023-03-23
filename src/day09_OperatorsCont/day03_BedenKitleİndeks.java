package day09_OperatorsCont;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class day03_BedenKitleİndeks {

    public static void main(String[] args) {

        /*
        Kullanıcıdan aldığınız boy ve kilo değerlerine göre kullanıcının beden kitle indeksini bulun.

        Beden Kitle İndeksi : Kilo / (Boy(m) * Boy(m))

        */

        Scanner scan= new Scanner (System.in);

        System.out.print ("Kilonuzu giriniz (örnek 80):");
        int kilo= scan.nextInt();
        System.out.print ("Boyunuzu giriniz (örnek:1.80):");
        double boy= scan.nextDouble();

        double bedenKitleEndeksi= kilo/(boy*boy);
        System.out.println("Kilonuz : "+ kilo);
        System.out.println("Boyunuz: "+boy);
        System.out.println ("Beden Kitle Endeksi: "+ bedenKitleEndeksi);
















    }


}
