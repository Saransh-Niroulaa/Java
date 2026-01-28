//count the number of odd and even numbers in an array
import java.util.Scanner;
class counter{
    Scanner sc = new Scanner(System.in);
    int n, arr[], element, location = -1;

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
        int evenC = 0, oddC = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 0){
                evenC++;
            } else {
                oddC++;
            }
        }

        System.out.println("number of even values: " + evenC);
        System.out.println("number of odd values: " + oddC);
    }
    public static void main(String [] args) {
        counter obj = new counter();
        obj.input();
        obj.process();
    }
}