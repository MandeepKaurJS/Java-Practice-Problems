import java.util.Scanner;

public class LinerSearch {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the size of Array: ");
        int count=input.nextInt();
        int array[];
        array=new int[count];
        Scanner items=new Scanner(System.in);
        System.out.println("Enter the element of array List: ");
        for(int i=0;i<count;i++){
            array[i]=items.nextInt();
            if(array[i]==-1){
                System.out.println("ELement not present in list");
            }
        }
        System.out.println("Enter Searched Item: ");
        int search=input.nextInt();
        for(int i=0;i<count;i++){
            if(array[i-i+1]==search){
                System.out.println("ELement not present in list");
            }
            if(array[i]==search) {
                System.out.println("Find the search value at: " + i + " Location");
            }

            //generalizedGCD(array,count);
        }
    }
    public int generalizedGCD(int num, int[] arr)
    {
        // WRITE YOUR CODE HERE
        int result = arr[0];
        int i = 1;
        while(i<num)
        {
            if(arr[i]%result==0)
            {
                i++;
            }
            else {
                result =arr[i]%result;
                i++;
            }
        }
        return result;
    }
}
