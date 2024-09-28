package com.spring.beans;

public class Address {
    private String pin;
    private String street;
    private String city;

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String addressDetails() {
        return pin + ", " + street + ", " + city;
    }
}
