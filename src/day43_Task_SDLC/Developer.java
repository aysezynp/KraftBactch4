package day43_Task_SDLC;

public class Developer extends SoftwareDevelopmentTeam {
    String softwareLanguage;

    public Developer (String name, String surname,String softwareLanguage){
        super(name,surname);
        this.softwareLanguage=softwareLanguage;
    }

    public Developer(String name,String surname,String team,String domain){
        super(name,surname,team,domain);

    }

    public void duty(String name,String team){
        super.name=name;
        super.team=team;
        System.out.println(super.name+super.team+" Takımı'nda Developer olarak görev almaktadır.");
    }



}
