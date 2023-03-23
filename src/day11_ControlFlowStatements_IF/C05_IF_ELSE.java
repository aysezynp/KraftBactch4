package day11_ControlFlowStatements_IF;

import java.util.Scanner;

public class C05_IF_ELSE {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Fizik:");
        double f= scan.nextDouble();
        System.out.print("Kimya=");
        double k= scan.nextDouble();
        System.out.print("Matematik:");
        double m=scan.nextDouble();
        double ort= (f+k+m)/3;

        if(ort>80){
            System.out.println("geçtiniz");
        }else{
            System.out.println("kaldınız");
        }







    }

}
