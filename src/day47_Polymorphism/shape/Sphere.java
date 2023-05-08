package day47_Polymorphism.shape;

public class Sphere extends Shape implements Volume{
    private double radius;
    private final static double PI = Math.PI;

    public Sphere(double radius) {
        super("Sphere");
      setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<0){
            System.err.println("Invalid radius" +radius);
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return 4*PI*radius*radius;
    }

    @Override
    public double perimeter() {
        return 0;

    }

    @Override
    public double volume() {
        return (4/3)*PI*radius*radius*radius;
    }
}
