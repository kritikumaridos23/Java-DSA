package Recursion;
public class Print1ToN {
    public static void printNumb(int n) {
        if (n == 0) {
            return;
        }
        printNumb(n - 1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Numbers from 1 to N:");
        printNumb(n);
    }
}
