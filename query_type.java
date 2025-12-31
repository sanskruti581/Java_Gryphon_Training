package RCOE;
import java.util.*;

public class query_type {

    static final long MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] a = new int[n + 1];  // 1-based indexing

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter element " + i + ": ");
            a[i] = sc.nextInt();
        }

        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();

        long totalSum = 0;

        while (q-- > 0) {

            System.out.print("Enter query type (1 or 2): ");
            int type = sc.nextInt();

            System.out.print("Enter L: ");
            int L = sc.nextInt();

            System.out.print("Enter R: ");
            int R = sc.nextInt();

            if (type == 1) {
                // Type 1: update array
                for (int i = L; i <= R; i++) {
                    a[i] = (int)((long)(i - L + 1) * a[i] % MOD);
                }
            }

            else if (type == 2) {
                // Type 2: range sum
                long sum = 0;
                for (int i = L; i <= R; i++) {
                    sum = (sum + a[i]) % MOD;
                }
                totalSum = (totalSum + sum) % MOD;
            }
        }

        System.out.println("\nFinal answer: " + totalSum);
        sc.close();
    }
}
