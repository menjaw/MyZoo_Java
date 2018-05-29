/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization;

import interfaces.Animal_Interface;
import interfaces.I_Doctor;
import java.io.Serializable;

/**
 *
 * @author Menja
 */
public class Zebra implements Animal_Interface, I_Doctor, Serializable {

    //Variables
    private String name;
    private int weigth;
    private String sound;
    private String illness;
    private String medicin;

    //Constructor
    public Zebra(String name, int weigth, String sound) {
        this.name = name;
        this.weigth = weigth;
        this.sound = sound;
    }

    public Zebra(String name, int weigth, String sound, String illness, String medicin) {
        this.name = name;
        this.weigth = weigth;
        this.sound = sound;
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
}
