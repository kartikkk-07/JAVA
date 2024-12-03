// Spiral matrix
public class ElevenJune {

    public static void optimizedDiagonalSum(int matrix[][]){
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];

            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        System.out.println(sum);
    }

    public static void diagonalSum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                } else if (i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println(sum);
    }

    public static void spiralArray(int matrix[][]) {
        int firstRow = 0;
        int firstCol = 0;
        int lastRow = matrix.length - 1;
        int lastCol = matrix[0].length - 1;

        while(firstRow <= lastRow && firstCol <= lastCol){
            // Top row
            for(int j = firstCol; j <= lastCol; j++ ){
                System.out.print(matrix[firstRow][j] + " ");
            }

            // Right Column
            for(int i = firstRow + 1; i <= lastRow; i++){
                System.out.print(matrix[i][lastCol] + " ");
            }

            // Bottom Row
            for(int j = lastCol - 1; j >= firstCol; j--){
                if (firstRow == lastRow) {
                    break; // For odd rows
                }
                System.out.print(matrix[lastRow][j] + " ");
            }

            // Left Column
            for(int i = lastRow - 1; i >= firstRow + 1 ; i--){
                if (firstCol == lastCol) {
                    break; // For odd columns
                }
                System.out.print(matrix[i][firstCol] + " ");
            }

            firstRow++;
            firstCol++;
            lastRow--;
            lastCol--;
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { {1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16} };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // spiralArray(matrix);

        // diagonalSum(matrix); // Brute Force

        optimizedDiagonalSum(matrix);
    }
}