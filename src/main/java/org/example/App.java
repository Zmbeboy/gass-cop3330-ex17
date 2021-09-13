/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Eric Gass
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a 1 if you are male or a 2 if you are female: ");
        String genderS = scan.nextLine();

        try {
            int gender = Integer.parseInt(genderS);
        }
        catch (Exception e){
            System.out.println("Invalid response");
            System.exit(1);
        }

        System.out.print("How many ounces of alcohol did you have? ");
        String ouncesS = scan.nextLine();

        try {
            int ounces = Integer.parseInt(ouncesS);
        }
        catch (Exception e){
            System.out.println("Invalid response");
            System.exit(1);
        }

        System.out.print("What is your weight, in pounds? ");
        String weightS = scan.nextLine();

        try {
            int weight = Integer.parseInt(weightS);
        }
        catch (Exception e){
            System.out.println("Invalid response");
            System.exit(1);
        }

        System.out.print("How many hours has it been since your last drink? ");
        String hourS = scan.nextLine();

        try {
            int hour = Integer.parseInt(hourS);
        }
        catch (Exception e){
            System.out.println("Invalid response");
            System.exit(1);
        }

        int gender = Integer.parseInt(genderS);
        int ounces = Integer.parseInt(ouncesS);
        int weight = Integer.parseInt(weightS);
        int hour = Integer.parseInt(hourS);

        double alcDis = (gender == 1) ? 0.73 : 0.66;

        double BAC = (ounces * 5.14 / weight * alcDis) -0.015 * hour;

        System.out.println(String.format("Your BAC is %f",BAC));

        String result = (BAC < 0.08) ? "It is legal for you to drive." : "It is not legal for you to drive.";

        System.out.println(result);
    }
}