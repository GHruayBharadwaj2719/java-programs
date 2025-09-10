import java.util.*;
public class MatrixOps {
    static void print(int[][] m){ for(int[] row:m){ for(int x:row) System.out.print(x+" "); System.out.println(); } }
    static void rightDiag(int[][] a){ for(int i=0;i<a.length;i++) System.out.print(a[i][i]+" "); System.out.println(); }
    static void leftDiag(int[][] a){ int n=a.length; for(int i=0;i<n;i++) System.out.print(a[i][n-1-i]+" "); System.out.println(); }
    static int diagDiff(int[][] a){ int n=a.length, d1=0,d2=0; for(int i=0;i<n;i++){ d1+=a[i][i]; d2+=a[i][n-1-i]; } return Math.abs(d1-d2); }
    static int[][] transpose(int[][] m){ int r=m.length,c=m[0].length; int[][] t=new int[c][r]; for(int i=0;i<r;i++) for(int j=0;j<c;j++) t[j][i]=m[i][j]; return t; }
    static int[][] add(int[][] x,int[][] y){ int r=x.length,c=x[0].length; int[][] z=new int[r][c]; for(int i=0;i<r;i++) for(int j=0;j<c;j++) z[i][j]=x[i][j]+y[i][j]; return z; }
    static int[][] mulSquare(int[][] a,int[][] b){ int n=a.length; int[][] w=new int[n][n]; for(int i=0;i<n;i++) for(int j=0;j<n;j++){ int s=0; for(int k=0;k<n;k++) s+=a[i][k]*b[k][j]; w[i][j]=s; } return w; }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] a=new int[n][n];
        for(int i=0;i<n;i++) for(int j=0;j<n;j++) a[i][j]=sc.nextInt();
        rightDiag(a); leftDiag(a); System.out.println(diagDiff(a));
        for(int i=0;i<n;i++){ int rsum=0; for(int j=0;j<n;j++) rsum+=a[i][j]; System.out.println("row "+i+" sum is "+rsum); }
        for(int j=0;j<n;j++){ int csum=0; for(int i=0;i<n;i++) csum+=a[i][j]; System.out.println("column "+j+" sum is "+csum); }
        int r=sc.nextInt(), c=sc.nextInt(); int[][] m=new int[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) m[i][j]=sc.nextInt();
        print(transpose(m));
        int R=sc.nextInt(), C=sc.nextInt(); int[][] x=new int[R][C], y=new int[R][C];
        for(int i=0;i<R;i++) for(int j=0;j<C;j++) x[i][j]=sc.nextInt();
        for(int i=0;i<R;i++) for(int j=0;j<C;j++) y[i][j]=sc.nextInt();
        print(add(x,y));
        int s=sc.nextInt(); int[][] p=new int[s][s], q=new int[s][s];
        for(int i=0;i<s;i++) for(int j=0;j<s;j++) p[i][j]=sc.nextInt();
        for(int i=0;i<s;i++) for(int j=0;j<s;j++) q[i][j]=sc.nextInt();
        print(mulSquare(p,q));
    }
}
