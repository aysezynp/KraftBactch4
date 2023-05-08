package day46_AbstractClassAndInterface.car;

public final class Audi extends Car{

    public Audi (String model, String color, int year, double price) {
        super("Audi",model,color,year,price);
    }

    @Override
    public void start() {
        System.out.println("push the start button");
    }
    public void quatro(){

        System.out.println("Quatro feature is active");
    }
}
