class Parser {
    String[] args = ["default"];
    public int num1 = 0;
    public int operation = Operations.ADD;
    public int num2 = 0

    public enum Operations {
        ADD,
        SUB,
        MUL,
        DIV
    }

    Parser(String[] args) {
        this.args = args;
    }

    public void parse() {
        this.num1 = (int) args[1];
        var tmpOp = args[2];
        this.num2 = (int) args[3];
        // 
    }
}