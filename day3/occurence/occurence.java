import java.util.Scanner;
class occurence {
    Scanner sc = new Scanner(System.in);
    int n, arr[], element, neg = 0,pos=0,zero=0;

    void input(){
        System.out.print("enter the size of the array: ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
    }

    void process(){
        for(int i = 0; i < n; i++){
            if(arr[i] <0){
                neg++;
            }
            else if(arr[i] >0){
                pos++;
            }
            else{
                zero++;
            }
        }
        System.out.println("number of positive value: " + pos);
        System.out.println("number of negative value: " + neg);
        System.out.println("number of zero value: " + zero);
    }

    public static void main(String [] args) {
        occurence obj = new occurence();
        obj.input();
        obj.process();
    }
}