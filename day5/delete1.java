import java.util.*;
public class delete1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter array size: ");
        int n = sc.nextInt();

      
        int[] arr = new int[n + 1];

        System.out.println("enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("1. beginning");
        System.out.println("2. end");
        System.out.println("3. middle");
        System.out.print("enter choice: ");
        int ch = sc.nextInt();
        

        switch(ch) {
        case 1:
            for (int i = 0; i < n - 1; i++)
                arr[i] = arr[i + 1];
            break;

        case 2:
            arr [n - 1] = 0;
            break;
        
        case 3:
            System.out.print("enter position: ");
            int pos = sc.nextInt();
            for (int i = pos; i < n - 1; i++)
                arr[i] = arr[i + 1];
            break;

        default:
            System.out.println("invalid choice");
        }
        

        n--;
        System.out.println("array after deletion:");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        sc.close();
    }
    
}
