package day22_ClassAndObject_Memory;

public class Main2 {
    public static void main(String[] args) {

        Daire2 yenidaire=new Daire2();
        yenidaire.r=5;
        System.out.println(yenidaire.alanHesapla());

        System.out.println(Daire2.cevreHesapla(5));

    }
}
