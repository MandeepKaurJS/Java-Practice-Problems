import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the size of Array: ");
        int count=input.nextInt();
        int array[]=new int[count];
        int temp;
        System.out.println("Enter the elements of Array :");
        for(int i=0;i<count;i++){
            array[i]=input.nextInt();
            for(int j=0;j<count-i-1;j++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i] = temp;
                }
            }
        }
    }
}

