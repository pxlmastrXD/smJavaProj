import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var random = new Random();
        var randnum = random.nextInt(10);
        var input = new Scanner(System.in);
        System.out.print("Enter your number!\n> ");
        var guess = input.nextLine();
        var guessint = Integer.parseInt(guess);
        if (guessint == randnum) {
            System.out.println("Congrats!!!");
        } else {
            System.out.println("BOOOOO, your number was " + randnum);
        }
    }
}