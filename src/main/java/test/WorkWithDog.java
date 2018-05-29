/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import subClass.Dog;

/**
 *
 * @author Menja
 */
public class WorkWithDog {
    public static void main(String[] args) {
        Dog dog = new Dog();
        //Basic object 
        System.out.println(dog.getName());
        System.out.println(dog.getWeigth() + "Kg");
        System.out.println(dog.getSound() + "\n"); 
        
        //Hardcoded object
        dog.setName("Alfred");
        dog.setWeigth(13);
        dog.setSound("I am a very clever dog and I can talk");
        System.out.println(dog.getName());
        System.out.println(dog.getWeigth() + " Kg");
        System.out.println(dog.getSound());
    }
}
