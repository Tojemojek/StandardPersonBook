package pl.sda.javawwa.service;

import pl.sda.javawwa.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreatePhoneNumbers {

    public static void createListOfPhoneNumber(List<Person> people){

        Random rnd = new Random();

        for (Person ppl: people){
            List<String> tmp = new ArrayList<>();
            Integer ileNr = rnd.nextInt(5);
            StringBuilder sb = new StringBuilder();

            sb.append("+48 ");
            for (int i = 0; i < ileNr;i++ ){

                for (int j = 0; j<3;j++) {
                    sb.append(100 + rnd.nextInt(899));
                }
                tmp.add(sb.toString());
            }
            ppl.setTelNo(tmp);

        }




    }

}
