package day47_Polymorphism.shape;


import day46_AbstractClassAndInterface.animal.Animal;
import day46_AbstractClassAndInterface.animal.Cat;
import day46_AbstractClassAndInterface.animal.Dog;
import day46_AbstractClassAndInterface.animal.Tiger;

import java.util.Arrays;

public class C01_Polymorphism {
    public static void main(String[] args) {


        //animal animal=new animal();//çünkü animal abstract class
        Animal animal=new Dog("Panço","Golden", 'm',9,"medium","yellow");
         Dog dog=new Dog("Panço","Husky", 'm',9,"medium","yellow");
        //instanceof //örneği
        boolean isDog=animal instanceof Dog;
        boolean isAnimal=animal instanceof Animal;
        boolean isCat=animal instanceof Cat;
        System.out.println(isCat);
        System.out.println(isDog);
        System.out.println(isAnimal);

        animal.eat();//eat metodu absract class nerde implement edildiyse oradan alır yani Dog clasından
        animal.drink();//animal klasının metodu old. için direkt ordan alıyor.
        System.out.println(animal.toString());

      //  animal.bark()//Referans type Animal

        ((Dog)animal).bark();//Dog metodlarına ulaşmam için explicit Casting yapmalıyım
        ((Dog)animal).play();

        animal=new Cat("Panço","Golden", 'm',9,"medium","yellow");
        animal.eat();
        ((Cat)animal).meow();

           Cat cat=new Cat("max","Vank kedisi", 'f',9,"medium","yellow");
       //  cat=new Dog("Panço","Golden", 'm',9,"medium","yellow");// böyle birşey yapamam

        //kediden tanımladığımız bir nesne olarak kalır değiştiremem, ancak polymorphism yaparak Animaldan tanımladığım animal kedide köpekte olabiliyor
        System.out.println("..................................................");

        Animal animal1=cat;
        animal1.eat();
        animal1.drink();
        ((Cat)animal1).meow();
        System.out.println("..............................................");

        animal1=new Tiger("cesur","bbb",'f',5,"medium","yellow");
        animal1.drink();
        animal1.eat();

        System.out.println("..............................................");
        animal1=dog;
        animal1.eat();
        animal1.getName();
        ((Dog)animal1).bark();


        /*WebDeriver driver;
          driver=new ChromeDriver();
          driver.get(Amazon);

          driver=new FireFoxDriver();
          driver.get(google);

         */

        Circle circle=new Circle(5);
        circle.setRadius(9);
        System.out.println(circle.getRadius());
        System.out.println(circle.area());
        System.out.println(circle);


        Shape shape=new Circle(5);
        boolean isShape=shape instanceof Shape;
        boolean isCircle=shape instanceof Circle;
        System.out.println(isCircle);
        System.out.println(isShape);
        System.out.println("..........................");

        System.out.println(shape.perimeter());
        System.out.println(shape.area());
        System.out.println(((Circle) shape).getRadius());
        System.out.println(shape.getName());

        System.out.println("..........................");
        System.out.println(shape.getClass());
        System.out.println(shape.getClass().getName());

        String str="Golden globe";
        int a=3;
        Double b=12.6;

        Object[]objectArray={str,a,b,shape,animal1,cat};
        System.out.println(Arrays.toString(objectArray));
    }
}
