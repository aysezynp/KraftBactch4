package day08_ScannerAndOperators;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class C05_Scanner {


    public static void main(String[] args) {

        //1.adim Scanner objesi oluşturalım
        Scanner scan=new Scanner (System.in);

        //2.Kullaniciyi bilgilendir! Ne istediğinizi söyleyin
        System.out.print ("Lütfen isminiz giriniz:");

        //3. girilen bilgiyi içine koyabilceğiz variable oluşturun
        //oluşturduğumuz değişkenin içerisine, scanner objesi ile uygun mtodu çağırarak veriyi alın

        String name= scan.nextLine();
        System.out.println("Girilen isim: "+ name);

}
}
