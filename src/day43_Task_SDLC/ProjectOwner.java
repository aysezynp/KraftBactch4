package day43_Task_SDLC;

public class ProjectOwner extends SoftwareDevelopmentTeam {
    boolean isTechnical;



    public ProjectOwner (String name,String surname,boolean isTechnical) {
        super(name, surname);
        this.isTechnical = isTechnical;

    }
    public ProjectOwner(String name,String surname,String team,String domain){
            super(name,surname,team,domain);
    }


    public void duty(String name,String team){
        super.name=name;
        super.team=team;
        System.out.println(super.name+" "+super.team+" Takımı'nda Project Owner olarak görev almaktadır.");
    }




}
