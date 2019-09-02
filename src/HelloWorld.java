public class HelloWorld {
    public static void main(String[] args){
        System.out.println("\"Quotes\"");
        System.out.println("Slashes \\//");
        System.out.println("How '\"confounding' \"\\\" it is!");
        System.out.println("A well-formed Java program has\na main method with { and }\n" +
                "braces.\n");
        System.out.println("A System.out.println statement\n" +
                "has ( and ) and usually a\n" +
                "String that starts and ends\n" +
                "with a \" character.\n" +
                "(But we type \\\" instead!)");
        testing();
        System.out.println();
        testing();
        System.out.println("have any \"errors\" in it");
        System.out.println();

    }
    public static void testing() {
        System.out.println("\"Quotes\"");
        System.out.println("Slashes \\//");
    }
}
