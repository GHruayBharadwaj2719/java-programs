import java.util.*;
public class SearchSort {
    static int linear(int[] a,int key){ for(int i=0;i<a.length;i++) if(a[i]==key) return i; return -1; }
    static int binary(int[] a,int key){
        int l=0,r=a.length-1;
        while(l<=r){
            int m=(l+r)>>>1;
            if(a[m]==key) return m;
            if(a[m]<key) l=m+1; else r=m-1;
        }
        return -1;
    }
    static void bubble(int[] a){
        int n=a.length; boolean swapped;
        for(int i=0;i<n-1;i++){
            swapped=false;
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){ int t=a[j]; a[j]=a[j+1]; a[j+1]=t; swapped=true; }
            }
            if(!swapped) break;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int key=sc.nextInt();
        System.out.println(linear(a,key));
        Arrays.sort(a);
        System.out.println(binary(a,key));
        bubble(a);
        System.out.println(Arrays.toString(a));
    }
}
