public class SinglyLinkedList {
    static class Node { int data; Node next; Node(int d){data=d;} }
    Node head;
    void append(int v){ Node t=new Node(v); if(head==null){ head=t; return; } Node p=head; while(p.next!=null) p=p.next; p.next=t; }
    void insertFirst(int v){ Node t=new Node(v); t.next=head; head=t; }
    void deleteFirst(){ if(head!=null) head=head.next; }
    void deleteLast(){ if(head==null) return; if(head.next==null){ head=null; return; } Node p=head,prev=null; while(p.next!=null){ prev=p; p=p.next; } prev.next=null; }
    void insertAt(int pos1,int v){ if(pos1<=1){ insertFirst(v); return; } Node t=new Node(v),p=head,prev=null; int i=1; while(p!=null && i<pos1){ prev=p; p=p.next; i++; } if(prev==null) head=t; else prev.next=t; t.next=p; }
    void deleteAt(int pos1){ if(head==null) return; if(pos1<=1){ head=head.next; return; } Node p=head,prev=null; int i=1; while(p!=null && i<pos1){ prev=p; p=p.next; i++; } if(p!=null && prev!=null) prev.next=p.next; }
    void updateAll(int oldV,int newV){ for(Node p=head;p!=null;p=p.next) if(p.data==oldV) p.data=newV; }
    void reverse(){ Node p=head, prev=null; while(p!=null){ Node nxt=p.next; p.next=prev; prev=p; p=nxt; } head=prev; }
    void display(){ for(Node p=head;p!=null;p=p.next) System.out.print(p.data+"->"); System.out.println("NULL"); }
    public static void main(String[] args){
        SinglyLinkedList list=new SinglyLinkedList();
        list.append(10); list.append(20); list.append(30);
        list.insertFirst(40);
        list.insertAt(3,100);
        list.display();
        list.deleteFirst();
        list.deleteLast();
        list.deleteAt(2);
        list.updateAll(10,99);
        list.display();
        list.reverse();
        list.display();
    }
}
