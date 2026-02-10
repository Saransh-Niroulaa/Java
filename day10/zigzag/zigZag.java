import java.util.*;
public class zigZag {
    public static void main(String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the no. of rows:");
        int n = sc.nextInt();
        System.out.println("Enter the no. of columns:");
        int m = sc.nextInt();
        int [][] arr = new int [n][m];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("the zigzag array is :");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (i == 0 || (i % 2 == 0)){
                    System.out.print(arr[i][j]);

                }else {
                    System.out.print(arr[i][m - j - 1]);
                }    
            }
        }
    }
    
}
