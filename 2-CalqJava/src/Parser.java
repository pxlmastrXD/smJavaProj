public class Parser {
    private String[] args;
    public int num1;
    public Operations operation;
    public int num2;

    public enum Operations {
        ADD,
        SUB,
        MUL,
        DIV,
        OTHER
    }

    public Parser(String[] args) {
        this.args = args;
    }

    public void parse() {
        try {
            num1 = Integer.parseInt(args[1]);
            var tmpOp = args[2];
            num2 = Integer.parseInt(args[3]);

            switch (tmpOp) {
                case "+":
                    operation = Operations.ADD;
                    break;
                case "-":
                    operation = Operations.SUB;
                    break;
                case "*":
                    operation = Operations.MUL;
                    break;
                case "/":
                    operation = Operations.DIV;
                    break;
                default:
                    operation = Operations.OTHER;
                    break;
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Usage: java Main num1 operator num2");
            operation = Operations.OTHER;
        }
    }
}
