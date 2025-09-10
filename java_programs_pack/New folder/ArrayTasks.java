import java.util.*;
public class ArrayTasks {
    static void print(int[] a){ for(int x:a) System.out.print(x+" "); System.out.println(); }
    static void printOdds(int[] a){ for(int x:a) if((x & 1) != 0) System.out.print(x+" "); System.out.println(); }
    static void printEvens(int[] a){ for(int x:a) if((x & 1) == 0) System.out.print(x+" "); System.out.println(); }
    static int[] oddEvenSums(int[] a){ int ev=0,od=0; for(int x:a) if((x & 1) == 0) ev+=x; else od+=x; return new int[]{ev,od}; }
    static int max(int[] a){ int m=a[0]; for(int x:a) if(x>m) m=x; return m; }
    static int min(int[] a){ int m=a[0]; for(int x:a) if(x<m) m=x; return m; }
    static void reverse(int[] a){ int i=0,j=a.length-1; while(i<j){ int t=a[i]; a[i]=a[j]; a[j]=t; i++; j--; } }
    static Integer secondLargest(int[] a){ Integer max1=null,max2=null; for(int x:a){ if(max1==null || x>max1){ max2=max1; max1=x; } else if(x!=max1 && (max2==null || x>max2)){ max2=x; } } return max2; }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        print(a);
        printOdds(a);
        printEvens(a);
        int[] s=oddEvenSums(a); System.out.println("Evensum: "+s[0]+", Oddsum: "+s[1]);
        System.out.println("Max: "+max(a)+", Min: "+min(a));
        int[] b=Arrays.copyOf(a,a.length); reverse(b); print(b);
        System.out.println("Second largest: "+secondLargest(a));
        int[] c=Arrays.copyOf(a,a.length); print(c);
    }
}
