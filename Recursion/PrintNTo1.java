package Recursion;
public class PrintNTo1 {
    public static void printNumb(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNumb(n - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Numbers from N to 1:");
        printNumb(n);
    }
}