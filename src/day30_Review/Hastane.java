package day30_Review;

public class Hastane {
    public static void main(String[] args) {
        Doktor hekim1=new Doktor();//instance değişkenlere ancak obje oluşturarak erişilebilinir.
        System.out.println((hekim1.cinsiyet));
        System.out.println((hekim1.isim));
        System.out.println((hekim1.yas));
        System.out.println((hekim1.uzmanMı));
        hekim1.isim="kaan";
        hekim1.soyIsim="Sarp";
        hekim1.yas=32;
        System.out.println((hekim1.isim));
        System.out.println(hekim1.yas);
        System.out.println("hekim1.uzmanMı = " + hekim1.uzmanMı);


    }


}

