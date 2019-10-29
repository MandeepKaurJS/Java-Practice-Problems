import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("main1");
        //meth(args);
        String first="first";
        Test1 test=new Test1();
        //test.myMethodS
        //System.out.println(String.format("local time: %tH:%tM:%tS"+ LocalTime.now(),LocalTime.now(),LocalTime.now()));
        List<String> list=new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add(0,"3");
        list.add(1,"4");
        list.forEach(System.out::println);
        Integer before=new Integer(25);
        Integer after=++before==26?5:new Integer(10);
        System.out.println(after.intValue()-before.intValue());


    }
   /* public void meth(String[] arg){
        System.out.println(arg);
        System.out.println(arg[1]);
    }*/

}
