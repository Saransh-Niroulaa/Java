import java.util.*;

public class elemDe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("enter elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print("enter element to delete: ");
        int x = sc.nextInt();

        int k = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != x) {
                arr[k] = arr[i];
                k++;
            }
        }

        if (k == n) {
            System.out.println("element not found!");
        } else {
            System.out.println("array after deleting all occurrences:");
            for (int i = 0; i < k; i++)
                System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
