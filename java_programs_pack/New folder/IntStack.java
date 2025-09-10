public class IntStack {
    static class Stack {
        private final int[] a; private int top=-1;
        Stack(int cap){ a=new int[cap]; }
        boolean isEmpty(){ return top==-1; }
        boolean isFull(){ return top==a.length-1; }
        void push(int v){ if(isFull()) throw new RuntimeException("overflow"); a[++top]=v; }
        int pop(){ if(isEmpty()) throw new RuntimeException("underflow"); return a[top--]; }
        int peek(){ if(isEmpty()) throw new RuntimeException("empty"); return a[top]; }
        void display(){ for(int i=top;i>=0;i--) System.out.print(a[i]+" "); System.out.println(); }
    }
    public static void main(String[] args){
        Stack st=new Stack(5);
        st.push(10); st.push(30); System.out.println(st.pop());
        st.push(100); st.push(40); System.out.println(st.pop()); System.out.println(st.pop());
        st.display();
    }
}
