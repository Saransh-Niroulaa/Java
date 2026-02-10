// wap to sid sum of every row of a matrix

import java.util.Scanner;

public class row {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows: ");
        int a = sc.nextInt();
        System.out.println("enter the number of column: ");
        int b = sc.nextInt();
        int[][] matrix = new int[a][b];
        System.out.println("enter the elements: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < a; i++) {
            int sum = 0;
            for (int j = 0; j < b; j++) {
                sum += matrix[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + ": " + sum);
        }
        sc.close();
    
    }
}
