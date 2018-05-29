/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategyPattern;

import interfaces.I_Tempo;

/**
 *
 * @author Menja
 */
public class Fast implements I_Tempo {

    @Override
    public String getTempo() {
        return "I am fast";
    }

}
