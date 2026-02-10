import java.util.Scanner;

public class multiply {
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
        System.out.print("enter the number of rows");
        int c = sc.nextInt();
        System.out.print("enter the number of column");
        int d = sc.nextInt();
        int[][] matrix2 = new int[c][d];
        System.out.println("enter the elements of second matrix");
        for (int k = 0; k < c; k++) {
            for (int l = 0; l < d; l++) {
                matrix2[k][l] = sc.nextInt();
            }
        }
        int[][] sum = new int[a][d];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < d; j++) {
                for (int l = 0; l < d; l++) {
                    sum[i][j]=sum[i][j]+matrix[i][l]*matrix2[l][j];
                    
                }
            }

        }
        System.out.println("matrix after multiplication");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < d; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
