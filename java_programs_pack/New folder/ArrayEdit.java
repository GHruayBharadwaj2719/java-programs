import java.util.*;
public class ArrayEdit {
    static int insertAt(int[] a,int n,int pos1,int val){
        if(n>=a.length) return n;
        for(int i=n;i>=pos1;i--) a[i]=a[i-1];
        a[pos1-1]=val; return n+1;
    }
    static int deleteAt(int[] a,int n,int pos1){
        for(int i=pos1-1;i<n-1;i++) a[i]=a[i+1];
        return n-1;
    }
    static void updateAt(int[] a,int pos1,int val){ a[pos1-1]=val; }
    public static void main(String[] args){
        int[] a=new int[10]; int n=5;
        for(int i=0;i<n;i++) a[i]=5+i; // 5 6 7 8 9
        n=insertAt(a,n,3,100); // 5 6 100 7 8 9
        n=deleteAt(a,n,2); // 5 100 7 8 9
        updateAt(a,4,50); // 5 100 7 50 9
        for(int i=0;i<n;i++) System.out.print(a[i]+" ");
    }
}
