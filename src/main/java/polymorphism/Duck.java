/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

import interfaces.I_Walk;
import superClass.Animal_Super;

/**
 *
 * @author Menja
 */
public class Duck extends Animal_Super implements I_Walk{

    public Duck() {
        super();//Overrides the methods in Animal_Super class and invokes them from here
        setName("I am a Duck");
        setWeigth(3);
        setSound("Rap wrap wraaap rap");
    }

    @Override
    public void dontWalk() {
        System.out.println("I am tired and do not wanna move my legs");
    }

    @Override
    public void walkSlow() {
        System.out.println("I walk slowly.....");
    }

    @Override
    public void walkFast() {
        System.out.println("Walking, walking, walking... I am walking fast!!");
    }
    
    
    
}
