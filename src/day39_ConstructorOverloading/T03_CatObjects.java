package day39_ConstructorOverloading;

public class T03_CatObjects {
    public static void main(String[] args) {
        Cat cat1=new Cat("Mavi");
        System.out.println(cat1);
        System.out.println("........................................");

        Cat cat2=new Cat("Sarı","Siyam");
        System.out.println(cat2);
        cat2.sleep();
        System.out.println("........................................");

        Cat cat3=new Cat("Sarı","Siyam",true);
        System.out.println(cat3);
        cat3.cinsDegistir(cat3,"Tekir");
        cat3.sleep();
        cat3.food();
        System.out.println("........................................");

        Cat cat4=new Cat("Mavi","Siyam",true,true);
        System.out.println(cat4);
        cat4.food();
        cat4.sleep();
        cat4.run();
        cat4.isFat=false;
        cat4.isPet=false;
        cat4.sleep();
        cat4.run();
    }

}
