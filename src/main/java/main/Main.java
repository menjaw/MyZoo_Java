/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import strategyPattern.Swim;

/**
 *
 * @author Menja
 */
public class Main {

    public static void main(String[] args) {

        //Elephant number 1
        Elephant elly = new Elephant("Elly the Elephant", 900, "Wiiopppttioopp trutpp", "Influenza", "Chocolate, Peanuts, Fruit and The");
        System.out.println(elly);

        //Check the behavior
        System.out.println("Ellys behavior rigth now: " + elly.behavior());
        
        //Check for illness and medicin
        System.out.println("Ellys illness is: " + elly.getIllness());
        
        //Change the behavior
        elly.setBehavior(new Swim());
        System.out.println("Elly now thinks: " + elly.behavior());

    }
}
