//write a program to check if a matrix is sparse matrix or not
import java.util.Scanner;
public class sparse {
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
        }
        int zeroCount = 0;
        int totalElements = matrix.length * matrix[0].length;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    zeroCount++;
                }
            }
        }

        if (zeroCount > totalElements / 2) {
            System.out.println("The matrix is a sparse matrix.");
        } else {
            System.out.println("The matrix is not a sparse matrix.");
        }
        sc.close();
    }
}