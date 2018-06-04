/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization;

import interfaces.Animal_Interface;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import subClass.Lion;

/**
 *
 * @author Menja
 */
public class DeSerialization {

    private static Zebra zebra = null;
    private static Lion lion = null;
    private static String path;
    private static FileInputStream fileInStream;
    private static ObjectInputStream objInStream;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try {
            path = "C:\\Temp\\Michelle.ser";
            fileInStream = new FileInputStream(path);
            objInStream = new ObjectInputStream(fileInStream);

            lion = (Lion) objInStream.readObject();
            zebra = (Zebra) objInStream.readObject();
            objInStream.close();
            fileInStream.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Something went wrong" + ex.getMessage());
        }

        System.out.println("Name of animal: " + zebra.getName());
        System.out.println("Weigth og animal: " + zebra.getWeigth());
        System.out.println("Sound of animal: " + zebra.getSound());
        System.out.println("Symptons of animal: " + zebra.getIllness());
        System.out.println("Medicin for animal: " + zebra.getMedicin() + "\n");

        System.out.println("Name of animal: " + lion.getName());
        System.out.println("Weigth og animal: " + lion.getWeigth());
        System.out.println("Sound of animal: " + lion.getSound());
        System.out.println("Symptons of animal: " + lion.getIllness());
        System.out.println("Medicin for animal: " + lion.getMedicin() + "\n");
    }
}
