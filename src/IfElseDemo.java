import java.util.Scanner;
public class IfElseDemo {
    public static void main(String[] args ){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your gards.");
       int grade=input.nextInt();
       if(grade>80){
           System.out.println("welcome to our campus.");
       }
       else{
           System.out.println("PLease try again.");
       }

    }
}
