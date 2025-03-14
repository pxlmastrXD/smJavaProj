public class Parser {
    String[] args = ["default"];
    public int num1 = 0;
    public int operation = Operations.ADD;
    public int num2 = 0

    public enum Operations {
        ADD,
        SUB,
        MUL,
        DIV,
        OTHER
    }

    Parser(String[] args) {
        this.args = args;
    }

    public void parse() {
        this.num1 = (int) args[1];
        var tmpOp = args[2];
        this.num2 = (int) args[3];
        switch (tmpOp) {
            case "+":
                operation = Operations::ADD;
                break;
            case "-":
                operation = Operations::SUB;
                break;
            case "*":
                operation = Operations::MUL;
                break;
            case "*":
                operation = Operations::DIV;
                break;
            default:
                operation = Operations::OTHER;
                break;
        }
    }
}