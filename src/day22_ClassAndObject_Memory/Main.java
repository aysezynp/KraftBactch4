package day22_ClassAndObject_Memory;

import day21_Class_And_Objects.Car;

public class Main {
    public static void main(String[] args) {
       Car2 audi=new Car2();
       audi.marka="Audi";
       audi.modelAdi="A3 sedan";
       audi.beygir=110;
        Car2 bmw=new Car2();
        bmw.marka="BMW";
        bmw.modelAdi="116d";
        bmw.beygir=120;

        if(audi.beygir>bmw.beygir){
            System.out.println("audi.beygir = " + audi.beygir);
        }else{
            System.out.println("bmw.beygir = " + bmw.beygir);
        }


    }





}
