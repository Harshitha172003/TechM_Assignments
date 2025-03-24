package Day4;

public class FibonacciTabulation {
    public static long fib(int n) {
        if (n <= 1) return n;

        long[] dp = new long[n + 1]; 
dp[0] = 0;
dp[1] = 1;

        for (int i = 2; i<= n; i++) {
dp[i] = dp[i - 1] + dp[i - 2]; 
        }
        return dp[n]; 
    }

    public static void main(String[] args) {
        int n = 10; 
System.out.println("Fibonacci of " + n + " is: " + fib(n));
    }
}
