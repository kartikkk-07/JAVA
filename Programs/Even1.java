
import java.util.*;
public class Even1 {
    public static void main(String args[]){
        Scanner no = new Scanner(System.in);
        System.out.print("\nEnter a number : ");
        int num = no.nextInt();

        /*if (num==0) {
            System.out.println(num+" is neither even nor odd.\n");
        }

        else*/ if (num % 2 == 0) {
            System.out.println(num+" is an even number.\n");            
        }

        else{
            System.out.println(num+" is an odd number.\n");
        }
    }
}
