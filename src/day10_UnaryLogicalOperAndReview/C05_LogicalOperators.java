package day10_UnaryLogicalOperAndReview;

import java.sql.SQLOutput;

public class C05_LogicalOperators {
    public static void main(String []args){

        String name= "Ayse";
        int age=34;
        String citizen= "Turkish";

        // +18, Turkish
        boolean isEligibleVote= age>= 18 && citizen=="Turkish";//Stringlerin eşitliğini == operatörü ile kontrol etmeyiz!!!!!!
        System.out.println (name+" is eligible to vote: "+isEligibleVote);

        System.out.println("-----------------------------------------------------");

        String name2="Ümit";
        int findexScore=800;
        int age2=43;
        int income= 40000;
        boolean isEligibleForLoan= findexScore>=1500 && age2>=18 && income>=30000 ;


        System.out.println("-----------------------------------------------------");

        String name3="Hatice";
        int age3= 21;
        char gender = 'F';
        boolean isEligible= age>=18 &&(gender=='F'||gender=='M');
        //                          &&(true||false)
        //                          &&true
        //                      true&&true=true

        System.out.println(name3+ " is eligible to be selected as MP: "+isEligible);

        System.out.println("-----------------------------------------------------");

        String student="Ali";
        double gpa= 2.5;
        int familyInCome= 15000;
        boolean isEligibleForScholarship= gpa>=3.5||familyInCome<=20000;
             //                              false||true
               //                                true

        System.out.println(student+ " is eligible for ScholarShip: "+isEligibleForScholarship);

        System.out.println("-----------------------------------------------------");

        boolean result= true;
        System.out.println("result = " + result);

        boolean result2= !result;
        System.out.println("result2 = " + result2);

        System.out.println("-----------------------------------------------------");


        int score=55;
        boolean passed= score>=60;
        System.out.println("passed = " + passed);
        boolean failed= !passed;
        System.out.println("failed = " + failed);


    }
}
