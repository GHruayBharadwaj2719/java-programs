import java.util.Scanner;
public class Primes {
    static boolean isPrime(int x){
        if (x < 2) return false;
        if (x % 2 == 0) return x == 2;
        for (int d = 3; d * d <= x; d += 2) if (x % d == 0) return false;
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=2;i<=n;i++) if(isPrime(i)) System.out.print(i+" ");
        System.out.println();
        for(int i=4;i<=n;i++) if(!isPrime(i)) System.out.print(i+" ");
        System.out.println();
    }
}
