public class Main {
    public static void main(String[] argv) {
        var args = new Parser(argv);
        args.parse();
        var math = new Calculator(args.num1, args.num2);
        
        switch (args.operation) {
            case ADD:
                System.out.println(math.add());
                break;
            case SUB:
                System.out.println(math.sub());
                break;
            case MUL:
                System.out.println(math.mul());
                break;
            case DIV:
                System.out.println(math.div());
                break;
            default:
                System.out.println("Invalid operation. Try +-*/");
        }
    }
}
