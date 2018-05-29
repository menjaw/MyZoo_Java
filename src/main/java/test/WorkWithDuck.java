/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import polymorphism.Duck;

/**
 *
 * @author Menja
 */
public class WorkWithDuck {
    public static void main(String[] args) {
        Duck duck = new Duck();
        
        System.out.println(duck.getName());
        System.out.println(duck.getSound());
        duck.dontWalk();
        duck.walkFast();
        duck.walkSlow();
    }
}
