// Binary String Problem
public class Recursion7 {

    public static void printBinStr1 (int n , int lastPlace , String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        printBinStr1(n - 1, 1, str+"1");
        
        if (lastPlace == 1) {
            printBinStr1(n - 1, 0, str+"0");
        }
    }

    public static void printBinStr (int n , int lastPlace , String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        printBinStr(n - 1, 0, str+"0");

        if (lastPlace == 0) {
            printBinStr(n - 1, 1, str+"1");
        }
    }

    public static void main(String[] args) {
        // printBinStr( 3 , 0 , ""); // Without consecutive one's

        printBinStr1(3, 1, ""); // Without consecutive zero's
    }
}