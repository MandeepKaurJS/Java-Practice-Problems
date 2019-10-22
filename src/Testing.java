import com.sun.org.apache.xpath.internal.SourceTree;

import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.util.stream.Stream;

public class Testing{
    protected static int count=0;
    int z=5;
    public static void main(String[] args){
        String str="my string";
        //protected static int count=0;
        String str2=new String("my string");
        //str.hashCode()==str2.hashCode();\
        boolean str4 =str.matches(str2);
        boolean str3=str.equals(str2);
        System.out.println(str3+""+str4);
        Double d=null;
        System.out.println((d instanceof  Double)? "true":"false");
        Boolean c=false;
        System.out.println((c=true)? "true":"false");
        int a=0;
        System.out.println((a!=0)? "true":"false");
        String e="1";
        YearMonth ym=YearMonth.now();
        YearMonth ym1=YearMonth.of(2016, Month.FEBRUARY);
        System.out.print(ym1.minus(Period.ofMonths(4)).getMonthValue());
        System.out.println(Stream.of("green","yellow","blue").max((s1,s2)->s1.compareTo(s2)).filter(s->s.endsWith("n")).orElse("yellow"));
        int z=5;
        Testing b=new Testing();
        System.out.println(b.z);
        z=z>>1;
        System.out.println(z);
        System.out.println("count="+count1);
        Testing obj=new Testing();
        System.out.println("before");
        Testing oj2=new Testing();

    }
    private static int count1;
    static{
        System.out.println("in blioc 1");
        count1=10;
    }
    private int[] data;
    {
        System.out.println("in block 2");
        data=new int[count1];
        for(int i=0;i<count1;i++){
            data[i]=i;
        }
    }


}

