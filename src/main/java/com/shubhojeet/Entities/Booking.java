package com.shubhojeet.Entities;

import java.time.LocalDate;

// Represents a booking made by a user for a train
public class Booking {

    private int bookingID;
    private int userID;
    private int trainID;
    private LocalDate dateOfTravel;
//    private Train train;

    public Booking(int bookingID, int userID, int trainID, LocalDate dateOfTravel){
        this.bookingID = bookingID;
        this.userID = userID;
        this.trainID = trainID;
        this.dateOfTravel = dateOfTravel;
    }
}
