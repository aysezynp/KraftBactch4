package day39_ConstructorOverloading;

public class Car {
    String marka;
    String model;
    String renk;
    int hiz;
    boolean otomatikMi;

    public Car() {
    }

    public Car(String brand) {
        marka = brand;//Parametre ismi instanve variable ile aynı değilse dirak atama yapabiliriz
        //Aynı olursa this. kullanmak zorundayız
    }

    public Car(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    public Car(String marka, String model, String renk) {
        this.marka = marka;
        this.model = model;
        this.renk = renk;

    }

    public Car(String marka, String model, String renk, int hiz) {
        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.hiz = hiz;
    }

    public Car(String marka, String model, String renk, int hiz, boolean otomatikMi) {
        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.hiz = hiz;
        this.otomatikMi = otomatikMi;
    }
    public String toString(){
        return "Car{"+
                "marka='"+marka+"', "+
                "model='"+model+"', "+
                "renk='"+renk+"', "+
                "hiz='"+hiz+"', "+
                "otomatik mi='"+otomatikMi
                +"'}";

    }
    public static Car renksec(Car car,String renk){
        car.renk=renk;
        return car;
    }

   public static Car hiz(Car car,int hiz){
        car.hiz=hiz;
        return car;
   }

}



