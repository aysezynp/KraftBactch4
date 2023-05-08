package day46_AbstractClassAndInterface.car;

public final class Togg extends Car {

    public Togg (String model, String color, int year, double price) {

        super("Togg",model,color,year,price);
    }

    @Override
    public void start(){
        System.out.println("say\"START\"to start the engine");
    }

    public void zoom(){
         System.out.println("zoom meeting is starting, csmile to the camera");
}

}