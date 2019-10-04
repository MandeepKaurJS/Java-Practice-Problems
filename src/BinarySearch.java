import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Engter the Size of Array: ");
        int count=input.nextInt();
        int array[]=new int[count];
        System.out.println("Enter Array Items : ");
        Scanner items=new Scanner(System.in);
        for(int i=0;i<count;i++){
            array[i]=items.nextInt();
        }
        int search=input.nextInt();
        for(int i=1;i<count;i++){
            if(count<0){
                System.out.println("Item doesn't Exist");
            }
            array[i]=array[i]+(count-1)/2;
            if(array[i]<search){
                array[i]=array[i]+1;
            }
            if(array[i]>search)
            {
                array[i]=array[i]-1;
            }
            if(array[i]==search){
                System.out.println("Items find"+ i);
            }
        }
    }
}

