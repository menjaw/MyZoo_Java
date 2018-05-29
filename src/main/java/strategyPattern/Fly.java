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
public class Fly implements I_Behavior{

    @Override
    public String canDoIt() {
        return "I have wings and can fly";
    }
    
}
