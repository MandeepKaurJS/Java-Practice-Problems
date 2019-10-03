import java.util.Scanner;

public class SumofArrayElement {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the number count: ");
        int count=input.nextInt();
        int array[]=new int[count];
        Scanner input2=new Scanner(System.in);
        System.out.println("Enter element one by one: ");
        for(int i=0;i<count;i++){

            array[i]=input2.nextInt();
        }
        for(int num:array){
            sum=sum+num;

        }System.out.println("Sum of array Elemnt: "+sum);

    }
}
