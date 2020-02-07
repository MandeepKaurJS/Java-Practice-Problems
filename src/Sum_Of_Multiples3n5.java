import java.util.ArrayList;

public class Sum_Of_Multiples3n5 {
    public static void main(String[] args){
        ArrayList<Integer> Sum3=new ArrayList<>();
        ArrayList<Integer> Sum5=new ArrayList<>();
        int Totalfor3=0;
        int Totalfor5=0;
        for(int i=0;i<1000;i++){
            if(i%3==0){
                Sum3.add(i);
                Totalfor3++;
            }
            else if(i%5==0){
                Sum5.add(i);
                Totalfor5++;
            }
        }
        int TotalofBoth=Totalfor3+Totalfor5;
        System.out.println("Total of 3 is:"+Totalfor3+"\nTotal of 5 is: "+Totalfor5);
        System.out.println("The multiples of 3 or 5 up to 1000 are: " +TotalofBoth);
    }
}
