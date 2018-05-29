/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subClass;

import superClass.Animal_Super;

/**
 *
 * @author Menja
 */
public class Horse extends Animal_Super{

    //Constructor
    public Horse() {
    super();//Overrides the methods in animal class and invokes it from here
        setName("I am a horse");
        setWeigth(10);
        setSound("Ihhihi hhihi prrrr");
    }
    
    public void jumpOverFence(){
        System.out.println("The horse has just jumped over the fence");
    }
}
