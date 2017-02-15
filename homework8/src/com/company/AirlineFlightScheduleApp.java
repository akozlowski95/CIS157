package com.company;

import java.util.Scanner;

public class AirlineFlightScheduleApp {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        UserMenu menu = new UserMenu();
        FlightSchedule flightSchedule = new FlightSchedule();
        Flight flight = new Flight();
        Airline airline = new Airline();
        Aircraft aircraft = new Aircraft();
        DepartureArrivalInfo departureArrivalInfo = new DepartureArrivalInfo();

        menu.setHeader("Welcome to the Flight Scheduler!");
        menu.add("1. Set Clock");
        menu.add("2. Clear Schedule");
        menu.add("3. Add Airline");
        menu.add("4. Add Flight");
        menu.add("5. Cancel Flight");
        menu.add("6. Show Flight Info");
        menu.add("7. Show Departures");
        menu.add("8. Show Arrivals");
        menu.add("9. Exit");


        for (;;){
            int choice = menu.getUserChoice();

            switch (choice){
                case 1:
                    String day = Validation.getString(sc,"Enter U, M, T, W, R, F, or S for corresponding day of the week:");
                    int time = Validation.getInt("Please enter the time in military notation: ",sc);
                    departureArrivalInfo = new DepartureArrivalInfo(day,time);
                    menu.pause();
                    break;
                case 2:
                    System.out.println("Clear");
                    menu.pause();
                    break;
                case 3:


                    menu.pause();
                    break;
                case 4:
                    System.out.println("Add Flight");
                    menu.pause();
                    break;
                case 5:
                    System.out.println("Cancel Flight");
                    menu.pause();
                    break;
                case 6:
                    System.out.println("Show flight info");
                    menu.pause();
                    break;
                case 7:
                    System.out.println("Show departures");
                    menu.pause();
                    break;
                case 8:
                    System.out.println("Show arrivals");
                    menu.pause();
                    break;
                case 9:
                    System.out.println("Exit");
                    menu.pause();
                    break;
            }
        }
    }
}
