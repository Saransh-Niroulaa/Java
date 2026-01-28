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

        int[][] matrix2 = new int[a][b];
        System.out.println("enter the elements of second matrix");
        for (int k = 0; k < a; k++) {
            for (int l = 0; l < b; l++) {
                matrix2[k][l] = sc.nextInt();
            }
        }
        System.out.println("the sum of all elements of first matrix is:");
        int sum1 = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                sum1 += matrix[i][j];
            }
        }
        System.out.println(sum1);
        System.out.println("the sum of all elements of second matrix is:");
        int sum2 = 0;
        for (int k = 0; k < a; k++) {
            for (int l = 0; l < b; l++) {
                sum2 += matrix2[k][l];
            }
        }
        System.out.println(sum2);
        sc.close();
    }
}