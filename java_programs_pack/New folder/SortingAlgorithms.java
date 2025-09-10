import java.util.Arrays;
public class SortingAlgorithms {
    // Bubble sort
    public static void bubble(int[] a){
        int n=a.length; boolean swapped;
        for(int i=0;i<n-1;i++){
            swapped=false;
            for(int j=0;j<n-i-1;j++) if(a[j]>a[j+1]){ int t=a[j]; a[j]=a[j+1]; a[j+1]=t; swapped=true; }
            if(!swapped) break;
        }
    }
    // Selection sort
    public static void selection(int[] a){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++) if(a[j]<a[min]) min=j;
            int t=a[i]; a[i]=a[min]; a[min]=t;
        }
    }
    // Insertion sort
    public static void insertion(int[] a){
        for(int i=1;i<a.length;i++){
            int key=a[i], j=i-1;
            while(j>=0 && a[j]>key){ a[j+1]=a[j]; j--; }
            a[j+1]=key;
        }
    }
    // Merge sort
    public static void mergeSort(int[] a){ mergeSort(a,0,a.length-1); }
    private static void mergeSort(int[] a,int l,int r){
        if(l>=r) return;
        int m=(l+r)/2;
        mergeSort(a,l,m); mergeSort(a,m+1,r);
        int[] tmp=new int[r-l+1];
        int i=l,j=m+1,k=0;
        while(i<=m && j<=r) tmp[k++]= a[i]<=a[j] ? a[i++]:a[j++];
        while(i<=m) tmp[k++]=a[i++];
        while(j<=r) tmp[k++]=a[j++];
        System.arraycopy(tmp,0,a,l,tmp.length);
    }
    // Quick sort
    public static void quickSort(int[] a){ quickSort(a,0,a.length-1); }
    private static void quickSort(int[] a,int l,int r){
        if(l>=r) return;
        int p = partition(a,l,r);
        quickSort(a,l,p-1); quickSort(a,p+1,r);
    }
    private static int partition(int[] a,int l,int r){
        int pivot=a[r], i=l-1;
        for(int j=l;j<r;j++){
            if(a[j]<=pivot){ i++; int t=a[i]; a[i]=a[j]; a[j]=t; }
        }
        int t=a[i+1]; a[i+1]=a[r]; a[r]=t;
        return i+1;
    }
    // Heap sort
    public static void heapSort(int[] a){
        int n=a.length;
        for(int i=n/2-1;i>=0;i--) heapify(a,n,i);
        for(int i=n-1;i>0;i--){ int t=a[0]; a[0]=a[i]; a[i]=t; heapify(a,i,0); }
    }
    private static void heapify(int[] a,int n,int i){
        int largest=i,l=2*i+1,r=2*i+2;
        if(l<n && a[l]>a[largest]) largest=l;
        if(r<n && a[r]>a[largest]) largest=r;
        if(largest!=i){ int t=a[i]; a[i]=a[largest]; a[largest]=t; heapify(a,n,largest); }
    }
    // Counting sort (non-negative)
    public static int[] countingSort(int[] a){
        int max=Integer.MIN_VALUE;
        for(int v:a) if(v>max) max=v;
        int[] cnt=new int[max+1];
        for(int v:a) cnt[v]++;
        int idx=0;
        int[] out=new int[a.length];
        for(int i=0;i<cnt.length;i++) while(cnt[i]-->0) out[idx++]=i;
        return out;
    }
    // Radix sort (non-negative)
    public static int[] radixSort(int[] a){
        int max=Integer.MIN_VALUE; for(int v:a) if(v>max) max=v;
        int exp=1; int[] out=a.clone();
        while(max/exp>0){
            out = countingByDigit(out,exp);
            exp*=10;
        }
        return out;
    }
    private static int[] countingByDigit(int[] a,int exp){
        int[] out=new int[a.length]; int[] cnt=new int[10];
        for(int v:a) cnt[(v/exp)%10]++;
        for(int i=1;i<10;i++) cnt[i]+=cnt[i-1];
        for(int i=a.length-1;i>=0;i--){ int d=(a[i]/exp)%10; out[--cnt[d]] = a[i]; }
        return out;
    }
    // Shell sort (gap sequence: n/2 ...)
    public static void shellSort(int[] a){
        int n=a.length;
        for(int gap=n/2;gap>0;gap/=2){
            for(int i=gap;i<n;i++){
                int temp=a[i]; int j=i;
                while(j>=gap && a[j-gap]>temp){ a[j]=a[j-gap]; j-=gap; }
                a[j]=temp;
            }
        }
    }
    // Demonstration main
    public static void main(String[] args){
        int[] sample = {34,7,23,32,5,62};
        System.out.println("Original: "+Arrays.toString(sample));
        int[] a = sample.clone(); bubble(a); System.out.println("Bubble: "+Arrays.toString(a));
        a = sample.clone(); selection(a); System.out.println("Selection: "+Arrays.toString(a));
        a = sample.clone(); insertion(a); System.out.println("Insertion: "+Arrays.toString(a));
        a = sample.clone(); mergeSort(a); System.out.println("Merge: "+Arrays.toString(a));
        a = sample.clone(); quickSort(a); System.out.println("Quick: "+Arrays.toString(a));
        a = sample.clone(); heapSort(a); System.out.println("Heap: "+Arrays.toString(a));
        a = countingSort(sample); System.out.println("Counting: "+Arrays.toString(a));
        a = radixSort(sample); System.out.println("Radix: "+Arrays.toString(a));
        a = sample.clone(); shellSort(a); System.out.println("Shell: "+Arrays.toString(a));
    }
}
