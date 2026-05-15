package com.shubhojeet.Services;

import com.shubhojeet.Entities.Booking;
import com.shubhojeet.Entities.Train;
import com.shubhojeet.Entities.User;
import java.util.ArrayList;
import java.util.List;

// Handles all booking-related operations like adding users, trains, and booking tickets
public class BookingManager {
    private List<User> users = new ArrayList<>();
    private List<Train> trains = new ArrayList<>();
    private List<Booking> bookings = new ArrayList<>();

    public BookingManager(List<User> users, List<Train> trains, List<Booking> bookings){
        this.users = users;
        this.trains = trains;
        this.bookings = bookings;
    }
}
