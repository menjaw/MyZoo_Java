/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;
import subClass.Horse;

/**
 *
 * @author Menja
 */
public class WorkWithHorse {

    //Variables
    private static Scanner scanner;

    public static void main(String[] args) {
        Horse horse = new Horse();

        //Hardcoded horse
        horse.setName("Bounty");
        horse.setWeigth(45);
        System.out.println("Your horse \n");
        System.out.println(horse.getName());
        System.out.println(horse.getWeigth());

        //Change object
        System.out.println("Change the name \n");
        System.out.println(changeName());
        System.out.println("Change the weigth \n");
        System.out.println(changeWeigth());
    }

    //Methods
    public static String changeName() {
        scanner = new Scanner(System.in);
        String newName = scanner.nextLine();
        return "The name is changed to: " + newName;
    }

    public static String changeWeigth() {
        scanner = new Scanner(System.in);
        int newWeigth = scanner.nextInt();
        return "The weigth is changed to: " + newWeigth;
    }
}
