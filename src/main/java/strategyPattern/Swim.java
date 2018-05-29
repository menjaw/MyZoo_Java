/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategyPattern;

import interfaces.I_Behavior;

/**
 *
 * @author Menja
 */
public class Swim implements I_Behavior{

    @Override
    public String canDoIt() {
        return "I love water and can swim";
    }

}
