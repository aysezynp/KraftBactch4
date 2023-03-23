package day10_UnaryLogicalOperAndReview;

import java.util.Scanner;

public class T02_EligibleToBeSoldier {
    public static void main(String[]args){

        int age=20;
        String healt="healty";
        boolean toBeSoldier= age>=20&&healt=="healty";
        boolean tobesoldier2=age==22&&healt=="healty"||age==19&&healt=="poorly";

        System.out.println("toBeSoldier = " + toBeSoldier);

        System.out.println("tobesoldier2 = " + tobesoldier2);
    }
}