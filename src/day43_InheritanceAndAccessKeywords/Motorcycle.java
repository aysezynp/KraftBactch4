package day43_InheritanceAndAccessKeywords;

public class Motorcycle extends Vehicle {
    private int cc;


    public void changeCc(int cc) {
        this.cc = cc;

    }

    public int getCc() {
        return cc;
    }


    public static Motorcycle motorcycleOlustur(){
        return new Motorcycle();
    }
    //ya da
    //public static Motorcycle motorcycleOlustur(){
    //   Motorcycle motorcycle1=new Motorcycle();
    //    return motorcycle1;
    //}
}