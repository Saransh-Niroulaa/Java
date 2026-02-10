import java.util.Scanner;
public class diagonal {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [][] matrix = new int [m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("sum of all the diagonal elements is: ");
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
