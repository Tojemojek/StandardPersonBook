package pl.sda.javawwa.service;

import pl.sda.javawwa.model.Person;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class CreateHumans {


    public static void ReaderOsob(List<Person> listaWczytana) {

        try (BufferedReader doOdczytu = new BufferedReader(new FileReader("FakeNames.csv"))) {

            String temp = null;
            String[] temp2;
            temp = doOdczytu.readLine();
            while (temp != null) {
                if (temp.length() > 0) {
                    temp2 = temp.split(",");
                    Integer tmpYear = Integer.parseInt(temp2[6]);
                    Integer tmpMonth = Integer.parseInt(temp2[8]);
                    Integer tmpDay = Integer.parseInt(temp2[7]);
                    Integer tmpAddresNumber = Integer.parseInt(temp2[3]);
                    //Integer tmpAge = Integer.parseInt(temp2[9]);
                    Double tmpWeight = Double.parseDouble(temp2[11]);
                    Double tmpHeight = Double.parseDouble(temp2[12]);
                    LocalDate tmpDate = LocalDate.of(tmpYear, tmpMonth, tmpDay);

                    listaWczytana.add(new Person(temp2[0], temp2[1], temp2[2], tmpAddresNumber, temp2[4], temp2[5], tmpDate, temp2[10], tmpWeight, tmpHeight));
                }
                temp = doOdczytu.readLine();

            }
        } catch (IOException e) {

        }
    }

}
