/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import decoratorPattern.Blue;
import decoratorPattern.Brown;
import decoratorPattern.Feather;
import decoratorPattern.Fur;
import interfaces.I_Look;
import java.util.Scanner;
import strategyPattern.Fast;
import strategyPattern.Swim;

/**
 *
 * @author Menja
 */
public class Elly {

    public void showElly() {
        //Variables
        Elephant elly = new Elephant("Elly the Elephant", 900, "Wiiopppttioopp trutpp", "influenza", "chocolate, peanuts, fruit and chamomile tea");
        I_Look decorate;
        String input = "";
        Scanner scanner = new Scanner(System.in);

        //ELEPHANT
        while (!input.equals("exit")) {
            System.out.println("\n What would you like to know about Elly?");
            System.out.println("Type \n"
                    + "1: info \n"
                    + "2: behavior \n"
                    + "3: look \n"
                    + "4: illness \n"
                    + "5: medicin \n"
                    + "6: tempo \n"
                    + "7: cure \n");
            input = scanner.nextLine();

            switch (input) {
                case "info":
                    System.out.println(elly);
                    break;
                case "behavior":
                    //Check the behavior
                    System.out.println("Ellys behavior rigth now: " + elly.behavior());
                    break;
                case "look":
                    //Check the look
                    decorate = new Feather(new Blue(elly));
                    System.out.println("Elly think she has " + decorate.getDescription());
                    break;
                case "illness":
                    //Check for illness and medicin
                    System.out.println("Elly is sick and migth have " + elly.getIllness());
                    break;
                case "medicin":
                    //Check for medicin
                    System.out.println("Elly will need " + elly.getMedicin());
                    break;
                case "tempo":
                    //Check for the tempo
                    System.out.println("Ellys tempo: " + elly.tempo());
                    break;
                case "cure":
                    System.out.println("You have cured Elly \n");
                    //Change the look
                    decorate = new Fur(new Brown(elly));
                    System.out.println("Now Elly think she has " + decorate.getDescription());
                    //Change tempo
                    elly.setTempo(new Fast());
                    System.out.println("The tempo has changed and Elly now says " + elly.tempo());
                    //Change the behavior
                    elly.setBehavior(new Swim());
                    System.out.println("Elly now thinks: " + elly.behavior());
                    break;
                default:
                    break;
            }
        }
    }
}
