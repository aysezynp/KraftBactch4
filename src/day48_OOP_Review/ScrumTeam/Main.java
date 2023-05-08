package day48_OOP_Review.ScrumTeam;

public class Main {
    public static void main(String[] args) {
        Person person=new Person("ihsan",30,'m');
Employee employee1=new Employee("ayşe",32,'F',"Tester",33000,123457,"IT");
        System.out.println(employee1.getId());

        employee1.work();
        employee1.eat("cake");



    }
}
