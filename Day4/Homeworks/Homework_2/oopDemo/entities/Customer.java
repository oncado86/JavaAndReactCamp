package Homeworks.Homework_2.oopDemo.entities;

import java.time.LocalDateTime;

import Homeworks.Homework_2.oopDemo.abstracts.IEntity;

public class Customer implements IEntity  {
    private int id;
    private String firsName;
    private String lastName;
    private LocalDateTime dateOfBirth;
    private String nationalIdentity;

    public Customer(int id, String firsName, String lastName, LocalDateTime dateOfBirth, String nationalIdentity) {
        this.id = id;
        this.firsName = firsName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.nationalIdentity = nationalIdentity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationalIdentity() {
        return nationalIdentity;
    }

    public void setNationalIdentity(String nationalIdentity) {
        this.nationalIdentity = nationalIdentity;
    }

}
