/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization;

import interfaces.Animal_Interface;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import subClass.Lion;

/**
 *
 * @author Menja
 */
public class Serialization {
    //Variables

    private static Animal_Interface zebra;
    private static Animal_Interface lion;
    private static String path;
    private static FileOutputStream fileOutStream;
    private static ObjectOutputStream objOutStream;

    public static void main(String[] args) throws IOException {

        try {
            zebra = new Zebra("Zebra Zenna", 250, "La la al ula la la ti", "Sings", "Put on some real music");
            lion = new Lion("Lion Lennon", 150, "Wrral wraal wraaal", "Cry", "Cuddle it");
            path = "C:\\Temp\\Illness.ser";
            fileOutStream = new FileOutputStream(path);
            objOutStream = new ObjectOutputStream(fileOutStream);

            objOutStream.writeObject(lion);
            objOutStream.writeObject(zebra);
            objOutStream.close();
            fileOutStream.close();
            System.out.println("Done with the serialazation!");

        } catch (FileNotFoundException ex) {
            System.out.println("Something went wrong! \n" + ex.getMessage());
        }
    }
}
