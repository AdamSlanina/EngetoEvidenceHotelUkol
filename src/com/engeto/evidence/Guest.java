package com.engeto.evidence;

import java.time.LocalDate;


public class Guest {
    private String name;
    private String surname;
    private LocalDate dateOfBirth;

    public Guest(String name, String surname, String dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = LocalDate.parse(dateOfBirth);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString(){
        return this.name+" "+this.surname+" "+this.dateOfBirth;
    }
}
