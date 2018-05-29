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
public class Dog extends Animal_Super {

    //Constructor
    public Dog() {
        super(); //overrides the superclass(animal) methods and invokes it from here
        setName("I am a dog");
        setWeigth(10);
        setSound("Wuf wuf wuf");
    }
    
    //Methods
    public void digDownBone(){
        System.out.println("The dog has dug down his bone");
    }

}
