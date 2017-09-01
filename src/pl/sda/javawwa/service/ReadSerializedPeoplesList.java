package pl.sda.javawwa.service;

import pl.sda.javawwa.model.Person;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class ReadSerializedPeoplesList {

    public static void readFile(List<Person> people){
        try             (FileInputStream fileIn = new FileInputStream("personList.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn)){

            people = (List<Person>) in.readObject();
            in.close();
            fileIn.close();
        }catch(IOException i) {
            i.printStackTrace();
            return;
        }catch(ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }
    }

}
