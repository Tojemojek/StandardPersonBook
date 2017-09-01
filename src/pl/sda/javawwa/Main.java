package pl.sda.javawwa;

import pl.sda.javawwa.model.Person;
import pl.sda.javawwa.service.ReadSerializedPeoplesList;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Person> people = new ArrayList<>();

    public static void main(String[] args) {


        ReadSerializedPeoplesList.readFile(people);


        people.forEach(System.out::println);


    }

}

