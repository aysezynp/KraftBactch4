package day43_Task_SDLC;

public class SoftwareDevelopmentTeam extends Person {
   String team;
   String domain;
   private int numberOfPersonel;


    public SoftwareDevelopmentTeam(String name,String surname) {
        super(name,surname);
    }

    public SoftwareDevelopmentTeam(String name,String surname,int salary){
        super(name,surname,salary);
    }
    public SoftwareDevelopmentTeam(String name,String surname,String team,String domain){
        super(name,surname);
        this.team=team;
        this.domain=domain;
    }
    public SoftwareDevelopmentTeam(String name, String surname, String team,String domain,int numberOfPersonel){
        super(name,surname);
        this.team=team;
        this.domain=domain;
        this.numberOfPersonel=numberOfPersonel;
    }


    public int getNumberOfPersonel() {

        return numberOfPersonel;
    }

    public void setNumberOfPersonel(int numberOfPersonel) {
        this.numberOfPersonel = numberOfPersonel;
    }

    public void duty(String name,String team){
        super.name=name;
        this.team=team;
        System.out.println(super.name+team+" de görev almaktadır.");
    }

}
