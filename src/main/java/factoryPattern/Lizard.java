/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryPattern;

import interfaces.I_Animal;
import interfaces.I_Behavior;
import interfaces.I_Tempo;
import java.io.Serializable;

/**
 *
 * @author Menja
 */
public class Lizard implements I_Animal, Serializable  {

    //Variables
    private String name;
    private int weight;
    private String sound;
    
    //Constructor
    public Lizard() {
    }

    public Lizard(String name, int weight, String sound) {
        this.name = name;
        this.weight = weight;
        this.sound = sound;
    }
    

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        System.out.println("I am a Lizard");
        return name;
    }

    @Override
    public void setWeigth(int weigth) {
        this.weight = weigth;
    }

    @Override
    public int getWeigth() {
        System.out.println(3);
        return weight;
    }

    @Override
    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public String getSound() {
        System.out.println("I say tsshmmw iimm slslsp");
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
