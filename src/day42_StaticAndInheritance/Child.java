package day42_StaticAndInheritance;

public class Child extends Parent {
    String meslek;


    public Child(String meslek){
        //burda parent classının boş constructorını çağırır.
        this.meslek=meslek;
    }

    public Child(String name,String meslek){
        super(name);//Parent classa ait bir özellik
        this.meslek=meslek;
    }
}
