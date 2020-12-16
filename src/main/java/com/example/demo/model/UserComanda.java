package com.example.demo.model;

public class UserComanda {
    private String numeComanda;
    private int pretComanda;
    private String firstName;
    private String lastName;

    public UserComanda() {
    }

    public UserComanda(String numeComanda, int pretComanda, String firstName, String lastName) {
        this.numeComanda = numeComanda;
        this.pretComanda = pretComanda;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getNumeComanda() {
        return numeComanda;
    }

    public void setNumeComanda(String numeComanda) {
        this.numeComanda = numeComanda;
    }

    public int getPretComanda() {
        return pretComanda;
    }

    public void setPretComanda(int pretComanda) {
        this.pretComanda = pretComanda;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "UserComanda{" +
                "numeComanda='" + numeComanda + '\'' +
                ", pretComanda=" + pretComanda +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
