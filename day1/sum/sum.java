// operation (traversing an array)
import java.util.*;
class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] s = new int[size];
        System.out.println("Enter ");
        for (int i = 0; i < size; i++) {
            s[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += s[i];
        }
        System.out.println("the sum is: " + sum);
    }
}
