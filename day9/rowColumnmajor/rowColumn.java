// wap to print matrix elements A in row maojr order and B IN column major order

import java.util.Scanner;

public class rowColumn {
    public static void main (String []args){
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
        System.out.println("matrix in row major order");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            
        }
        System.out.println("matrix in column major order");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            
        }
        sc.close();
    }
}
