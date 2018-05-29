/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorPattern;

import interfaces.I_Iterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 *
 * @author Menja
 */
public class BrazilAnimals implements I_Iterator {

    //Variables
    private Animal[] arrivedAnimals;
    private int arrayValue;

    //Constructor
    public BrazilAnimals() {
        arrivedAnimals = new Animal[3];
        addAnimal("Jaguar", 21, "Wrraaa");
        addAnimal("Pirat Fish", 13, "chob chob chib");
        addAnimal("Tukan", 3, "Wiip vip sip");
    }

    //Methods
    public void addAnimal(String name, int weigth, String sound) {
        Animal animal = new Animal(name, weigth, sound);
        arrivedAnimals[arrayValue] = animal;
        arrayValue++;

    }

    public Animal[] getAnimals() {
        return getAnimals();
    }

    @Override
    public Iterator createIterator() {
        return Arrays.asList(arrivedAnimals).iterator();
    }
}
