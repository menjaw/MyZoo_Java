/*
 * This class represent the actual object and is the source. In this case it descripes the dog.
 *
 * One owner can have one-to-many dogs
 */
package observerPattern;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author Menja
 */
public class AnimalToObserve {

    //Variables
    private Set<I_Observer> listeners; // Set is ised because we don't want to check for duplication (Set removes duplications)
    private String name;
    private boolean animalIsAlive = true;

    //Constructor
    public AnimalToObserve(String name) {
        this.name = name;
        listeners = new HashSet<I_Observer>();
        animalLife.start();
    }

    //The dogs life is created with a thread (it select between the events))
    private Thread animalLife = new Thread() {
        @Override
        public void run() {
            while (animalIsAlive) {
                Random random = new Random();
                int animalBehavior = random.nextInt(4);
                switch (animalBehavior) {
                    case 0:
                        fireIsHungryEvent();
                        break;
                    case 1:
                        fireIsThirstyEvent();
                        break;
                    case 2:
                        fireIsLonelyEvent();
                        break;
                    case 3:
                        fireIsSleepingEvent();
                        break;
                }
                //The dog change behavior every x second
                try {
                    sleep(5000);
                } catch (Exception e) {
                    e.getMessage();
                }
            }
        }
    };

    //Methods
    public String getName() {
        return name;
    }

    public synchronized void addObserver(I_Observer listener) {
        listeners.add(listener);
    }

    public synchronized void removeObserver(I_Observer listener) {
        listeners.remove(listener);
    }

    public synchronized void fireIsHungryEvent() {
        System.out.println(name + " is hungry.");
        AnimalEvent event = new AnimalEvent(this);
        for (I_Observer listener : listeners) {
            listener.isHungry(event);
        }
    }

    public synchronized void fireIsThirstyEvent() {
        System.out.println(name + " is thirsty.");
        AnimalEvent event = new AnimalEvent(this);
        for (I_Observer listener : listeners) {
            listener.isThirsty(event);
        }
    }

    public synchronized void fireIsLonelyEvent() {
        System.out.println(name + " is lonely.");
        AnimalEvent event = new AnimalEvent(this);
        for (I_Observer listener : listeners) {
            listener.isLonely(event);
        }
    }

    public synchronized void fireIsSleepingEvent() {
        System.out.println(name + " is sleeping.");
        AnimalEvent event = new AnimalEvent(this);
        for (I_Observer listener : listeners) {
            listener.isSlepping(event);
        }
    }
}
