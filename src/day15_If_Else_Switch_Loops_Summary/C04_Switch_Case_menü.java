package day15_If_Else_Switch_Loops_Summary;

import java.util.Scanner;

public class C04_Switch_Case_menü {

    public static void main(String[] args) {
        //Et menü;sebze menü,çocuk menü(1-2_3)
        //Et menü:pirzola 50 tavuk 30
        //sebze menü:enginar 30 roka salatası 40
        //çocuk menü: patates kızartması 10, makarna 5t
        Scanner scan = new Scanner(System.in);
        System.out.println("et menü,sebze menü, (1-2):");
        int tercih_1 = scan.nextInt();
        switch (tercih_1) {
            case 1:
                System.out.println("pirzola mı(1) tavuk mu(2)");
                int tercih_2 = scan.nextInt();
                switch (tercih_2) {
                    case 1:
                        System.out.println("Pirzola 50 TL");
                        break;
                    case 2:
                        System.out.println("Tavuk 2 Tl");
                        break;
                    default:
                        System.out.println("Hatalı Giriş");
                }
                break;
            case 2:
                System.out.println("enginar mı(1) roka salatası mı(2)");
                int tercih_3 = scan.nextInt();
                switch (tercih_3) {
                    case 1:
                        System.out.println("Enginar 30 TL");
                        break;
                    case 2:
                        System.out.println("roka 40 Tl");
                        break;
                    default:
                        System.out.println("Hatalı Giriş");

                }
                break;
            default:
                System.out.println("Hatalı Giriş");


        }
    }
}