package day39_ConstructorOverloading;

public class T01_SquareObjects {
    public static void main(String[] args) {

        Square square1=new Square(5.5);
        System.out.println("square1.calculateArea() = " + square1.calculateArea());
        System.out.println("square1.calculatePerimeter() = " + square1.calculatePerimeter());
        System.out.println(square1);
    }


}
