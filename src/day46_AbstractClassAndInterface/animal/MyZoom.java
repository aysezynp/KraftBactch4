package day46_AbstractClassAndInterface.animal;

public class MyZoom {
    public static void main(String[] args) {

        //Animal animal=new Animal("asd"........), cannot create objects from abstract classes
        Cat cat=new Cat("Cesur", "Scottish",'m',9,"medium","gray");
        cat.eat();
        cat.meow();
        cat.play();
        System.out.println(cat.getAge());
        cat.setAge(3);
        System.out.println(cat);
        cat.setSize("Large");
        cat.setName("Tufan");
        System.out.println(cat);







    }
}
