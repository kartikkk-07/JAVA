// Print 1 to n increasing order

public class Recursion2 {

    public static void printDec (int n) {
        if (n == 1) {
            System.out.print(1);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void printInc (int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;        
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        // printInc(10);

        printDec(10);
    }
}