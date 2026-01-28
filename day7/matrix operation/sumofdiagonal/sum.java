import java.util.Scanner;

public class sum {
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
        System.out.println("matrix is");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int diagonal1 = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (i == j) {
                    diagonal1 = diagonal1 + matrix[i][j];
                }
            }
        }
        System.out.println("sum of diagonal elemnts is for first: " + diagonal1);
        sc.close();
    }
    
}