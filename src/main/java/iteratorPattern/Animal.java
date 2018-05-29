/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorPattern;

import interfaces.I_Animal;
import interfaces.I_Behavior;
import interfaces.I_Tempo;

/**
 *
 * @author Menja
 */
class Animal implements I_Animal {

//Variables
    private String name;
    private int weigth;
    private String sound;

//Constructor
    public Animal(String name, int weigth, String sound) {
        this.name = name;
        this.weigth = weigth;
        this.sound = sound;
    }

//Methods
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setWeigth(int weigth) {
        if (weigth > 0) {
            this.weigth = weigth;
        } else {
            System.out.println("No animals can have a weigth lower than 0");
        }
    }

    @Override
    public int getWeigth() {
        return weigth;
    }

    @Override
    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public String getSound() {
        return sound;
    }

    @Override
    public String behavior() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setBehavior(I_Behavior newBehavior) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String tempo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTempo(I_Tempo newTempo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
