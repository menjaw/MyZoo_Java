/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import interfaces.I_Animal;
import interfaces.I_Behavior;
import interfaces.I_Doctor;
import interfaces.I_Look;
import interfaces.I_Tempo;
import interfaces.I_Walk;
import java.io.Serializable;
import strategyPattern.Fast;
import strategyPattern.Fly;
import strategyPattern.Slow;
import strategyPattern.Swim;

/**
 *
 * @author Menja
 */
public class Elephant implements I_Animal, I_Look, I_Walk, I_Doctor, Serializable {

    //Variables
    private String name;
    private int weigth;
    private String sound;
    private I_Behavior behavior;
    private I_Tempo tempo;
    private String illness;
    private String medicin;

    //Constructors
    public Elephant() {
        this.behavior = new Swim();
        this.tempo = new Slow();
    }

    public Elephant(String name, int weigth, String sound) {
        this.name = name;
        this.weigth = weigth;
        this.sound = sound;
        this.behavior = new Fly();
        this.tempo = new Slow();
    }

    public Elephant(String name, int weigth, String sound, String illness, String medicin) {
        this.name = name;
        this.weigth = weigth;
        this.sound = sound;
        this.illness = illness;
        this.medicin = medicin;
        this.behavior = new Fly();
        this.tempo = new Slow();
    }

    public Elephant(String name, int weigth, String sound, I_Behavior behavior, I_Tempo tempo) {
        this.name = name;
        this.weigth = weigth;
        this.sound = sound;
        this.behavior = new Swim();
        this.tempo = tempo;
    }

    public Elephant(String name, int weigth, String sound, I_Behavior behavior, I_Tempo tempo, String illness, String medicin) {
        this.name = name;
        this.weigth = weigth;
        this.sound = sound;
        this.behavior = new Swim();
        this.tempo = new Fast();
        this.illness = illness;
        this.medicin = medicin;
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
        this.weigth = weigth;
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

    @Override
    public String getType() {
        return "";
    }

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public void dontWalk() {
        System.out.println("Don't want to walk");
    }

    @Override
    public void walkSlow() {
        System.out.println("Walking slowly");
    }

    @Override
    public void walkFast() {
        System.out.println("Walking fast");
    }

    @Override
    public void setIllness(String illness) {
        this.illness = illness;
    }

    @Override
    public String getIllness() {
        return illness;
    }

    @Override
    public void setMedicin(String medicin) {
        this.medicin = medicin;
    }

    @Override
    public String getMedicin() {
        return medicin;
    }

    @Override
    public String toString() {
        return "Name: " + name
                + "\nWeigth: " + weigth + " kg"
                + "\nSound: " + sound;
    }

}
