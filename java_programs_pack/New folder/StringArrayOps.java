import java.util.*;
public class StringArrayOps {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); sc.nextLine();
        String[] s=new String[n];
        for(int i=0;i<n;i++) s[i]=sc.nextLine().trim();
        String key=sc.nextLine().trim();
        int idx=-1; for(int i=0;i<n;i++) if(s[i].equals(key)){ idx=i; break; }
        System.out.println(idx>=0 ? "Key string "+key+" is found in row "+idx : "Key string "+key+" not found");
        Arrays.sort(s);
        for(String t:s) System.out.println(t);
    }
}
