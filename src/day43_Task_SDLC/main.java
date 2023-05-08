package day43_Task_SDLC;

public class main {
    public static void main(String[] args) {

        Person person1=new Person("Ali","ARSLAN",20000);
        System.out.println(person1.getId());
        System.out.println(person1.getSalary());
        person1.salaryIncrease(10000,"Developer");
        System.out.println(person1.getSalary());
        person1.salaryIncrease(5000,"human resources");
        System.out.println(person1.getSalary());

        SoftwareDevelopmentTeam software=new SoftwareDevelopmentTeam("Ahmet","EREN");
        System.out.println("software.getId() = " + software.getId());
        software.duty("Ayşe"," Software Develeopment team");

        ProjectOwner powner1=new ProjectOwner("yasin","demir",true);
        powner1.duty("yasin","Sotfware Development ");
    }
}
