
import java.util.Scanner;

public class P6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n:");
        long n = scanner.nextInt();

        long fold1 = 1;
        long fold2 = 1;

        long fnew = calculateNthFibonacci(n, fold1, fold2);

        System.out.println("The " + n + "th Fibonacci number is: " + fnew);
    }

    private static long calculateNthFibonacci(long n, long fold1, long fold2) {
        if (n == 1 || n == 2) {
            return 1;
        }

        long fnew = 0;
        for (long i = 3; i <= n; i++) {
            fnew = fold1 + fold2;
            fold2 = fold1;
            fold1 = fnew;
        }

        return fnew;
    }
}
