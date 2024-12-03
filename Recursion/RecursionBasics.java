public class RecursionBasics {

    public static int printFactorial (int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = printFactorial(n - 1);
        int fn = fnm1;
        return fn;
    }

    public static void printIncresing (int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printIncresing(n - 1);
        System.out.print(n + " ");
    }

    static void printTable (int n , int i) {
        if (i == 10){
            System.out.print((n * i));
            return;
        }
        System.out.print((n * i) + " ");
        printTable(n , i + 1);
    }

    public static void printDec (int n) {
        if(n == 1){
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void main(String[] args) {
        int num = 10;
        printDec(num); // Decreasing order

        // int i = 1;
        // printTable(num , i); // Table

        // printIncresing(num);

        // System.out.println(printFactorial(num));
    }
}