/*
 * This class is a representation of an event containing its properties and attributes such as its source
 */
package observerPattern;

/**
 *
 * @author Menja
 */
class AnimalEvent {

    //refrence to the source (animal) 
    private AnimalToObserve animalSource;

    //Constructor
    public AnimalEvent(AnimalToObserve animalSource) {
        this.animalSource = animalSource;
    }

    public AnimalToObserve getAnimal() {
        return animalSource;
    }

}
