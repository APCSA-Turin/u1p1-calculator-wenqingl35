package com.example;
import java.util.Scanner;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        double totalTip = Math.round((cost * percent)) / 100.0;
        double totalBill = Math.round((cost + totalTip) * 100.0) / 100.0;
        //I learned how to read from https://stackoverflow.com/questions/8825209/rounding-decimal-points
        double costBperson = Math.round((cost / people) * 100.0) / 100.0;
        double tipPerson = Math.round((totalTip / people) * 100.0) / 100.0;
        double costAperon = Math.round((totalBill / people) * 100.0) / 100.0;
        String result = "-------------------------------\n" +
                       "Total bill before tip: $" + cost + "\n" +
                       "Total percentage: " + percent + "%\n" +
                       "Total tip: $" + totalTip + "\n" +
                       "Total Bill with tip: $" + totalBill + "\n" +
                       "Per person cost before tip: $" + costBperson + "\n" +
                       "Tip per person: $" + tipPerson + "\n" +
                       "Total cost per person: $" + costAperon + "\n" +
                       "-------------------------------\n";

        return result;
    }

    public static String extraCredit(int people, int percent, double cost) {
        String result = "Extra credit not implemented";
        boolean condition = true;
    
        //  COPY AND PASTE YOUR PROGRAM FROM calculateTip() HERE 
        double totalTip = cost * percent / 100;
        // the while loop condition is checked,
        // and if TRUE, runs the code inside.
        // when the code inside is done running, the condition is rechecked,
        // and the loop repeats as long as the condition remains TRUE.
        // when the condition becomes FALSE, it stops

        while (condition) {
            //enter your code here 
            System.out.println("placeholder");
            condition = false;
    
        }

        return result;
    }
    
    
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 3;
        int percent = 30;
        double cost = 75.50;          
        System.out.println(calculateTip(people,percent,cost));
        System.out.println(extraCredit(people, percent, cost));
    }
}
        
