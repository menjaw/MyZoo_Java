/*
 * This class represent all that could own a dog. The person will take care of the dog depends on what the dogs behavior is.
 *
 * The class implements all abstract methods from the I_Observer interface and gets notifies when the dogs behavior change
 */
package observerPattern;

/**
 *
 * @author Menja
 */
public class ZooKeeper implements I_Observer {

    //Variables
    private String zooKeeper;

    //Constructor
    public ZooKeeper(String zooKeeper) {
        this.zooKeeper = zooKeeper;
    }

    @Override
    public void isHungry(AnimalEvent event) {
        System.out.println(zooKeeper + " you have to feed " + event.getAnimal().getName() + "\n");
    }

    @Override
    public void isThirsty(AnimalEvent event) {
        System.out.println(zooKeeper + " you have to fill the bowl with water " + event.getAnimal().getName() + " is thirsty." + "\n");
    }

    @Override
    public void isLonely(AnimalEvent event) {
        System.out.println(zooKeeper + " you have to play with " + event.getAnimal().getName() + "\n");
    }

    @Override
    public void isSlepping(AnimalEvent event) {
        System.out.println(zooKeeper + " you have to let " + event.getAnimal().getName() + " do that" + "\n");
    }

}
