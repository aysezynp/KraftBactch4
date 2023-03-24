package day12_SwitchCase;

import java.util.Scanner;

public class C05_Example {
    public static void main(String[] args) {
        //öğrencinin ortalaması alın
        //ortalama 50 altında ise zayıf
        //50 dahil 70 arası orta
        // 70 dahl 85 arası iyi
        //85 ve üzeri pekiyi yazdırsın.
        //95 üzeri mi diye kontrol edin 95 ve üzerinde ise onur  belgesi olmaya hak kazandınız

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen ortalamanızı giriniz:");
        double ortalama= scan.nextDouble();
        if (ortalama < 50) {
            System.out.println("zayıf");
        } else if (50 <= ortalama && ortalama < 70) {
            System.out.println("orta");
        } else if (70 <= ortalama && ortalama < 85) {
            System.out.println("iyi");
        } else{
            System.out.println("pekiyi");
            if (ortalama>=95){
                System.out.println("Onur belgesi almaya hak kazandınız");
            }
        }

      /* Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen ortalamanızı giriniz:");
        double ortalama= scan.nextDouble();
        if (ortalama < 50) {
            System.out.println("zayıf");
        } else if (ortalama < 70) {
            System.out.println("orta");
        } else if (ortalama < 85) {
            System.out.println("iyi");}
        else{
        System.out.println("pekiyi");
        if(ortalama >=95) {
            System.out.println("Başarı belgesi almayı hak ettiniz");
        }}*/







}
}