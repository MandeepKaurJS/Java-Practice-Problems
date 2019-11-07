import java.util.Scanner;

public class HackerRankPrcticeTest {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        /*int i=1;
        while (input.hasNext()){
            System.out.println(i++ +" "+input.nextLine());
        }*/
        Scanner in=new Scanner(System.in);
        int k=input.nextInt();
        int[] array=new int[k];
        int j=0;
        for(j=0;j<k;j++){
            array[j]=in.nextInt();
        }
        for(int i=k-1;i>=0;i--){
            System.out.println(array[i]);
        }
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        sc.close();
        boolean found = true;
        for (int i = 0; i < A.length() / 2; i++) {
            if (A.charAt(i) != A.charAt(A.length() - 1 - i)) {
                found = false;
                break;
            }
        }
        System.out.println(found ? "Yes" : "No");
    }
}
