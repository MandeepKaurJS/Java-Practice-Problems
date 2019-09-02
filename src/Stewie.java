public class Stewie {
    public static void main(String[] args){
        //System.out.println("//////////////////////");
        //System.out.println("|| Victory is mine! ||");
        //System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\");
        message1();
        message2();
        System.out.println("Done with main");
    }
    public  static void message1(){
        System.out.println("This is message1.");
    }
    public static void message2(){
        System.out.println("This is message2.");
        message1();
        System.out.println("Done with message2.");
    }
}
