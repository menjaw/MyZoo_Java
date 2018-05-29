/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.Collection;
import subClass.Dog;
import subClass.Horse;
import superClass.Animal_Super;

/**
 *
 * @author Menja
 */
public class WorkWithAnimal {

    //Variables
    private static Animal_Super dog = new Dog();
    private static Animal_Super horse = new Horse();

    public static void main(String[] args) {
        //1 - 
        animalSounds();

        //2 - Getting access to the methods in the subclasses
        castDog();
        castHorse();
    }

    //Methods
    public static void animalSounds() {
        Collection<Animal_Super> animals = new ArrayList<>();

        animals.add(dog);
        animals.add(horse);

        System.out.println("The dog say: " + dog.getSound());
        System.out.println("The horse say: " + horse.getSound());
    }

    /**
     * This is just to show how you can get access to the methods in the
     * subclasses
     */
    public static void castDog() {
        ((Dog) dog).digDownBone();
    }

    /**
     * This is just to show how you can get access to the methods in the
     * subclasses
     */
    public static void castHorse() {
        ((Horse) horse).jumpOverFence();
    }
}
