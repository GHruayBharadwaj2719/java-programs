import java.util.Scanner;
public class PerfectNumber {
    static boolean isPerfect(int n) {
        if (n <= 1) return false;
        int sum = 1;
        for (int d = 2; d * d <= n; d++) {
            if (n % d == 0) {
                sum += d;
                if (d != n / d) sum += n / d;
            }
        }
        return sum == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num + (isPerfect(num) ? " is a Perfect Number" : " is NOT a Perfect Number"));
    }
}
