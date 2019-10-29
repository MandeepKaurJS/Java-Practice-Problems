public class Strange {
    public static void main(String[] args){
        first();
        third();
        second();
        third();
        int f=8;
        int s=19;
        f=f+s;
        s=f-s;
        f=f-s;
        System.out.println(f+" "+s);
    }
    public  static void first(){
        System.out.println("Inside first method.");
    }
    public  static void second(){
        System.out.println("Inside second method.");
        first();
    }
    public  static void third(){
        System.out.println("Inside third method.");
        first();
        second();
    }

}
