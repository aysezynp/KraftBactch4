package day07_Aritmetic_Operators;

public class Aritmetic_Operators_2 {
    public static void main(String[] args) {

      /*  int x=4;
        int y= 10;
        int z=x%y;
        System.out.print(z);*/

      /*  int ali=1990;
        int yil=2023;
        int asy= yil-ali;
        System.out.print(asy);*/

      /*  double r = 2;
        double PI = 3.14;
        double perimeter = 2 * PI * r;
        double area = PI * r * r;
        double area2 = Math.PI * Math.pow(r, 2);
        System.out.println("area = " + area);
        System.out.println("area2 = " + area2);
        System.out.println("perimeter = " + perimeter);
        System.out.println("perimeter = " + (2*Math.PI*r));*/

      /*  double f =92;
        double k =55;
        double m =89;
        double ort= (f+k+m)/3;
        System.out.println("ort = " + ort);
        boolean gectimi= ort>80;
        System.out.print ("Ali sınıfı geçti mi: "+ gectimi);
        //System.out.print ("Ali sınıfı geçti mi"+ (ort>80)); de diyebiliriz.*/


//Örnek: Toplantı salonunda 15 adet sıra ve her sırada 12 adet koltuk vardır. Toplantıya 113 katılmıştır.
//1.Toplantı salonun toplam kapasitesi nedir? 2.Kaç adet boş koltuk vardır ?
//3.Kaç adet sırada oturulmaktadır ?
//4. Kaç sıra tamamen boş kalmıştır.
//5.Oturulan sıralarda kaç adet boş koltuk vardı


        int sira= 15;
        int koltuk=12;
        int katilan= 113;
       //1.Toplantı salonun toplam kapasitesi nedir?
        int kapasite= sira*koltuk;
        System.out.println("kapasite = " + kapasite);
        //2. Kaç adet boş koltuk vardır ?
        int bosKoltuk= kapasite-katilan;
        System.out.println("bosKoltuk = " + bosKoltuk);
        //3.Kaç adet sırada oturulmaktadır ?
        int oturulanSiraAdedi= 113/12+1;
        System.out.println("oturulanSiraAdedi = " + oturulanSiraAdedi);
        //4.Kaç sıra tamamen boş kalmıştır?
        int bosSira= sira- oturulanSiraAdedi;
        System.out.println("bosSira = " + bosSira);
        //5. Oturulan sıralarda kaç adet boş koltuk vardır?
        int oturulanSiradakibosKoltuk= koltuk-113%12;
        System.out.println("oturulanSiradakibosKoltuk = " + oturulanSiradakibosKoltuk);


    }
}
