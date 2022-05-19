package com.company;

public class App {
    public static void main(String[] args) {
        System.out.println("Wizards and Warlocks");

        //Wizard and Warlock object class inheriting Character Class
        Wizard Character1 = new Wizard("Player1", 1, 100, 180);
        Warlock Character2 = new Warlock("Player2", 1, 100, 180);

        //character actions sequence
        //1 skill required per round
        System.out.println("\n");
        //Displaying Character name and details
        Character1.displayName();
        Character1.displayDetails();
        Character2.displayName();
        Character2.displayDetails();

        //first round match
        System.out.println("\n-------------------");
        System.out.println("Let The Game Begin!\n");
        System.out.println("Round 1\n");
        //skill casts
        Character1.shadowSphere(Character2, Character1);
        Character2.meteorBolt(Character1, Character2);
        //displaying current character details
        System.out.print("\n");
        Character1.displayDetails();
        Character2.displayDetails();

        //second round match
        System.out.println("Round 2\n");
        //skill casts
        Character2.meteorBolt(Character1, Character2);
        Character1.shadowSphere(Character2, Character1);
        //displaying current character details
        System.out.print("\n");
        Character1.displayDetails();
        Character2.displayDetails();

        //Third round match
        System.out.println("Round 3\n");
        //skill casts
        Character1.healingPool();
        Character2.shadowSphere(Character1, Character2);
        //displaying current character details
        System.out.print("\n");
        Character1.displayDetails();
        Character2.displayDetails();

        //Fourth round match
        System.out.println("Round 4\n");
        //skill casts
        Character2.meteorBolt(Character1, Character2);
        Character1.shadowSphere(Character2, Character1);
        //displaying current character details
        System.out.print("\n");
        Character1.displayDetails();
        Character2.displayDetails();

    }
}
