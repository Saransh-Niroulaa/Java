import java.util.Scanner;

public class core {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int a = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int b = sc.nextInt();

        int[][] matrix = new int[a][b];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Core elements of matrix are:");
        for (int i = 1; i < a - 1; i++) {
            for (int j = 1; j < b - 1; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}