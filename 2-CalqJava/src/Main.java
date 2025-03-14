public class Main {
    public static void main(String[] argv) {
        var args = new Parser(argv);
        args.parse();
        var math = new Math(args.num1, args.num2);
        switch (args.operation) {
            case Parser.Operations.ADD:
                System.out.println(math.add());
                break;
            case Parser.Operations.SUB:
                System.out.println(math.sub());
                break;
            case Parser.Operations.MUL:
                System.out.println(math.mul());
                break;
            case Parser.Operations.DIV:
                System.out.println(math.div());
                break;
            case Parser.Operations.OTHER:
                System.out.println("Invalid operation. Try +-*/");
                break;
        }
    }
}