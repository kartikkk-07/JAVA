// Multidimensional Arrays

// 1. Input  : inputElements(matrix);
// 2. Output : printElements(matrix); // And min and max value
// 3. Search : findElement(matrix , key);

import java.util.*;
public class TwoDArrays {

    public static void findElement(int arr[][] , int key){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == key){
                    System.out.print("Element is found at index " + "(" + i + " , " + j + ")");
                }
            }
        }
    }
    
    public static void printElements(int arr[][]){
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
                // Calculate MinValue and MaValues
                if(arr[i][j] > maxSum){
                    maxSum = arr[i][j];
                }
                if (arr[i][j] < minSum) {
                    minSum = arr[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Max: " + maxSum);
        System.out.println("Min: " + minSum);
    }
    
    public static void inputElements(int arr[][]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter elements: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int key = 5;

        inputElements(matrix);

        printElements(matrix); // And min and max value

        // findElement(matrix , key);
    }
}