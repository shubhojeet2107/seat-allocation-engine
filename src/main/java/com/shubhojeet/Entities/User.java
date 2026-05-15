package com.shubhojeet.Entities;

import java.util.*;

// Represents a user in the system
public class User {
    private int userID;
    private String name;
    private String hashedPassword;
//    private List<Booking> ticketsBooked;

    public User(int userID, String name, String hashedPassword){
        this.userID = userID;
        this.name = name;
        this.hashedPassword = hashedPassword;
    }
}
