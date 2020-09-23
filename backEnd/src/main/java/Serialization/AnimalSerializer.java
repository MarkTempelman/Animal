package Serialization;

import Animals.Animal;

import java.io.*;

public class AnimalSerializer {
    public static void saveAnimal(Animal animal){
        try {
            FileOutputStream fileOut =
                    new FileOutputStream("src/main/java/Data/animal.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(animal);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in src/main/java/Data/animal.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public static Animal getAnimal(){
        Animal animal = null;
        try{
            FileInputStream fileIn = new FileInputStream("src/main/java/Data/animal.ser");
            ObjectInputStream in = new ObjectInputStream((fileIn));
            animal = (Animal) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return animal;
        }
        return animal;
    }
}
