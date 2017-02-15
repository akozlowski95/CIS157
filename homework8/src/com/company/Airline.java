package com.company;

import java.util.ArrayList;

/**
 * Created by alexa_000 on 11/30/2016.
 */
public class Airline {
    private String name;
    private String code;
    ArrayList<Aircraft> aircraft;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ArrayList<Aircraft> getAircraft() {
        return aircraft;
    }

    public void setAircraft(ArrayList<Aircraft> aircraft) {
        this.aircraft = aircraft;
    }

    public void printAirlineConfirmation(){

        System.out.printf("%s was successfully added.", name);
    }
}
