/*   Created by IntelliJ IDEA.
 *   Author: Priyanshi Jaiswal
 *   Date: 30-07-2020
 *   Time: 21:13
 *   File: Lab4Task.java
 */

package lab4;

//TASK - Iterations (While)
// Problem Statement : Selling limited tickets for an online conference.

import java.util.Scanner;

public class Lab4Task {
    private static final byte TOTAL_PARTICIPANTS = 100;

    private static void sellTicket(String participantName) {
        String message = "Congratulations, " + participantName + ". " +
                "See you at the conference!";
        System.out.println(message);
    }

    public static void main(String[] args) {
        byte numberOfTicketsSold = (byte) 0;
        while (numberOfTicketsSold <= TOTAL_PARTICIPANTS) {
            System.out.println("Total Tickets Left: " + (TOTAL_PARTICIPANTS - numberOfTicketsSold));
            System.out.println("Enter Your Name: ");
            Scanner scannerObject = new Scanner(System.in);
            String participantName = scannerObject.nextLine();
            Lab4Task.sellTicket(participantName);
            numberOfTicketsSold++;
            if (numberOfTicketsSold == TOTAL_PARTICIPANTS) {
                System.out.println("Sorry, The tickets are sold-out!");
                scannerObject.close();
                break;
            }
        }
    }
}
