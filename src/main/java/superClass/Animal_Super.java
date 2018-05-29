/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superClass;

import interfaces.I_Animal;

/**
 *
 * @author Menja
 */
public class Animal_Super {

    //Variables
    private String name;
    private int weigth;
    private String sound;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeigth(int weigth) {
        if (weigth > 0) {
            this.weigth = weigth;
        } else {
            System.out.println("No animals can have a weigth lower than 0");
        }
    }

    public int getWeigth() {
        return weigth;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

}
