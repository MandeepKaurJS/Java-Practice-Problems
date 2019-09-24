import java.util.Scanner;
public class MathematicalOprations {
    public static void main(String[] args){
        int x=20;
        int y=4;
        System.out.println("x+y = " +(x+y));
        System.out.println("x+y = " +(x-y));
        System.out.println("x+y = " +(x*y));
        System.out.println("x+y = " +(x/y));
        x++;
        System.out.println(10%3);
        System.out.println(3*2.0);
        String s1 = "Get"; // First string
        String s2 = "SET";// Second String
        String s3 =  "Go"; // Third String
        String s4 = "NOW"; // Fourth String;
        String stringAll = s1+" "+s2+" "+s3+" "+s4; // Empty string to hold the 4 concatenated strings

        // Write the logic to concatenate four string variables and print.
        System.out.println(stringAll);
        double z=10.0;
        System.out.println((int)(10.0/3.0));
        int num1 = 10; // get first Integer
        double num2 = 16.72; // get second double
        //write the logic to caste int to double and doube to int
        System.out.println((double)10);
        System.out.println((int)16.72);
        Scanner hello=new Scanner(System.in);
        String text=hello.next();
        String java=hello.next();
        System.out.println(text+" "+java);
    }
}
