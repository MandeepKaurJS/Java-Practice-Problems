import com.sun.deploy.util.SyncAccess;
import java.text.DecimalFormat;
import java.util.*;
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
        int days=input.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip?");
        int money=input.nextInt();
        System.out.print("What is the three letter curreny Symbol for your travel destination?");
        String symbol=input.next();
        System.out.print("How many "+symbol+" are there in 1 USD?");
        Double currency=input.nextDouble();
        System.out.print("\n\n");
        int traveltime=days*24;
        int mintimes=traveltime*60;
        System.out.println("If you are travelling for "+days+" days that is same as "+traveltime+" hours or "+mintimes+" mins.");
        // Get Budget per days in double : int/
        double budgetUSDDaily = (double)(currency/traveltime);

        System.out.println("If you are going to spend "+ currency + " USD that means per day you can spend up to "+ budgetUSDDaily + " USD.");

        //ComputeText3
        // Get budgetConverted for total and per day
        double budgetConv = (double)currency*money;
        double budgetConvDaily = budgetUSDDaily*money;

        System.out.println("Your total budget in "+ symbol + " is "+ budgetConv +" "+ symbol +" ,which per day is "+ budgetConvDaily +" "+ symbol);
        String timeGreeting = "What is the time difference in hours betweem your home and the destination ? ";
        String timeDiffMidnightGreetingBegin = "That means when it is midnight at home it will be ";
        String timeDiffMidnightGreetingEnd = " in your travel destination";
        String timeDiffNoonGreeting = "And when it is noon at home it will be ";

        //Greeting1
        System.out.print(timeGreeting);
        // Get timeDiff in hrs = int
        int timeDiff = input.nextInt();

        //ComputeText1
        // Get timeDiff at Midnight
        int timeDiffMidnight = (24+timeDiff) % 24;

        System.out.println(timeDiffMidnightGreetingBegin + timeDiffMidnight + timeDiffMidnightGreetingEnd);

        //ComputeText2
        // Get timeDiff at Noon
        int timeDiffNoon = (12+timeDiff) % 24;

        System.out.println(timeDiffNoonGreeting + timeDiffNoon);
        DecimalFormat df = new DecimalFormat("0.00");

        // Sentences
        String countryAreaGreeting = "What is the square area of your destination country in km2? ";
        String countryAreaMilesGreeting = "In miles2 it will be ";

        //Greeting1
        System.out.print(countryAreaGreeting);
        // Get country area in km2
        int countryArea = input.nextInt();

        //ComputeText1
        // Get countryArea in miles2 using double
        double countryAreaMiles = (double)countryArea/1.6;

        System.out.println(countryAreaMilesGreeting + df.format(countryAreaMiles));

    }
}

