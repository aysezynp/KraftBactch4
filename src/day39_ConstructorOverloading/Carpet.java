package day39_ConstructorOverloading;

public class Carpet {
    public double length, width, unitPrice;
    public boolean isHandMade;

    public Carpet(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Carpet(double length, double width, double unitPrice, boolean isHandMade) {
        this(length, width);
        this.unitPrice = unitPrice;
        this.isHandMade = isHandMade;
    }

    public double calcPrice() {//bu metoda nesne üzerinde ulaşabiliyorum,statik değil

        double totalPrice= length * width * unitPrice;
        if(isHandMade){
            totalPrice*=5;
        }return totalPrice;
    }

    public String toString(){
        return "Carpet{"+
                "length= '"+length+"',"+
                "width= '"+width+"',"+
                "unit price= '"+unitPrice+"',"+
                "is Handmade= '"+isHandMade+"',"+
                "total price="+calcPrice()+"}";



    }
}
