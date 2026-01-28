import java.util.Scanner;

public class transpose {
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
        System.out.println("the original matrix is:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("the transpose of the matrix is:");
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
        sc.close();

    }
}