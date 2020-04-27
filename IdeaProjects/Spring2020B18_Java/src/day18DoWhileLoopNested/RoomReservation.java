package day18DoWhileLoopNested;

import java.util.Scanner;
/*
Assignment:
    write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
                should ask which bedroom do you wanna reserve
                    if user provided invalid entry => please re-enter
                    calculate the total price
                do you want to reserve another room:
                            if yes ==> repeat the previous steps
                            if no ==> your total price is: $$$
                            if answer either yes or no ==> please re-enter
 */
public class RoomReservation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int king = 120;
        int queen = 100;
        int single = 80;
        int price = 0;
        int totalPrice = 0;
        int totalNight = 0;


        while (true) {
            System.out.println("What type of room do you want to reserve King Bed, Queen Bed, Single Bed?");
            String room = input.nextLine();
            while (!(room.equalsIgnoreCase("king") || room.equalsIgnoreCase("queen") || room.equalsIgnoreCase("single"))) {
                System.out.println("Invalid entry, please re-enter");
                room = input.nextLine();
            }

            if (room.equalsIgnoreCase("king")) {
                price = king;
            } else if (room.equalsIgnoreCase("queen")) {
                price = queen;
            } else if (room.equalsIgnoreCase("single")) {
                price = single;
            }
            System.out.println("How many night?");
            totalNight = input.nextInt();
            totalPrice = totalNight * price;



            System.out.println("Do you want to reserve another room");
            String answer1 = input.next();

                    while (!(answer1.equalsIgnoreCase("Yes") || answer1.equalsIgnoreCase("no"))) {
                    System.out.println("Invalid Entry, please enter yes or no");
                    answer1 = input.next();
                }
                if (answer1.equalsIgnoreCase("No")) {
                    System.out.println("Thank you for staying with us");
                    System.out.println("Your total price is:$ " + totalPrice);
                    break;


                }


            }

        }
    }

