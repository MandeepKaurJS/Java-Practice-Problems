public class VariableDemo {
    public static void main(String[] args){
        int x=20;
        System.out.println("I'm showing you  the x value on console "+x);
        x=25;

        int a=5;
        int b=10;
        int c=b;
        a=a+1;
        b=b-1;
        c=c+a;
        System.out.println(a+""+""+b+""+c);
    }
}
