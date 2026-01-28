// wap in java to input an array traverse all it's elements
import java.util.Scanner;
class traverse {
    Scanner sc = new Scanner(System.in);
    int n, arr[];

    void input(){
        System.out.print("enter the size of the array: ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("enter the elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
    }
    void process(){
        System.out.println("array elements are: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String [] args) {
        traverse obj = new traverse();
        obj.input();
        obj.process();
    }
}