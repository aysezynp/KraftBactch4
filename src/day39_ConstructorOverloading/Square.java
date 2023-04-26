package day39_ConstructorOverloading;

public class Square {
    public double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double calculateArea() {
        return sideLength * sideLength;
    }

    public double calculatePerimeter() {
        return 4 * sideLength;
    }
    public String toString(){
        return "Square{"+
                "sideLength='"+sideLength+"', "+
                "Area of square='"+calculateArea()+"', "+
                "Perimeter of square='"+calculatePerimeter()+"'}";
    }
}

