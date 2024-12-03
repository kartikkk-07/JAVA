import java.util.Scanner;
class ArmstrongNumber {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter any number: ");
        int no = sc.nextInt();
        int digits = countDigit(no);
        System.out.println("Total Digits: " + digits);
        ArmstrongChecker(no);
    }
    public static int countDigit(int no) {
        int counter = 0;
        while (no > 0) {
            no = no / 10;
            counter++;
        }
        return counter;
    }
    public static void ArmstrongChecker(int no) {
        int num = no;
        int nod = countDigit(no); //nod=number of digits
        int result = 0;
        while (no > 0) {
            int digit = no % 10;
            int res = 1;
            for (int i = 0; i < nod; i++) {
                res = res * digit;
            }
            result = result + res;
            no = no / 10;
        }
        if (num == result)
            System.out.println(num + " is an armstrong number\n");
        else
            System.out.println(num + " is not an armstrong number\n");
    }
}