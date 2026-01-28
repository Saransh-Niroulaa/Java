// input a number and find number of digits in that number and the sum of those digit and also print if the middle digit is even or odd
import java.util.*;
class number {
    Scanner sc = new Scanner(System.in);
    int num, sum = 0, count = 0;

    void input(){
        System.out.print("Enter a number: ");
        num = sc.nextInt();
    }

    void process(){
        int n = Math.abs(num);
        sum = 0;
        count = 0;

        if (n == 0) {
            count = 1;
            sum = 0;
        } else {
            while(n > 0){
                int digit = n % 10;
                sum += digit;
                count++;
                n = n / 10;
            }
        }

        System.out.println("number of digits: " + count);
        System.out.println("sum: " + sum);

        if(count % 2 == 1){
            String n1 = Integer.toString(num);
            int midIndex = count / 2;
            int midDigit = n1.charAt(midIndex) - '0';
            if (midDigit % 2 == 0){
                System.out.println("middle digit is even");
            } else {
                System.out.println("middle digit is odd");
            }
        } else {
            System.out.println("no middle digit");
        }
    }

    public static void main(String[] args){
        number obj = new number();
        obj.input();
        obj.process();
    }
}