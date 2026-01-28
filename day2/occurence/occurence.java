//count the number of occurrences of an element in an array
import java.util.Scanner;
class occurence {
    Scanner sc = new Scanner(System.in);
    int n, arr[], element, count = 0;

    void input(){
        System.out.print("enter the size of the array: ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("the element to find? ");
        element = sc.nextInt();
    }

    void process(){
        for(int i = 0; i < n; i++){
            if(arr[i] == element){
                count++;
            }
        }
        System.out.println("number of occurrences is "+count);
    }

    public static void main(String [] args) {
        occurence obj = new occurence();
        obj.input();
        obj.process();
    }
}