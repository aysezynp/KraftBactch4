package day43_Task_SDLC;

public class Tester extends SoftwareDevelopmentTeam {
    boolean isManual;

    public Tester(String name, String surname, boolean isManual) {
        super(name, surname);
        this.isManual = isManual;
    }

    public Tester(String name, String surname, String team, String domain) {
        super(name, surname, team, domain);
    }

    public void duty(String name,String team){
        super.name=name;
        super.team=team;
        System.out.println(super.name +super.team + " Takımı'nda developer olarak görev almaktadır.");
    }


}