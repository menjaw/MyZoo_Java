/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryPattern;

import interfaces.I_Animal;
import interfaces.I_Behavior;
import interfaces.I_Tempo;

/**
 *
 * @author Menja
 */
public class Chameleon implements I_Animal{
       //Variables
    private String name;
    private int weight;
    private String sound;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        System.out.println("I am a Chameleon");
        return name;
    }

    @Override
    public void setWeigth(int weigth) {
        this.weight = weigth;
    }

    @Override
    public int getWeigth() {
        System.out.println(2);
        return weight;
    }

    @Override
    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public String getSound() {
        System.out.println("I say Mikmik mik ftfff");
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
