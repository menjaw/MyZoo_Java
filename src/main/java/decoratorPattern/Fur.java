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
public class Fur extends LookDecorator {

    //Variables
    private I_Look look;

    //Constructor
    public Fur(I_Look look) {
        super(look);
        this.look = look;
    }

    //Methods
    @Override
    public String getType() {
        return look.getType() + "Fur";
    }

    @Override
    public String getDescription() {
        return look.getDescription() + "very nice and soft fur";
    }
}
