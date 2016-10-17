package com.company;

/**
 * Created by Luke on 10/16/2016.
 */
public class Reservation {
    private String [] assignedSeats;
    private int numberOfReservations;
    private String name;

    public Reservation(String name, int numberOfReservations) {
        assignedSeats = new String[numberOfReservations];
        this.numberOfReservations = numberOfReservations;
        this.name = name;
    }

    public String [] getAssignedSeats() { return assignedSeats; }
    public int getNumber() { return numberOfReservations; }
    public String getName() { return name; }

    public void setAssignedSeats(String [] assignedSeats) { this.assignedSeats = assignedSeats; }
    public void setNumber() { this.numberOfReservations = numberOfReservations; }
    public void setName() { this.name = name; }
}
