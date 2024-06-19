package DAY8;

import java.util.*;
public class QueueUsing2Stacks {

    static class Queue{
        Stack<Integer>st1 = new Stack<>();
        Stack<Integer>st2 = new Stack<>();
        int size=0;

        void add(int data){
            st1.push(data);
            size++;
        }

        int remove(){
            if(size<0){
                System.out.println("Underflow");
            }
            for(int i=0;i<size;i++){
                st2.push(st1.pop());
            }
            size--;
            int temp = st2.pop();
            for(int i=0;i<size;i++){
                st1.push(st2.pop());
            }
            return temp;
        }

        int front(){
            for(int i=0;i<size;i++){
                st2.push(st1.pop());
            }
            int temp = st2.peek();
            for(int i=0;i<size;i++){
                st1.push(st2.pop());
            }

            return temp;

        }

        int rear(){
            return st1.peek();
        }
    }
    public static void main(String[] args) {

        Queue queue = new Queue();
        queue.add(8);
        queue.add(9);
        queue.add(10);
        queue.remove();
        queue.front();
        queue.rear();
       
        
    }
}
