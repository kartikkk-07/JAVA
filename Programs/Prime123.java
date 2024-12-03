import java.util.*;
public class Prime123 {
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        System.out.print("\nEnter a number: ");
        int num=test.nextInt();
        int flag=0;

        if (num==0) {
            System.out.println("0 is neither prime nor non prime number.\n");
        }

        else{
            for(int i=2; i < num/2; i++){
                if(num%i==0){
                    flag=1;
                    System.out.println(+num+" is not a Prime Number.\n");
                    break;
                }
            }
    
            if(flag==0){
                System.out.println(+num+" is a Prime Number.\n");
            }
        }
    }
}