public class SquareRoot {
    public static void main(String[] args){

    }
    public static double squareroot(int number){
        double temp;
        double Sqrt=number/2;
        do{
            temp=Sqrt;
            Sqrt=(temp+(number/temp)/2);
        }while ((temp-Sqrt)!=0);
        return Sqrt;
    }
}
