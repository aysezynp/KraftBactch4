package day57_JavaReview2;

class Employee{
    //public String name;
    private String name;
    private double salary;
    private char gender;

    public Employee(String name, double salary, char gender) {
       setName(name);
       setSalary(salary);
       setGender(gender);

        this.salary = salary;
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<=0){
            throw new RuntimeException("Salary can not be set to negtive");
        }
        if(salary<=10000){
            throw new RuntimeException("Insufficient Salary for a human being, Employees are Not your slaves!");
        }
        this.salary = salary;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(!(gender=='f'||gender=='F'||gender=='m'||gender=='M')){
            throw new RuntimeException("Invalid name,Please enter 'M','m','F',''f");
        }
        this.gender = gender;
    }

    public String getName() {
        if(name==null){
            throw new RuntimeException("Name hsa not been set!");
        }
        return name;
    }

    public void setName(String name) {
        if(name==null) {
            throw new RuntimeException("Name can not be  set to NULL!");
        }
        if(name.isEmpty()){
                throw new RuntimeException("Name can not be  EMPTY!");
        }
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}

public class C03_EncapsulationReview {
    public static void main(String[] args) {
      Employee employee1=new Employee("Serka",23000,'f');//default constructor
      //
        // System.out.println("employee1.name = " + employee1.name);
       System.out.println("employee1.getName() = " + employee1.getName());

        Employee employee2=new Employee("Şener",28000,'M');
        employee2.setSalary(5000);

    }
}
