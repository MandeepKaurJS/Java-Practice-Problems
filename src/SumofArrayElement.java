import java.util.Scanner;

public class SumofArrayElement {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int count=input.nextInt();
        int array[]=new int[count];
        for(int i=0;i<count;i++){
            array[i]=input.nextInt();
        }
        for(int num:array){
            int sum=0;
            sum=sum+num;
        }
    }
}
