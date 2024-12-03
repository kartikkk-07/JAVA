import java.util.Scanner;
public class LinSearch {
    static Scanner sc;
    public static void main(String[] args) {

        sc = new Scanner(System.in);

        System.out.println("\nEnter five elements of array.");
        int T[] = new int[5];
        for(int i=0; i<5; i++){
            T[i]=sc.nextInt();
        }

        System.out.print("\nEnter key element to check: ");
        int element = sc.nextInt();

        int flag=0;

        for(int i=0; i<5; i++){
            if (T[i]==element) {
                System.out.println("\nKey element "+element+" is present at index "+i+"\n");
                flag = 1;
                break;
            }
        }

        if (flag == 0) {
          System.out.println("\nKey element "+element+" is not present...\n");  
        } 
    }
}