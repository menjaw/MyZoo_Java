/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorPattern;

import interfaces.I_Iterator;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Menja
 */
public class AfricaAnimals implements I_Iterator {

    //Variables
    ArrayList<Animal> arrivedAnimals;

    //Constructor
    public AfricaAnimals() {
        arrivedAnimals = new ArrayList<Animal>();
        addAnimal("Lion", 30, "Wrrauww");
        addAnimal("Camel", 30, "Chaabs");
        addAnimal("Elephant", 30, "Wiiprruiu");
        addAnimal("Zebra", 30, "Weehiha");
    }

    public void addAnimal(String name, int weigth, String sound) {
        Animal animal = new Animal(name, weigth, sound);
        arrivedAnimals.add(animal);

    }

    public ArrayList<Animal> getAnimals() {
        return getAnimals();
    }

    @Override
    public Iterator createIterator() {
        return arrivedAnimals.iterator();
    }

}
