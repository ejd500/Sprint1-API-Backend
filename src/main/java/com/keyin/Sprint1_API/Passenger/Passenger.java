package com.keyin.Sprint1_API.Passenger;

import com.keyin.Sprint1_API.City.City;

public class Passenger {
    private int passenger_id;
    private String firstName;
    private String lastName;
    private String phoneNum;
    private City city;

    public int getPassenger_id() {
        return passenger_id;
    }

    public void setPassenger_id(int passenger_id) {
        this.passenger_id = passenger_id;
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

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

//    public List<Aircraft> getAircraftList() {
//        return aircraftList;
//    }

//    public void setAircraftList(List<Aircraft> aircraftList) {
//        this.aircraftList = aircraftList;
//    }
}
