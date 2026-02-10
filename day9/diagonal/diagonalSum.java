//print the upper diagonal elemets and their sum
import java.util.Scanner;

public class diagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows");
        int a = sc.nextInt();
        System.out.print("enter the number of column");
        int b = sc.nextInt();
        int[][] matrix = new int[a][b];
        System.out.println("enter the elements of first matrix");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (i < j) {
                    System.out.print(matrix[i][j] + " ");
                    sum = sum + matrix[i][j];
                }
            }
        }
        System.out.println("sum of elements above diagonal is " + sum);
        sc.close();
    }
    
}
