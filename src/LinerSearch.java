import java.util.Scanner;

public class LinerSearch {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int count=input.nextInt();
        int array[]=new int[count];
        Scanner items=new Scanner(System.in);
        for(int i=0;i<count;i++){
            array[i]=items.nextInt();
        }
        System.out.println("Enter Searched Item: ");
        int search=input.nextInt();
        for(int i=0;i<count;i++){
            if(array[i]==search){
                System.out.println("Find the search value at"+array[i]+"Location");
            }else if(array.length>search){
                System.out.println("Value doesn't exist");
            }
            else{
                System.out.println("Item not found");
            }
        }
    }
}
