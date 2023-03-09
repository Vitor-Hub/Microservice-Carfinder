package com.carfinder.parkinglot.entities;

import java.io.Serializable;
import java.util.Date;

public class ParkingLot implements Serializable {

    private String location;
    private Date date;

    public ParkingLot() {
    }

    public ParkingLot(String location, Date date) {
        this.location = location;
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
