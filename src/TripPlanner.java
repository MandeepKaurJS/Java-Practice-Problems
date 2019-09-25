import java.util.Scanner;
public class TripPlanner {
    public static void main(String[] args){
        System.out.println("Welcomr to Vacation Planner!");
        Scanner input=new Scanner(System.in);
        System.out.print("What is your name?");
        String name=input.next();
        System.out.print("Nice to meet you "+name+",where are you travelling to?");
        String country=input.next();
        System.out.print("");
    }
}

