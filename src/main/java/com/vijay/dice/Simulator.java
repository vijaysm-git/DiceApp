package com.vijay.dice;

import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Simulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean appcompleted = false;

        do {
            try {
                int numberofDice;
                while (true) {
                    System.out.println("How many dice would you like to roll? (only 1 & 2 are allowed)");
                    numberofDice = scanner.nextInt();

                    if (numberofDice == 1 || numberofDice == 2) {
                        break;
                    } else {
                        System.out.println("Invalid Input!you can only roll 1 or 2");
                    }
                }
                    appcompleted = true;

                    System.out.println("About to roll " + numberofDice + " dice");

                    Random rand = new Random();
                    for (int i = 0; i < numberofDice; i++) {
                        int rollednumber = rand.nextInt(6) + 1;
                        System.out.println(display(rollednumber));
                    }

                } catch(InputMismatchException e){
                    System.out.println("That is not a valid number to deploy use 1 or 2");
                    scanner.next();
                }

            } while (!appcompleted) ;

        }

        static String display ( int value){


            switch (value) {
                case 1 -> {
                    return "-------\n|     |\n|  o  |\n|     |\n-------";
                }
                case 2 -> {
                    return "-------\n| o   |\n|     |\n|   o |\n-------";
                }
                case 3 -> {
                    return "-------\n| o   |\n|  o  |\n|   o |\n-------";
                }
                case 4 -> {
                    return "-------\n| o o |\n|     |\n| o o |\n-------";
                }
                case 5 -> {
                    return "-------\n| o o |\n|  o  |\n| o o |\n-------";
                }
                case 6 -> {
                    return "-------\n| o o |\n| o o |\n| o o |\n-------";
                }
            }
            return "not valid";
        }

    }


