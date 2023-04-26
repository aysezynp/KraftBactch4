package day39_ConstructorOverloading;

public class C03_CarObjects {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println("car1.otomatikMi = " + car1.otomatikMi);
        System.out.println("car1.marka = " + car1.marka);
        System.out.println("car1.hiz = " + car1.hiz);
        System.out.println(".....................................");

        Car car2 = new Car("VW");
        System.out.println("car2.otomatikMi = " + car2.otomatikMi);
        System.out.println("car2.marka = " + car2.marka);
        System.out.println("car2.hiz = " + car2.hiz);
        System.out.println(".............................");

        Car car3 = new Car("Honda", "civic");
        System.out.println(car3);
        Car.renksec(car3, "kirmizi");//Car Classı altındaki renkSec metodu
        System.out.println(car3);
        renksec(car3,"sari");//buradaki renkSec metodu
        System.out.println(car3);
        System.out.println(".............................");

        Car car4=new Car("BMW","m6","Siyah",360);
        System.out.println("car4 = " + car4);
        Car.hiz(car4,500);
        System.out.println(car4);
        hiz(car4,360);
        System.out.println(car4);

    }

    public static Car renksec(Car car, String renk) {
        car.renk = renk;
        return car;
    }

    public static Car hiz(Car car,int hiz) {
        car.hiz = hiz;
        return car;
    }
}