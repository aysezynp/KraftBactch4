package day40_Encapsulation;

public class C01_EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1=new Employee("",'p', 30,32000);
       // employee1.age;
        //employee.name;// get metodu olsada ancak metodla değişkene erişebiliriz.
        System.out.println(employee1.getName());
        System.out.println("employee1.getGender() = " + employee1.getGender());


        Employee employee2=new Employee("ümit",'A',-20,25000);
        System.out.println(employee2);
        employee2.setGender('m');
        employee2.setAge(38);
        employee2.setSalary(33000);
        System.out.println(employee2);
        System.out.println(employee2.getSalary());

        Employee employee3=new Employee("",'A',-20,-25000);
        System.out.println(employee3);

    }
}
