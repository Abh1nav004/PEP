import java.util.*;
public class DoublyLL {

    class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val=val;
        }
        public Node(int val,Node next,Node prev){
            this.val=val;
            this.next=next;
            this.prev=prev;
        }
    }

    Node head;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev=null;
        if(head!=null){
            head.prev = node;     
        }
        head=node;

    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {

        DoublyLL Dl = new DoublyLL();
        Dl.insertFirst(8);
        Dl.insertFirst(9);
        Dl.insertFirst(6);
        Dl.insertFirst(4);

        Dl.display();
        
    }
}