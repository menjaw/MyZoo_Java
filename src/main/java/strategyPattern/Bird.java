/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategyPattern;

import interfaces.I_Animal;
import interfaces.I_Behavior;
import interfaces.I_Tempo;

/**
 *
 * @author Menja
 */
public class Bird implements I_Animal {
    //Variables
    private String name;
    private int weight;
    private String sound;
    public I_Behavior behavior;
    public I_Tempo tempo;

    public Bird() {
        this.behavior = new Fly();
        this.tempo = new Slow();
    }

    public Bird(String name, int weight, String sound, I_Behavior behavior, I_Tempo tempo) {
        this.name = name;
        this.weight = weight;
        this.sound = sound;
        this.behavior = behavior;
        this.tempo = tempo;
    }
    
    

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
        this.weight = weigth;
    }

    @Override
    public int getWeigth() {
        return weight;
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
        return behavior.canDoIt();
    }

    @Override
    public void setBehavior(I_Behavior newBehavior) {
        behavior = newBehavior;
    }

    @Override
    public String tempo() {
       return tempo.getTempo();
    }

    @Override
    public void setTempo(I_Tempo newTempo) {
        tempo = newTempo;
    }
}
