// TC : O(n + m) in this code. Number of rows and columns is same
// Depends on rows and columns TC depends. More rows than column O(n), More columns than rows O(m)
// Search in sorted matrix

public class TwoDArrays2 {
    
    public static boolean searchInSorted(int matrix[][] , int x) {
        int row = 0, col = matrix[0].length - 1;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == x){
                System.out.println("Key found at index (" + row + "," + col + ")");
                return true;
            } else if (x > matrix[row][col]) {
                row++;
            } else{
                col--;
            }
        }
        System.out.println("Key not found!!!");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = { {5,10,15,20},
                        {25,30,35,40},
                        {45,50,55,60},
                        {65,70,75,80} };
        int key = 5;

        searchInSorted(matrix , key);
    }
}