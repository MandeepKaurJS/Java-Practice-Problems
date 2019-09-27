import com.sun.deploy.util.SyncAccess;

import java.util.Scanner;
public class TripPlanner {
    public static void main(String[] args){
        System.out.println("Welcomr to Vacation Planner!");
        Scanner input=new Scanner(System.in);
        System.out.print("What is your name?");
        String name=input.next();
        System.out.print("Nice to meet you "+name+",where are you travelling to?");
        String country=input.next();
        System.out.print("Great! " +country+ " City Sounds Like a Great Trip.\n +++++++++++\n\n");
        System.out.print("How many days are you going to spend travelling ?");
        String days=input.next();
        System.out.print("How much money, in USD, are you planning to spend on your trip?");
        int money=input.nextInt();
        System.out.print("What is the three letter curreny Symbol for your travel destination?");
        String symbol=input.next();
        System.out.print("How many "+symbol+" are there in 1 USD?");
        Double currency=input.nextDouble();
        System.out.print("\n\n");

    }
}

