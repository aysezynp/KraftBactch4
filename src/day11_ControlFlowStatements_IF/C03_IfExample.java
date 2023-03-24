package day11_ControlFlowStatements_IF;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C03_IfExample {
    public static void main(String[] args) {


        /*int fizik = 50;
        int kimya = 55;
        int ort = (fizik + kimya) / 2;
        boolean result = (ort > 50);
        if (result) {
        System.out.println("Ali geçti");


    }*/

        Scanner scan=new Scanner (System.in);
        System.out.println("ders notlarını giriniz");
        System.out.println("Fizik:");
        double f=scan.nextDouble();
        System.out.println("Kimya:");
        double k=scan.nextDouble();
        System.out.println("Geçme notu:");
        double gecmeNotu=scan.nextDouble();
        double ort=(f+k)/2;
        if (ort>gecmeNotu){
            System.out.println("Sınıfi geçtiniz");
            System.out.println("Harika");
            System.out.println("Bir üst sınıf");
        }

        System.out.println('A');
        System.out.println('B');

    }



}
