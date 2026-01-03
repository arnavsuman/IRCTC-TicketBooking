package com.trainbooking;

import java.util.Scanner;
import com.trainbooking.user.service.UserService;
import com.trainbooking.ticket.service.TicketService;
/**
 * Hello world!
 *
 */
public class App
{

    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== WELCOME TO TRAIN API ===");

        printOptuions();

        int choice = scanner.nextInt();
        scanner.nextLine();

        while(choice != 0){
            try {
                printOptuions();
                choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 0:
                        break;
                    case 1:
                        System.out.println(1);
                        break;
                    case 2:
                        System.out.println(2);
                        break;
                    case 3:
                        break;

                }

            }
            catch (Exception e) {
                System.out.println("Invalid State "+ e.getMessage());
            }
        }

        System.out.println("=== THANKS FOR USING TRAIN API ===");
        scanner.close();
    }
    static void printOptuions(){
        System.out.println("====================================");
        //createUser
        System.out.println(" 1. Create a new User");

        //DelteUser
        System.out.println(" 2. Delete a User");

        //createTicket
        System.out.println(" 3. Book Ticket");

        //getTicket
        System.out.println(" 4. Get Ticket details");

        //updateTicket
        System.out.println(" 5. Update a Ticket");

        //cancelTicket
        System.out.println(" 6. Cancel Ticket");

        //EXIT
        System.out.println(" 0. Exit");

        System.out.println("Enter choice: ");
    }

}
