// wap to print the sum of upper diagonal elements of a matrix
import java.util.Scanner;
public class upper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter the number of column: ");
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }

        
        System.out.println("Sum of upper diagonal elements: " + sum);
        sc.close();
    } 
}
