package com.example;
import java.util.Scanner;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        double totalTip = (cost * percent) / 100;
        double totalBill = (cost + totalTip) * 100.0 / 100.0;
        //I learned how to read from https://stackoverflow.com/questions/8825209/rounding-decimal-points
        double costBperson = Math.round(((cost / people) * 100.0)) / 100.0;
        double tipPerson = Math.round(((totalTip / people) * 100.0)) / 100.0;
        double costAperson = Math.round(((totalBill / people) * 100.0)) / 100.0;
        double roundTotaltip = (Math.round((totalTip * 100))) / 100.0;
        double roundTotalbill = (Math.round((totalBill * 100))) / 100.0;
        String result = "-------------------------------\n" +
                       "Total bill before tip: $" + cost + "\n" +
                       "Total percentage: " + percent + "%\n" +
                       "Total tip: $" + roundTotaltip + "\n" +
                       "Total Bill with tip: $" + roundTotalbill + "\n" +
                       "Per person cost before tip: $" + costBperson + "\n" +
                       "Tip per person: $" + tipPerson + "\n" +
                       "Total cost per person: $" + costAperson + "\n" +
                       "-------------------------------\n";

        return result;
    }

    public static String extraCredit(int people, int percent, double cost) {
        //String result = "Extra credit not implemented";
        boolean condition = true;
    
        //  COPY AND PASTE YOUR PROGRAM FROM calculateTip() HERE 
        double totalTip = (cost * percent) / 100;
        double totalBill = (cost + totalTip) * 100.0 / 100.0;
        //I learned how to read from https://stackoverflow.com/questions/8825209/rounding-decimal-points
        double costBperson = Math.round(((cost / people) * 100.0)) / 100.0;
        double tipPerson = Math.round(((totalTip / people) * 100.0)) / 100.0;
        double costAperon = Math.round(((totalBill / people) * 100.0)) / 100.0;
        double roundedTotaltip = (Math.round((totalTip * 100))) / 100.0;
        double roundedTotalbill = (Math.round((totalBill * 100))) / 100.0;
        String result = "-------------------------------\n" +
                       "Total bill before tip: $" + cost + "\n" +
                       "Total percentage: " + percent + "%\n" +
                       "Total tip: $" + roundedTotaltip + "\n" +
                       "Total Bill with tip: $" + roundedTotalbill + "\n" +
                       "Per person cost before tip: $" + costBperson + "\n" +
                       "Tip per person: $" + tipPerson + "\n" +
                       "Total cost per person: $" + costAperon + "\n" +
                       "-------------------------------\n" + 
                       "Items ordered:\n";


        Scanner scan = new Scanner(System.in);
        String x = "";
        
        // the while loop condition is checked,
        // and if TRUE, runs the code inside.
        // when the code inside is done running, the condition is rechecked,
        // and the loop repeats as long as the condition remains TRUE.
        // when the condition becomes FALSE, it stops

        while (!x.equals( "-1")) {
                //enter your code here
            System.out.print("Enter an item name ot type '-1' to finish: ");
            x = scan.nextLine();
            if (!x.equals( "-1")) {
                result += x + "\n";
            }
        }
        result += "-------------------------------\n";
scan.close();
        return result;
    }
    
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 6;
        int percent = 25;
        double cost = 52.27;   
        //System.out.println(calculateTip(people,percent,cost));
        System.out.println(extraCredit(people, percent, cost));
    }
}
        
