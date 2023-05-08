package day46_AbstractClassAndInterface.animal;

public class Eagle extends Animal implements canFly,Wild{

    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

     public void eat(){
        System.out.println(getAge()+"is eating snake");
            }

    @Override
    public void hunt() {
        System.out.println(getName()+"is hunting snake");
    }

    @Override
    public void fly() {
        System.out.println(getName()+"is flying at high altitudes");

    }

}
