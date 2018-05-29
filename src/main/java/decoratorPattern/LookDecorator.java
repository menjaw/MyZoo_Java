/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorPattern;

import interfaces.I_Look;

/**
 *
 * @author Menja
 */
public abstract class LookDecorator implements I_Look {

    //Variables
    private I_Look look;

    //Constructor
    public LookDecorator(I_Look look) {
        this.look = look;
    }

    //Methods
    @Override
    public String getType() {
        return look.getType();
    }

    @Override
    public String getDescription() {
        return look.getDescription();
    }

}
