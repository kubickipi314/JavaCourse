package Serialization;

import java.io.*;
import java.util.Date;


public class Main {

    public static void main(String[] args){
        try {

            Period period = new Period(new Date(), new Date(System.currentTimeMillis() + 1000000));

            FileOutputStream fileOut = new FileOutputStream("file.out");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(period);
            out.close();
            fileOut.close();
            System.out.println("Serialized Period is saved in file.out");

            FileInputStream fileIn = new FileInputStream("file.out");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Period deserializedPeriod = (Period) in.readObject();
            in.close();
            fileIn.close();

            System.out.println("Deserialized Period: " + deserializedPeriod);

        } catch (IOException | ClassNotFoundException i) {
            i.printStackTrace();
        }
    }

}