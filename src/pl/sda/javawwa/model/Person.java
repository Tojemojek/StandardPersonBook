package pl.sda.javawwa.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class Person implements Serializable {


    private String name;
    private String surname;
    private String addressStreet;
    private Integer addressStreetNumber;
    private String addressCity;
    private String zipCode;
    private LocalDate birthDate;
    private Integer age;
    private String bloodType;
    private Double weightInKg;
    private Double heightInCm;
    private List<String> telNo;

    public Person(String name, String surname, String addressStreet, Integer addressStreetNumber, String addressCity, String zipCode, LocalDate birthDate, Integer age, String bloodType, Double weightInKg, Double heightInCm, List<String> telNo) {
        this.name = name;
        this.surname = surname;
        this.addressStreet = addressStreet;
        this.addressStreetNumber = addressStreetNumber;
        this.addressCity = addressCity;
        this.zipCode = zipCode;
        this.birthDate = birthDate;
        this.bloodType = bloodType;
        this.weightInKg = weightInKg;
        this.heightInCm = heightInCm;
        this.telNo = telNo;
    }
    public Person(String name, String surname, String addressStreet, Integer addressStreetNumber, String addressCity, String zipCode, LocalDate birthDate, String bloodType, Double weightInKg, Double heightInCm) {
        this.name = name;
        this.surname = surname;
        this.addressStreet = addressStreet;
        this.addressStreetNumber = addressStreetNumber;
        this.addressCity = addressCity;
        this.zipCode = zipCode;
        this.birthDate = birthDate;
        this.bloodType = bloodType;
        this.weightInKg = weightInKg;
        this.heightInCm = heightInCm;

    }

    public void setTelNo(List<String> telNo) {
        this.telNo = telNo;
    }

}
