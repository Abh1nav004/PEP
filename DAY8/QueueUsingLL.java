package DAY8;

import java.util.*;
public class QueueUsingLL {

    static class Queue{

        Node head = null;
        Node tail = null;
        int size=0;


        class Node{
            int data;
            Node next=null;

            Node(int data){
                this.data=data;
                this.next=next;
            }
        }

        public void add(int data){
            Node node =new Node(data);
            if(tail==null){
                head=tail=node;
            }
            tail.next=node;
            tail=node;
            size++;
            return;
        }

        public int remove(){
            int value= head.data;
            head=head.next;

            size--;

            return value;
        }

        public int front(){
            return head.data;
        }

        public int rear(){
            return tail.data;
        }
    }
       



    public static void main(String[] args) {

        Queue queue = new Queue();
        queue.add(9);
        queue.add(10);
        queue.add(11);
        queue.remove();
        queue.front();
        queue.rear();
        
    }
}
