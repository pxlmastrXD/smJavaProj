class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("""
            No arguments provided. 
            Usage: java -jar fibonacci.jar {number}
            """);
            System.exit(1);
        };
        var argument = args[0];
        var number = Integer.parseInt(argument);
        System.out.println(Fib.fib(number));
    }
}