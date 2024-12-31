package com.ajaz.SpringAssignment.models;

public class Address {
    private String state;
    private String city;
    private String area;
    private String businessPark;
    private String building;
    private int pin;

    public Address(){

    }

    public Address(String state, String city, String area, String businessPark, String building, int pin) {
        System.out.println("Address() object created...");
        this.state = state;
        this.city = city;
        this.area = area;
        this.businessPark = businessPark;
        this.building = building;
        this.pin = pin;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getBusinessPark() {
        return businessPark;
    }

    public void setBusinessPark(String businessPark) {
        this.businessPark = businessPark;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Address{" +
                "state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", area='" + area + '\'' +
                ", businessPark='" + businessPark + '\'' +
                ", building='" + building + '\'' +
                ", pin=" + pin +
                '}';
    }
}
