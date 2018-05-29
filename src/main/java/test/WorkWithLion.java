/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import subClass.Lion;

/**
 *
 * @author Menja
 */
public class WorkWithLion {

    public static void main(String[] args) {
        Lion lion = new Lion();

        //Define lion
        lion.setName("Simba");
        lion.setWeigth(75);
        lion.setSound("Wwwrraaahhh wwrauw");

        //Get monkey
        System.out.println(lion.getName());
        System.out.println(lion.getWeigth());
        System.out.println(lion.getSound());
    }
}
