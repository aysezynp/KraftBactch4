package day40_Encapsulation;

public class Employee {
    private String name;
    private char gender;
    private int age;
    private double salary;

    public Employee(String name, char gender, int age, double salary) {
        //  this.name=name;
        setName(name);
        setGender(gender);
        setAge(age);
        setSalary(salary);

    }

    public String getName() {
        return name; //return this.name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()) {
            return;
        }
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender == 'm' || gender == 'M' || gender == 'f' || gender == 'F')) {
            return;
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 16 || age > 90) {
            return;
        }
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            return;
        }
        this.salary=salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + "', " +
                "gender='" + gender + "', " +
                "age='" + age + "', " +
                "salary='" + salary + "'}";
    }
}