/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorPattern;

import interfaces.I_Iterator;
import java.util.Hashtable;
import java.util.Iterator;

/**
 *
 * @author Menja
 */
public class ChinaAnimal implements I_Iterator {

    //Variables
    private Hashtable<Integer, Animal> arrivedAnimals;
    private int hashKey = 0;

    public ChinaAnimal() {
        this.arrivedAnimals = new Hashtable<Integer, Animal>();

        addAnimal("The Big Panda", 52, "ZZZZzzzzz");
        addAnimal("Tiger", 33, "whwwras");
        addAnimal("The red Panda", 31, "Wiip vip sip");
    }

    public void addAnimal(String name, int weigth, String sound) {
        Animal animal = new Animal(name, weigth, sound);
        arrivedAnimals.put(hashKey, animal);
        hashKey++;

    }

    public Hashtable<Integer, Animal> getAnimals() {
        return arrivedAnimals;
    }

    @Override
    public Iterator createIterator() {
        return arrivedAnimals.values().iterator();
    }

}
