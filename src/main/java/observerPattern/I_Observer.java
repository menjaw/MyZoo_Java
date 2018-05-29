/*
 * This interface descripes what could happen to a dog.
 * 
 * It is the listener. The DogOwner-class implements this interface
 * 
 * 
 */
package observerPattern;

/**
 *
 * @author Menja
 */
public interface I_Observer {
    public void isHungry(AnimalEvent event);
    public void isThirsty(AnimalEvent event);
    public void isLonely(AnimalEvent event);
    public void isSlepping(AnimalEvent event);
}
