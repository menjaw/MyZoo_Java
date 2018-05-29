/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Menja
 */
public interface I_Animal {
    public void setName(String name);
    public String getName();
    public void setWeigth(int weigth);
    public int getWeigth();
    public void setSound(String sound);
    public String getSound();
    public String behavior();
    public void setBehavior(I_Behavior newBehavior);
    public String tempo();
    public void setTempo(I_Tempo newTempo);
}
