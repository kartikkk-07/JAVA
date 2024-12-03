// Print pyramid of alphabets
// Using type casting and do while-loop
import java.util.Scanner;
public class AbcPyramid1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter number between 1 to 26 : ");
        int num = sc.nextInt();

        while (num < 1 || num > 26) {
            System.out.println("Invalid input !!!");
            System.out.print("\nRe-enter number between 1 to 26 : ");
            num = sc.nextInt();
        }
        System.out.println();

        for(int i=1;i<=num;i++){

            char ch = 0;
            for(int k=i; k<=num-1; k++){
                System.out.print(" ");
            }

            int j = 1;
            do {
                int no = j+64;
                ch = (char)no;
                System.out.print(ch+" ");
                j++;
            }
            while (j<=i);
            System.out.println();
        }
        System.out.println();
    }
}