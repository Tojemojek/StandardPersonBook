package pl.sda.javawwa;

import pl.sda.javawwa.model.Person;
import pl.sda.javawwa.service.CreateHumans;
import pl.sda.javawwa.service.CreatePhoneNumbers;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Person> people = new ArrayList<>();

    public static void main(String[] args) {


        CreateHumans.ReaderOsob(people);
        CreatePhoneNumbers.createListOfPhoneNumber(people);

        try (FileOutputStream fileOut = new FileOutputStream("personList.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(people);
            System.out.printf("Serialized data is saved in");
        } catch (IOException i) {
            i.printStackTrace();
        }

        System.out.println("Co wyszło?");

        people.forEach(System.out::println);


    }
}
