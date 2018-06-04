/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import interfaces.I_Animal;
import strategyPattern.Bird;
import strategyPattern.Fish;
import strategyPattern.Fly;
import strategyPattern.Fast;
import strategyPattern.Swim;
import strategyPattern.Slow;

/**
 *
 * @author Menja
 */
public class WorkWithStrategyPattern {

    public static void main(String[] args) {
        I_Animal birdy = new Bird();
        I_Animal fishy = new Fish();

        System.out.println("Birdy what can you do? \n" + birdy.behavior() + "\n");
        System.out.println("Fishy what can you do? \n" + fishy.behavior() + "\n");

        //Bird - Change the bird behavior
        birdy.setBehavior(new Swim());
        System.out.println("Birdy change behavior: \n" + birdy.behavior() + "\n");

        //Fish - Change the fish behavior
        fishy.setBehavior(new Fly());
        System.out.println("Fish change behavior: \n" + fishy.behavior() + "\n");

        //Bird - test how it walks
        System.out.println("Birdys tempo: \n" + birdy.tempo() + "\n");

        //Change birdies tempo
        birdy.setTempo(new Fast());
        System.out.println("Birdie Change the tempo: \n" + birdy.tempo());

    }
}
