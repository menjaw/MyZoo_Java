/*
 * This class is the factory to generate objects of the concrete classes
 * In this example it is a factory to generate raptiles of the raptile classes 
 */
package factoryPattern;

import interfaces.I_Animal;
import interfaces.I_Factory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import strategyPattern.Bird;
import subClass.Dog;
import subClass.Lion;

/**
 *
 * @author Menja
 */
public class ReptileFactory implements I_Factory {

    //Variables
    Collection<String> retileList;
    Scanner scanner;
    String choice = "";

    @Override
    public I_Animal getAnimal(String animal) {
        //Declare variables
        scanner = new Scanner(System.in);

        //Choose reptil 
        System.out.println("Which reptile would you like to get?");
        reptilList();
        choice = scanner.nextLine();
        
        switch (choice) {
            case "Lizard":
                System.out.println("You selected to see the Lizard");
                return new Lizard();
            case "Chameleon":
                System.out.println("You selected to see the Chameleon");
                return new Chameleon();
            default:
                System.out.println("Please enter a name from the list");
        }

        return null;
    }

    public void reptilList() {
        retileList = new ArrayList<String>();
        //Add reptile to list
        retileList.add("Chameleon");
        retileList.add("Lizard");
        //Print list
        System.out.println(retileList);
    }

}
