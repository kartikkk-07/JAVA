import java.util.Scanner;
public class BinToDec {
    public static int BinarytoDecimal(int binNum) {
        int lastDigit;
        int decNum = 0;
        int power = 0;
        while (binNum > 0) {
            lastDigit = binNum % 10;
            decNum = decNum + (int)(lastDigit * Math.pow(2, power));
            power++;
            binNum = binNum / 10;
        }
        return decNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter binary number: ");
        int binaryNum = sc.nextInt();

        int decNum = BinarytoDecimal(binaryNum);

        System.out.println("Decimal number of '" +binaryNum+ "' is: " + decNum);
        System.out.println();
    }
}