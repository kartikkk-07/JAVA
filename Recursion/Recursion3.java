// Factorial of n
public class Recursion3 {

    public static int calculateFact (int n) {
        if ( n == 0) {
            return 1;
        }

        int fnm1 = calculateFact(n - 1);
        int fn = n * fnm1;
        return fn;
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(calculateFact(num));
    }
}