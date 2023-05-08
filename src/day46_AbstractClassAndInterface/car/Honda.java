package day46_AbstractClassAndInterface.car;

public final class Honda extends Car{//final olabilir başja bir class bu classa extend edemez

    public Honda(String model, String color, int year, double price) {
        super ("Honda",model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("twist the key to start");

    }
}
