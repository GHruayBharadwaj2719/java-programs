import java.util.*;
public class CountPairs {
    static int countPairs(int[] a){
        int[] f = new int[51];
        for(int x:a) if(x>=1 && x<=50) f[x]++;
        int pairs=0; for(int i=1;i<=50;i++) pairs+=f[i]/2;
        return pairs;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        System.out.println(countPairs(a));
    }
}
