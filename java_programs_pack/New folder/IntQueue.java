public class IntQueue {
    static class Queue {
        private final int[] a; private int front=-1,rear=-1;
        Queue(int cap){ a=new int[cap]; }
        boolean isEmpty(){ return front==-1; }
        boolean isFull(){ return rear==a.length-1; }
        void enqueue(int v){ if(isFull()) throw new RuntimeException("overflow"); if(isEmpty()){ front=rear=0; } else rear++; a[rear]=v; }
        int dequeue(){ if(isEmpty()) throw new RuntimeException("underflow"); int v=a[front]; if(front==rear){ front=rear=-1; } else front++; return v; }
        void display(){ if(isEmpty()){ System.out.println("Empty"); return; } for(int i=front;i<=rear;i++) System.out.print(a[i]+" "); System.out.println(); }
    }
    public static void main(String[] args){
        Queue q=new Queue(5);
        q.enqueue(10); q.enqueue(20); q.enqueue(30); q.enqueue(40); q.enqueue(50);
        q.display();
        System.out.println(q.dequeue()); System.out.println(q.dequeue());
        q.display();
    }
}
