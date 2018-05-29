/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import abstractClass.Monkey;

/**
 *
 * @author Menja
 */
public class WorkWithMonkey {
    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        
        //Define monkey
        monkey.setName("Loui");
        monkey.setWeight(25);
        monkey.setSound("UhhUhh uhh uuhhaa");
        
        //Get monkey
        System.out.println(monkey.getName());
        System.out.println(monkey.getWeight());
        System.out.println(monkey.getSound());
    }
}
