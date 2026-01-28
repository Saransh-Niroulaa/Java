import java.util.*;

class insertion {
    public static void main(String[] args) {
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

        System.out.print("enter element: ");
        int x = sc.nextInt();

        switch(ch) {
        case 1:
            for (int i = n - 1; i >= 0; i--)
                arr[i + 1] = arr[i];
            arr[0] = x;
            break;

        case 2:
            arr[n] = x;
            break;

        case 3:
            System.out.print("enter position: ");
            int pos = sc.nextInt();

            for (int i = n - 1; i >= pos; i--)
                arr[i + 1] = arr[i];
            arr[pos] = x;
            break;

        default:
            System.out.println("invalid choice");
            return;
        }
        

        n++;

        System.out.println("array after insertion:");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        
    }
}
