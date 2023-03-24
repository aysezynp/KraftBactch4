package day09_OperatorsCont;

import java.util.Scanner;

public class C06_FlightTickets {

    public static void main(String[]args){

         /* 1. from
        2. to
        3. ticketPrice
        use concatenation to display the full info of the ticket
        ex:
        From Ankara to Istanbul is 599TL*/

        Scanner scan=new Scanner (System.in);

        System.out.print ("From:");
        String from=scan.nextLine();
        System.out.print ("To:");
        String to= scan.nextLine();
        System.out.print("Ticket price:");
        int ticketPrice= scan.nextInt();

        System.out.println ("From "+ from+ " to "+ to+" "+ticketPrice+ " Tl'dir." );









    }
}
