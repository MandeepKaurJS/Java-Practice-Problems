import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num=input.nextInt();
        System.out.println("SqureRoot of this number is :"+squareroot(num));
    }
    public static double squareroot(int number){
        double temp;
        double Sqrt=number/2;
        do{
            temp=Sqrt;
            Sqrt=(temp+(number/temp))/2;
        }while ((temp-Sqrt)!=0);
        return Sqrt;
    }
}
