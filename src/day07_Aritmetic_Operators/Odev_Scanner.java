package day07_Aritmetic_Operators;

 import java.util.Scanner;

public class Odev_Scanner {

    public static void main (String[]args){

        //ÖDEV:1: Yarıçapı kullanıcıdan alarak dairenin alanı ve çevresini
        //hesaplayın?

        Scanner scan= new Scanner (System.in);
        System.out.print ("r:");
        double r= scan.nextDouble();
        double area= Math.PI*Math.pow(r,2);
        double perimeter= 2*Math.PI*r;
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

        //Kullanıcıdan Fahrenheit değerini alarak Celsius değerini
        //ekrana yazdırın? (°C=(°F-32)/1.8)

        /*Scanner scan=new Scanner (System.in);
        System.out.print("Fahrenheit:");
        double f= scan.nextDouble();
        double c= (f-32)*1.8;
        System.out.println(f+ " Fahrenheit " + c + " Celcius'tur.");

        //Toplantı salonunda sıra ve her sırada kaç adet koltuk olduğunu ve Toplantıya
        //kaç kişinin katıldığını kullanıcıya girdirin.
        //1.Toplantı salonun toplam kapasitesi nedir?
        //2.Kaç adet boş koltuk vardır ?
        //3.Kaç adet sırada oturulmaktadır ?
        //4. Kaç sıra tamamen boş kalmıştır.
       // 5.Oturulan sıralarda kaç adet boş koltuk vardır?

       Scanner scan= new Scanner (System.in);
        System.out.print ("sıra:");
        int sira= scan.nextInt();
        System.out.print ("koltuk:");
        int koltuk = scan.nextInt();
        System.out.print ("katılan kişi sayısı:");
        int katilanKisi= scan.nextInt();
        //1.Toplantı salonun toplam kapasitesi nedir?
        int kapasite= sira*koltuk;
        System.out.println("kapasite = " + kapasite);
        //2.Kaç adet boş koltuk vardır ?
        int bosKoltuk=kapasite-katilanKisi;
        System.out.println("bosKoltuk = " + bosKoltuk);
        //3.Kaç adet sırada oturulmaktadır?
        int oturulanSira= katilanKisi/sira+1;
        System.out.println("oturulanSira = " + oturulanSira);
        //4. Kaç sıra tamamen boş kalmıştır.
        int bosSira= sira-oturulanSira;
        System.out.println("bosSira = " + bosSira);
        //5. Oturulan sıralarda kaç adet boş koltuk vardır?
        int oturulanSiradakiBosKoltuk= koltuk-katilanKisi%koltuk;
        System.out.println("oturulanSiradakiBosKoltuk = " + oturulanSiradakiBosKoltuk);

        Scanner scan= new Scanner (System.in);
        System.out.print("Saniye: ");
        int tsaniye= scan.nextInt();
        int saat= tsaniye/3600;
        int dakika=(tsaniye%3600)/60;
        int saniye= tsaniye%60;
        System.out.println("saat = " + saat);
        System.out.println("dakika = " + dakika);
        System.out.println("saniye = " + saniye);*/


    }
}
