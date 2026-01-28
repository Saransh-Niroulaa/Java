// input an array and also input an elemen and find the location of that element in the array

import java.util.Scanner;
class loc{
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

        System.out.print("the element to find? ");
        element = sc.nextInt();
    }

    void process(){
        for(int i = 0; i < n; i++){
            if(arr[i] == element){
                location = i;
                break;
            }
        }

        if(location != -1){
            System.out.println("element found at index: " + location);
        } else {
            System.out.println("element not found");
        }
    }

    public static void main(String[] args){
        loc obj = new loc();
        obj.input();
        obj.process();
    }
}