import java.util.*;
public class DecToBin {

    public static int DecimalToBinary(int arr[], int number){
        int i = 0;
        while (number > 0) {
            arr[i] = number % 2;
            number = number / 2;
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int arr[] = new int [50];
        // In java arguments are passed by value and not by reference
        // arrays are passed as reference and not by value in Java (exception case)
        System.out.print("\nEnter Decimal Number: ");
        int num = sc.nextInt();

        int i = DecimalToBinary(arr, num);

        System.out.print("Binary of " +num+ " is: ");
        for (int j = i-1 ; j >= 0 ; j--) {
            System.out.print(arr[j]);
        }
        System.out.println("\n");
    }
}