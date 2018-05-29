/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import observerPattern.AnimalToObserve;
import observerPattern.ZooKeeper;



/**
 *
 * @author Menja
 */
public class WorkWithObserverPattern {

    public static void main(String[] args) {
       AnimalToObserve dog = new AnimalToObserve("The dogs");
        AnimalToObserve cat = new AnimalToObserve("The cats");
        AnimalToObserve giraf = new AnimalToObserve("The girafs");

        ZooKeeper zooKeeper = new ZooKeeper("Menja");


        dog.addObserver(zooKeeper);
        cat.addObserver(zooKeeper);
        giraf.addObserver(zooKeeper);
    }
}
