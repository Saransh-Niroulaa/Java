
//wap to input a matrix and to print it and print sum of all its elements and addition of two matrices also sum of all diagonal elements
import java.util.Scanner;

public class sumAdd {
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

        int[][] matrix2 = new int[a][b];
        System.out.println("enter the elements of second matrix");
        for (int k = 0; k < a; k++) {
            for (int l = 0; l < b; l++) {
                matrix2[k][l] = sc.nextInt();
            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("+");
        for (int k = 0; k < a; k++) {
            for (int l = 0; l < b; l++) {
                System.out.print(matrix2[k][l] + " ");
            }
            System.out.println();
        }
        int[][] sum = new int[a][b];
        for (int x = 0; x < a; x++) {
            for (int z = 0; z < b; z++) {
                sum[x][z] = matrix[x][z] + matrix2[x][z];
            }
        }
        System.out.println("the matrix after addition is");
        for (int x = 0; x < a; x++) {
            for (int z = 0; z < b; z++) {
                System.out.print(sum[x][z] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}