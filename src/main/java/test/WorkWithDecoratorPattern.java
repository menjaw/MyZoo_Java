/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import decoratorPattern.Bear;
import decoratorPattern.Blue;
import decoratorPattern.Brown;
import decoratorPattern.Feather;
import decoratorPattern.Fur;
import decoratorPattern.White;
import interfaces.I_Look;


/**
 *
 * @author Menja
 */
public class WorkWithDecoratorPattern {

    private static I_Look animalLook;

    public static void main(String[] args) {
        //Brown Fur Bear
        animalLook = new Fur(new Brown(new Bear()));
        System.out.println("This bear has " + animalLook.getDescription());

        //White Feather Bear
        animalLook = new Feather(new White(new Bear()));
        System.out.println("This bear has " + animalLook.getDescription());
    }
    
    
}
