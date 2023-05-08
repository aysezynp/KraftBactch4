package day43_Task_SDLC;

import java.util.Random;

public class Person {
    String name;
    String surname;
    private String id;
    private int salary;
    private static int count=1;
    private final static String SIFRE="5xy4t";
    private static String role="Human Resources";

    {
        this.id=createID();
    }

    public Person(){};

    public Person(String name){
        this.name=name;
    }

    public Person(String name,String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name,String surname,int salary){
        this(name,surname);
        this.salary=salary;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary) {
        if (salary < 0) {
            System.err.println("Salary cannot be less than 0");
            return;
        }
        this.salary = salary;
    }

    public void salaryIncrease(int money,String duty) {
        if (duty.equalsIgnoreCase(role)) {
            this.salary += money;
        }
    }

    public String getId(){
        return id;
    }

    public void setId(String id,String sifre) {
        if(sifre.equals(SIFRE)){
            this.id = id;
        }
    }

    public static String createID() {
        Random rm=new Random();
        int x=rm.nextInt(9000)+1000;
        String id ="AKD".concat("-")+count+x;
        count++;
        return id;

        }

}
