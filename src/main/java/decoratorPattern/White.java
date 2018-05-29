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
public class White extends LookDecorator {

    //Variables
    private I_Look look;

    //Constructor
    public White(I_Look look) {
        super(look);
        this.look = look;
    }

    //Methods
    @Override
    public String getType() {
        return "Color";
    }

    @Override
    public String getDescription() {
        return "white ";
    }

}
