import java.util.Scanner;

class Each {
    Scanner sc = new Scanner(System.in);
    int n, arr[];
    boolean[] arr1;

    void input() {
        System.out.print("enter the size of the array: ");
        n = sc.nextInt();
        arr = new int[n];
        arr1 = new boolean[n];
        System.out.println("enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void process() {
        for (int i = 0; i < n; i++) {
            int count = 1;
            if (arr1[i]) {
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr1[j] = true;
                }
            }
            System.out.println(arr[i] + " occurs " + count + " times");
        }
    }

    public static void main(String[] args) {
        Each obj = new Each();
        obj.input();
        obj.process();
    }
}