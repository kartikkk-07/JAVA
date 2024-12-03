// Print pyramid of alphabets
// Without type-casting
import java.util.Scanner;
public class AbcPyramid {
    static void printPattern(int num){
        for(int i=1;i<=num;i++){
            for(int k=num; k>=i; k--){
                System.out.print(" ");
            }
            char ch = 'A';
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
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
        printPattern(num);
        System.out.println();
    }
}