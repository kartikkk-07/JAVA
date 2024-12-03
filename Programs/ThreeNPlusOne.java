// The 3n+1 problem, also known as the Collatz Conjecture
// Without creating method
import java.util.*;
public class ThreeNPlusOne {
    public static void main(String[] kk) {

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter any non zero integer: ");
        long num = sc.nextLong();
        System.out.println("Entered number is: '"+num+"'\n");

        while(num < 1){
            if (num == 0) {
                System.out.println("# You entered zero.\n");
                System.out.print("Re-enter any non zero integer: ");
                num = sc.nextLong();
            }
            else{
                System.out.println("# You entered negative integer.\n");
                System.out.print("Re-enter any non zero integer: ");
                num = sc.nextLong();
            }
            System.out.println("Entered number is: '"+num+"'\n");
        }

        System.out.print("Here is the series: ");

        while (num > 0) {

            if (num % 2 == 0) {
                num = num/2;
            }
            else{
                num = (3 * num) + 1;
            }
            System.out.print(num+"  ");

            if (num == 1){
                break;
            }
        }
        System.out.println();
        System.out.println();
    }
}