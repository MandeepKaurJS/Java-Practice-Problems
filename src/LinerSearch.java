import java.util.Scanner;

public class LinerSearch {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the size of Array: ");
        int count=input.nextInt();
        int array[]=new int[count];
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
            if(array[i]==search) {
                System.out.println("Find the search value at: " + i + " Location");
            }
            if(array[i]!=search){
                System.out.println("Item doesn't exist in list.");
            }

        }
    }
}
