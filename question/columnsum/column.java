// wap to sid sum of every column of a matrix


import java.util.Scanner;

public class column {
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
        for (int i = 0; i < b; i++) {
            int sum = 0;
            for (int j = 0; j < a; j++) {
                sum += matrix[j][i];
            }
            System.out.println("Sum of column " + (i + 1) + ": " + sum);
        }
        sc.close();
    } 
}
