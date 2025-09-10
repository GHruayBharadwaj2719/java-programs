import java.util.*;
public class ReverseStringStack {
    public static String reverse(String s){
        ArrayDeque<Character> st=new ArrayDeque<>();
        for(char c:s.toCharArray()) st.push(c);
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()) sb.append(st.pop());
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(reverse(sc.nextLine()));
    }
}
