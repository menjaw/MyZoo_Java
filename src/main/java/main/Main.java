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
import strategyPattern.Fast;
import strategyPattern.Swim;

/**
 *
 * @author Menja
 */
public class Main {

    public static void main(String[] args) {
        //Variables
        I_Look decorate;

        //ELEPHANT NUMBER 1
        Elephant elly = new Elephant("Elly the Elephant", 900, "Wiiopppttioopp trutpp", "influenza", "chocolate, peanuts, fruit and chamomile tea");
        System.out.println(elly);

        //Check the behavior
        System.out.println("Ellys behavior rigth now: " + elly.behavior());

        //Check the look 
        decorate = new Feather(new Blue(elly));
        System.out.println("Elly think she has " + decorate.getDescription());

        //Check for illness and medicin
        System.out.println("Elly is sick and migth have " + elly.getIllness());

        //Check for the tempo
        System.out.println("Ellys tempo: " + elly.tempo());

        //Check for medicin
        System.out.println("Elly will need " + elly.getMedicin());
        
        
        //Change the look
        decorate = new Fur(new Brown(elly));
        System.out.println("Now Elly think she has " + decorate.getDescription());
        
        //Change tempo
        elly.setTempo(new Fast());
        System.out.println("The tempo has changed and Elly now says " + elly.tempo());
        
        //Change the behavior
        elly.setBehavior(new Swim());
        System.out.println("Elly now thinks: " + elly.behavior());

        
    }
}
