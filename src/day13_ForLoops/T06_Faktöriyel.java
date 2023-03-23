package day13_ForLoops;

public class T06_Faktöriyel {
    public static void main(String[] args) {
        //6 faktöriyel’in sonucu nedir? (6!=6*5*4*3*2*1)

        int sayi=6;
        int faktöriyel=1;

        for(int i=1;i<=6;i++){
            faktöriyel*=i;}
        System.out.println(sayi+ "!= "+faktöriyel);




        }


    }

