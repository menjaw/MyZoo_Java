/*
 * This class use the ReptileFactory
 */
package factoryPattern;

import interfaces.I_Animal;
import java.util.Scanner;

/**
 *
 * @author Menja
 */
public class GetReptile {

    public static void main(String[] args) {
        ReptileFactory factory = new ReptileFactory();
        I_Animal reptile = factory.getAnimal("");
        reptile.getName();
        reptile.getSound();
    }
}
