package com.company;

/**
 * Created by alexa_000 on 11/30/2016.
 */
public class Aircraft {
    private String model;
    private  int firstClassCapacity;
    private  int businessClassCapacity;
    private  int economyClassCapacity;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getFirstClassCapacity() {
        return firstClassCapacity;
    }

    public void setFirstClassCapacity(int firstClassCapacity) {
        this.firstClassCapacity = firstClassCapacity;
    }

    public int getBusinessClassCapacity() {
        return businessClassCapacity;
    }

    public void setBusinessClassCapacity(int businessClassCapacity) {
        this.businessClassCapacity = businessClassCapacity;
    }

    public int getEconomyClassCapacity() {
        return economyClassCapacity;
    }

    public void setEconomyClassCapacity(int economyClassCapacity) {
        this.economyClassCapacity = economyClassCapacity;
    }
}
