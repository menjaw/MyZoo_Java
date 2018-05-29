/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorPattern;

/**
 *
 * @author Menja
 */
public class AnimalArrived {

    public static void main(String[] args) {
        AfricaAnimals africaAnimals = new AfricaAnimals();
        BrazilAnimals brazilAnimals = new BrazilAnimals();
        ChinaAnimal chinaAnimals = new ChinaAnimal();
        Animal_Iterator animalIterator = new Animal_Iterator(africaAnimals, brazilAnimals, chinaAnimals);

        animalIterator.showTheAnimals();
    }
}
