import java.util.Scanner;
public class NumOrder {
    public static void checkNumberOrder (int n1 , int n2 , int n3) {

        System.out.println("num1 = " + n1 + ", num2 = " + n2 + ", num3 = " +n3);

        if (n1 > n2 && n2 > n3) {
            System.out.println("Descending Order !!!");
        } else if (n1 < n2 && n2 < n3) {
            System.out.println("Ascending Order !!!");
        } else {
            System.out.println("Neither ascending or descending.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter three numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        checkNumberOrder (num1 , num2 , num3);
    }
}