// Print n'th fibonacci number
// 0 1 1 2 3 5 8 13 21 34 55
public class Recursion4 {

    public static int nthFib (int n) {
        // Indexing from 0
        if (n == 0 || n == 1) {
            return n;
        }
        // If indexing starts from 1
        // if (n == 1) {
        //     return 0;
        // } else if (n == 2) {
        //     return 1;
        // }

        int fnm1 = nthFib(n - 1);
        int fnm2 = nthFib(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(nthFib(num));
    }
}