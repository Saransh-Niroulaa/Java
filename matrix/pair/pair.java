// given n array elements check if their exists a pair in the array whose sum is equal to a given number
// such that arr[i]+arr[j] == given sum and i!=j

import java.util.Scanner;

public class pair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int arr[] = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = sc.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println("pair found: " + arr[i] + " and " + arr[j]);
                }
            }
        }
    }
}