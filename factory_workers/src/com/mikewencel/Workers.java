package com.mikewencel;

public class Workers {

    private String firstName;
    private String secondName;
    private double salary;

    public Workers(String firstName, String secondName, double salary) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public double getSalary() {
        return salary;
    }

}
