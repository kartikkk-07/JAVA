import java.util.*;
public class Palindrome {
    public static void main(String kk[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter a number to check whether it is palindrome or not: ");
		int num = sc.nextInt();
		int orgnum = num;
		int sum = 0;
		
		System.out.println("\nEntered number is: "+orgnum);
		
		while (num > 0){
			int digit = num % 10;
			sum = (sum * 10) + digit;
			num = num / 10;
		}
		
		if(orgnum == sum){
			System.out.println(orgnum+" is a Palindrome number\n");
		}
		else{
			System.out.println(orgnum+" is not a Palindrome number\n");
		}
	}
}