/*
 * - An abstract class is usefull when you want the power of polymorphism without 
 * the work.
 *  
 * - Polymorphism is when a single method can do different things based on the 
 * object that it is acting upon. 
 *
 * - You cannot create objects from an abstract class. but you can block people
 * from being able to turn a specific class of an object.
 *
 * - Subclasses can still extend it (otherwise it would be worthless)
 */
package abstractClass;

/**
 *
 * @author Menja
 */
abstract public class Animal_Abstract {

    //protected fields are like private (subclasses can inherant from it)
    protected String name;
    protected int weight;
    protected String sound;

    public abstract void setName(String name);

    public abstract String getName();

    public abstract void setWeight(int weight);

    public abstract int getWeight();

    public abstract void setSound(String sound);

    public abstract String getSound();

}
