package day47_Polymorphism.shape;

public class Cylinder extends Shape implements Volume {

    private double height;
    private double radius;
    private final static double PI = Math.PI;

    public Cylinder(double height, double radius) {
        super("Cylinder");
        setHeight(height);
        setRadius(radius);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height<0){
            System.out.println("Invalid height "+height);
        }
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<0){
            System.out.println("Invalid radius "+radius);
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2*PI*radius*(radius+height);

    }
    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public double volume() {
        return PI*radius*radius*height;
    }
}