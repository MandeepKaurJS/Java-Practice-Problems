import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Java8Tester {

    public static void main(String args[]) {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");

        String name = "Mahesh";
        Integer result = null;

        try {
            nashorn.eval("print('" + name + "')");
            result = (Integer) nashorn.eval("10 + 2");

        } catch(ScriptException e) {
            System.out.println("Error executing script: "+ e.getMessage());
        }
        System.out.println(result.toString());

        Supplier<String> i=()->"Car";
        Consumer<String> c=x->System.out.println(x.toLowerCase());
        Consumer<String> d=x->System.out.println(x.toUpperCase());
        c.andThen(d).accept(i.get());
        String a=null;
        Optional<String> b=Optional.empty();
        try{
            System.out.println(a.length());
            System.out.println(b.orElse(""));
        }catch (Exception e){
            System.out.println(a);
        }
        finally {
            a="String";
            System.out.println(a.length());
            b=Optional.ofNullable("");
            System.out.println(b.get().length());
        }
    }

}