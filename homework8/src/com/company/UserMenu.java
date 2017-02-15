package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by alexa_000 on 11/30/2016.
 */
public class UserMenu {
    ArrayList<String>menuList;
    String menuHeader;
    Scanner sc;

    public UserMenu(){
        menuList = new ArrayList<>();
        menuHeader = "";
        sc = new Scanner(System.in);
    }

    public void setHeader(String header){
            menuHeader = header;
    }

    public void add(String item){
        menuList.add(item);
    }

    public void pause(){
        pause("\nPress enter to continue:");
    }

    public void pause(String prompt){
        System.out.print(prompt);
        sc.nextLine();
    }

    //get a word from user
    public String getWord(String prompt){
        System.out.print(prompt);
        String word = sc.next();
        sc.nextLine();
        return word;
    }

    //get a line from a user
    public String getLine(String prompt){
        System.out.print(prompt);
        return sc.nextLine();
    }

    //gets a integer from user
    public int getInt(String prompt){
        int num = 0;

        for (;;) {
            System.out.print(prompt);
            try {
                num = sc.nextInt();
            } catch (java.util.InputMismatchException ex) {
                System.out.println("Invalid input, please Reenter");
                continue;
            }finally {
                sc.nextLine();
                return num;
            }

        }
    }
    //print the menu and get int from the user
    public int getUserChoice(){
        int choice = 0;
        for (;;){
            System.out.println(menuHeader);
            for (String item : menuList){
                System.out.println(item);
            }choice = getInt("Enter: ");

            if (choice < 1 || choice > menuList.size()){
                System.out.println("Invalid, Please retry: ");
                pause();
                continue;
            }
            return choice;
        }
    }
}
