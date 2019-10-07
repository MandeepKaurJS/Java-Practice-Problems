import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the size of Array: ");
        int count=input.nextInt();
        int array[]=new int[count];
        System.out.println("Enter the elements of Array :");
        for(int i=0;i<count;i++){
            array[i]=input.nextInt();
        }
    }
}

