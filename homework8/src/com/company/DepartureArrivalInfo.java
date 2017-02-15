package com.company;

/**
 * Created by alexa_000 on 11/30/2016.
 */
public class DepartureArrivalInfo {
    private String dayOfWeek;
    private int time;
    private String airportCode;
    private String airportGate;

    public void DepartureArrivalInfo(String dayOfWeek, int time){
        this.dayOfWeek = dayOfWeek;
        this.time = time;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public int getTime() {
        return time;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public String getAirportGate() {
        return airportGate;
    }
}
