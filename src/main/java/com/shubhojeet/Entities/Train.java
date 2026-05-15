package com.shubhojeet.Entities;

import java.sql.Time;
import java.util.List;
import java.util.Map;

// Represents a train with basic seat and route details
public class Train {
    private int trainID;
    private String trainName;
    private int totalSeats;
    private int availableSeats;
    private String source;
    private String destination;
//    private List<List<Integer>> seats;
//    private Map<String, Time> stationTimes;
//    private List<String> stations;

    public Train(int trainID, String trainName, int totalSeats, int availableSeats, String source, String destination){
        this.trainID = trainID;
        this.trainName = trainName;
        this.totalSeats = totalSeats;
        this.availableSeats = availableSeats;
        this.source = source;
        this.destination = destination;
    }
 }
