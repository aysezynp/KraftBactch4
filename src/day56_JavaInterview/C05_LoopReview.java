package day56_JavaInterview;

import java.util.Scanner;

public class C05_LoopReview {
    public static void main(String[] args) {

        for (int i = 0; i <20 ; i++) {
            if(i%5==0){
                //break;
               continue;
                //return;
            }
            System.out.println("number "+i);
        }
        System.out.println("loop is over");
        System.out.println("............................................");

        Scanner scan=new Scanner(System.in);
        int num=0;
        while(num<100) {
            System.out.print("number: ");
            num = scan.nextInt();
            System.out.println("num "+ num);


        }


    }
}
