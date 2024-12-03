import java.util.*;
public class Fact {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        long result = factorialNum(num);

        System.out.println(result);
    }

    public static long factorialNum (long ffact) {
        // While multiplication always initialize with 1 not 0....
        long facto = 1;

        for(int i=1; i<=ffact; i++) {
            facto = facto*i;
        }

        return facto;
    }
}