package day43_Task_SDLC;

public class HumanResources extends Person{
    private String arearesponsibility;

    public HumanResources(String name,String surname,int salary){
        super(name, surname,salary);

    }
    public HumanResources(String arearesponsibility){

        this.arearesponsibility=arearesponsibility;
    }
    public String getArearesponsibility(){
        return arearesponsibility;
    }
    public void setArearesponsibility(String arearesponsibility){
        this.arearesponsibility=arearesponsibility;
    }

}
