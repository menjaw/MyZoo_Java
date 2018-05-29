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
public class Fish implements I_Animal {

    //Variables
    private String name;
    private int weight;
    private String sound;
    public I_Behavior behaviorType;
    public I_Tempo tempo;

    public Fish() {
        this.behaviorType = new Swim();
    }

    public Fish(String name, int weight, String sound, I_Behavior behaviorType) {
        this.name = name;
        this.weight = weight;
        this.sound = sound;
        this.behaviorType = new Swim();
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
        return behaviorType.canDoIt();
    }

    @Override
    public void setBehavior(I_Behavior newBehavior) {
        behaviorType = newBehavior;
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
