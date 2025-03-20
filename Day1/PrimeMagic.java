package Day1;

public class PrimeMagic {
    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }


    public static int countPrimeMagicNumbers(int N) {
        int sum = 0, count = 0;
        
        for (int i = 2; sum + i <= N; i++) {
            if (isPrime(i)) {
                sum += i;  
                if (sum >= 3 && isPrime(sum)) count++; 
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        int N = 50;
        System.out.println(+ countPrimeMagicNumbers(N));
    }
}
