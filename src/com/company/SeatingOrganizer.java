package com.company;

import java.util.ArrayList;

/**
 * Created by Luke on 10/16/2016.
 */
public class SeatingOrganizer {

    ArrayList<Reservation> reservations;
    Reservation [][] seatingChart = new Reservation[10][20];
    public SeatingOrganizer(ArrayList<Reservation> reservations) {
        this.reservations = reservations;
        organize();
    }

    private void organize() {
        //calculate buffers
        //place people from back row down using buffer between reservations
        //how to deal with overloading rows?
        //Default: Split them
        //Store them for later
        //priority queue based on reservation order and size of group
    }

    public String toString() {

    }
}
