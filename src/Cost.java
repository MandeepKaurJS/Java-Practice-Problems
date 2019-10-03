import java.util.Scanner;

public class Cost {
    public static void main(String[] args){
        //Scanner input=new Scanner(System.in);
        //System.out.println("Enter any Number: ");
        //int num=input.nextInt();
        for(int num=0;num<100;num++) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (num % 3 == 0) {
                System.out.println("Fizz");
            } else if (num % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println("Not Fizz nor Buzz: "+num);
            }
        }
    }
}
