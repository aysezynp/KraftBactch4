package day57_JavaReview2;

class Person{
public String name;
public char gender;
public int age;
public final static String SPECIES="Homo sapiens";
public final static String SPECIESinENGLISH="Human";


 public Person(String name){
     this.name=name;

 }

    public Person(String name, char gender, int age) {
        this(name);
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}


public class C01_ClassReview {

    public static void main(String[] args) {
        Person person1=new Person("Harun");//default cons. will work if no constructor written in the class
        person1.name="Hans";
        person1.gender='f';
        person1.age=35;
        System.out.println(person1.name);
        System.out.println(person1);//will print out referance to the console without toString()method

   Person person2=new Person("sam",'m',41);
   Person person3=new Person("tony",'m',26);
   Person person4=new Person("Jony",'m',30);
        System.out.println("person2 = " + person2);
        System.out.println("person3 = " + person3);
        System.out.println("person4 = " + person4);

        System.out.println(Person.SPECIES);// one copy if you change it it changes for every objects
        System.out.println("Person.SPECIESinENGLISH = " + Person.SPECIESinENGLISH);
        //  person3.SPECIESinENGLISH="Human Being";// cannot be changed (final)
        // Person.SPECIESinENGLISH="Human BEing";

    }
}
