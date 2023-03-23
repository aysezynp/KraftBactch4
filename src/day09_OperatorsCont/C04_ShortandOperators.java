package day09_OperatorsCont;

public class C04_ShortandOperators {
    public static void main(String[] args) {

// assigment atama
int number= 10;
number= 20;
        System.out.println("number="+number);

    String word = "Java Programming Language";
        System.out.println("word = " + word);

        int x=100;
        System.out.println("x = " + x);
        x+=100;
        System.out.println("x = " + x);

        String str= "Golden";
        str+="Globe";
        System.out.println(str);

        double num1= 3.5;
        System.out.println("num1 = " + num1);
        num1+=6.5;
        System.out.println("num1 = " + num1);

        double bakiye= 3520.50;
        bakiye+=1500;
        System.out.println("bakiye = " + bakiye);

        bakiye-=2200;
        System.out.println("bakiye = " + bakiye);

        double maas= 42500.50;
        System.out.println("maas = " + maas);
        maas*=2;
        System.out.println("maas = " + maas);

        double gramAltin= 0.001;
        gramAltin*=120;
        System.out.println("gramAltin = " + gramAltin);

        double num2= 50000.0;
        num2/=2;
        System.out.println("num2 = " + num2);

        double num3= 100;
        num3%=3;
        System.out.println("num3 = " + num3);

        System.out.println("______________________");

        int odenecektutar=1130;
        int ikiyuzluk=1130/200;
        odenecektutar%=200;
        System.out.println("odenecektutar = " + odenecektutar);
        int yuzluk= odenecektutar/100;
        odenecektutar%=100;
        System.out.println("odenecektutar = " + odenecektutar);
        int yirmilik= odenecektutar/20;
        odenecektutar%=20;
        int onluk=odenecektutar/10;
        odenecektutar%=10;
        System.out.println("1130 Tl için "+ ikiyuzluk+ " tane iki yüzlük banknot "
        +yuzluk+ " tane yuzluk banknot "+ yirmilik+ " tane yirmilk "+ onluk+ " tane onluk banknot ödemeniz gerekmektedir.");




    }
}