import java.util.Scanner;
import java.util.*;

public class Cost {
    public static void main(String[] args){
        //Scanner input=new Scanner(System.in);
        //System.out.println("Enter any Number: ");
        //int num=input.nextInt();
        for(int num=0;num<100;num++) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (num % 3 == 0) {
                System.out.println("Fizz");
            } else if (num % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println("Not Fizz nor Buzz: "+num);
            }
        }
        List<Integer> a= new ArrayList<Integer>(3);
        a.add(1);
        a.add(3);
        a.add(4);

        List<Integer> b= new ArrayList<Integer>(3);
        b.add(1);
        b.add(2);
        b.add(3);
        int j=0;
        List<Integer> result=new ArrayList<Integer>();

        for(int i=0;i<a.size()||j<b.size();i++,j++){
            //System.out.println("hi"+a.get(i));
            //System.out.println("ji"+b.get(j));
            int count=0;
            if(a.get(i)<b.get(j)){
                //System.out.println(count++);
                count=count++;
                result.add(count);
            }else if(a.get(i)>b.get(j)){
                //System.out.println(count++);
                count=count+1;
                result.add(count);
            }else if(a.get(i)==b.get(i)){
                //System.out.println(count);
                result.add(count);
            }

        }
        for(int i=0;i<result.size();i++){
            System.out.print(result.get(i));
        }
    }
}
