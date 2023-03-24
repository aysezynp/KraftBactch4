package day07_Aritmetic_Operators;

import java.util.Scanner;

public class ScannerExamples {

    public static void main (String[]args){

        /*Scanner scan= new Scanner (System.in);
        System.out.print ("Lütfen bir kelime giriniz:");
        String str= scan.nextLine();
        System.out.print ("girdiğiniz kelime "+str+" dir." );

        System.out.print ("Kimya: ");
        int k= scan.nextInt();
        System.out.print ("Fizik: ");
        int f= scan.nextInt();
        double ortalama= ((double)f+k)/2;
        System.out.print ("Ortalama="+ ortalama);*/

        //Örnek: Ali’nin doğum yılını kullanıcıdan alarak yaşını ekrana getiren
        //programı yazınız?

       /* Scanner scan=new Scanner (System.in);
        System.out.print("Ali'nin doğum yılı: ");
        int dogumYili= scan.nextInt();
        int yas= 2023-dogumYili;
        System.out.print ("Ali'nin yaşı: "+yas);*/

        //Ali fizik dersinden 92, kimya dersinden 55, matematik dersinden 89
        //almıştır.  Konsoldan bu değerleri kullanıcıya girdirerek ekrana Ali’nin not
        //ortalamasını yazdırın.

        Scanner scan= new Scanner (System.in);
        System.out.print ("Fizik:");
        int f= scan.nextInt();
        System.out.print ("Kimya:");
        int k=scan.nextInt();
        System.out.print ("Matematik:");
        int m=scan.nextInt();
        double notOrtalama= ((double)f+k+m)/3;
        System.out.println("notOrtalama = " + notOrtalama);




    }
}
