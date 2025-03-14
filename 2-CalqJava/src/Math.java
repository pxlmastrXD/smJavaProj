public class Math {
    var num1 = Integer(0);
    var num2 = Integer(0);

    Math(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    int add() {
        return num1 + num2;
    }
    int sub() {
        return num1 - num2;
    }
    int mul() {
        return num1 * num2;
    }
    int div() {
        return num1 / num2;
    }
}