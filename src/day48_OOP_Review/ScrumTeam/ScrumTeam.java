package day48_OOP_Review.ScrumTeam;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    public ProductOwner po;
    public BusinessAnalyst ba;
    public ScrumMaster sm;

    public ArrayList<Tester> testers = new ArrayList<>();
    public ArrayList<Developer> developers = new ArrayList<>();

    public ScrumTeam(ProductOwner po, BusinessAnalyst ba, ScrumMaster sm) {
        this.po = po;
        this.ba = ba;
        this.sm = sm;
    }

    public void addTester(Tester tester){
        testers.add(tester);

    }

    public void addTester(Tester[]testers){

        this.testers.addAll(Arrays.asList(testers));
    }

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public void addDeveloper(Developer[]developers){
        this.developers.addAll(Arrays.asList(developers));
    }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "po=" + po +
                ", ba=" + ba +
                ", sm=" + sm +
                ", testers=" + testers +
                ", developers=" + developers +
                '}';
    }
}