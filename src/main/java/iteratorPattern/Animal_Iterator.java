/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorPattern;

import interfaces.I_Iterator;
import java.util.Iterator;

/**
 *
 * @author Menja
 */
public class Animal_Iterator {

    //Variables
    I_Iterator iterateAfrica;
    I_Iterator iterateBrazil;
    I_Iterator iterateChina;

    //Constructor
    public Animal_Iterator(I_Iterator africaAnimal, I_Iterator brazilAnimal, I_Iterator chinaAnimal) {
        iterateAfrica = africaAnimal;
        iterateBrazil = brazilAnimal;
        iterateChina = chinaAnimal;
    }

    //Methods
    public void showTheAnimals() {
        Iterator africaAnimal = iterateAfrica.createIterator();
        Iterator brazilAnimal = iterateBrazil.createIterator();
        Iterator chinaAnimal = iterateChina.createIterator();

        System.out.println("Animals from Africa".toUpperCase());
        printTheAnimals(africaAnimal);

        System.out.println("Animals from Brazil".toUpperCase());
        printTheAnimals(brazilAnimal);

        System.out.println("Animals from China".toUpperCase());
        printTheAnimals(chinaAnimal);

    }

    public void printTheAnimals(Iterator iterator) {
        while (iterator.hasNext()) {
            Animal animal = (Animal) iterator.next();

            System.out.println("Animal: " + animal.getName() + " ");
            System.out.println("Weigth: " + animal.getWeigth() + " kg");
            System.out.println("Says: " + animal.getSound() + "\n");
        }
    }

}
