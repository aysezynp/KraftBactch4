package day46_AbstractClassAndInterface.car;

import java.util.Arrays;

public class MyGarage {
    public static void main(String[] args) {
        //  Car car1=new Car("togg","t10x","kapadokya",2023,50000);//Car class abstract class old. için obje üretemeyiz
        Honda honda=new Honda("Accord","Black",2023,80000);
        Audi audi=new Audi("RS6","red",2023,260000);
        Togg togg=new Togg("T10x","Kapadokya",2023,50000);
        System.out.println(honda);
        System.out.println(audi);
        System.out.println(togg);

        System.out.println("........................");
        togg.setColor("Anadolu");
        audi.setColor("pink");
        honda.setPrice(90000);
        audi.setPrice(660000);


    }

}
