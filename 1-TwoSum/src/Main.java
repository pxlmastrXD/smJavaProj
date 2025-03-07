/*
Project 1: TWO SUM
Objective: Complete the two sum problem using Java.

Made by @pxlmastrXD

*/

// Main function: Tests the TwoSum classfile
class Main {
    public static void main(String[] args) {
        var res1 = TwoSum::checker([1,2,5], 7, [1,2]);
        var res2 = TwoSum::checker([2,5,8], 7, [0,1]);
        if ( res1 == res2 ) {
            System.out.println("Tests passed!");
        } else {
            System.out.println("Tests failed.");
        }
    }
}