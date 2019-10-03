import java.util.Scanner;

public class SortingStrings {
    public static void main(String[] args){
        int count;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number you want to enter");
        count=input.nextInt();
        String str[]=new String[count];
        Scanner input2=new Scanner(System.in);
        //String Str2=input2.next();
        for(int i=0;i<count;i++){
            str[i]=input2.nextLine();
            //System.out.println(str[i]);
        }
        //Sorting the entered string
        String temp;
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (str[i].compareTo(str[j]) > 0) {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        //Dispplay strings
        for(int i=0;i<count;i++){
            System.out.println(str[i]);
        }
    }
}


