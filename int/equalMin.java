// given an intiger a if size n in one second you can increase the value of one element by one find the min time in seconds to kmake al the element of the array by one find the min time to make all the aray elemnets equal 
import java.util.Scanner;
public class equalMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(Equal(a, n));
        sc.close();
    }

    public static int Equal(int[] a, int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        int time = 0;
        for (int i = 0; i < n; i++) {
            time += (max - a[i]);
        }
        return time;
    }
}


//observation : to make all the element equal we need to make all the element equal to the maximum element in the array because if we try to make all the element equal to any other element less than maximum then we will have to decrease some elements which is not allowed as per the problem statement
//for every element calc how much ot needs to be increased to make it equal to maximum element and sum all those values to get the total time required
// sum all those diffreneces to get the total time required