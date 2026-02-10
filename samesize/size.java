// givean an arraay of integers, return an array of the same size where the ith elemenrt will be equal to the product of all element divided by the ith element of the array 
import java.util.Scanner;
public class size {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int sum = 1;
        for (int i = 0; i < n; i++){
            sum = sum*a[i];
        }
        int[] result = new int[n];
        for (int i = 0; i < n; i++){
            result[i] = sum / a[i];
        }
        for (int i = 0; i < n; i++){
            System.out.print(result[i] + " ");
        }
        sc.close();
    }
    
}
