package DAY8;

import java.util.*;
public class StackUsing2Queues {
    static class queue{
        Queue<Integer>queue1 = new LinkedList<Integer>();
        Queue<Integer>queue2 = new LinkedList<Integer>();

        int size=0;

        void push(int data){
            queue1.add(data);
            size++;
        }
        int pop(){
            if(size<0){
                System.out.println("Underflow");
            }
            for(int i=0;i<size-2;i++){
    
                queue2.add(queue1.remove());
            }
            int temp = queue1.remove();
            for(int i=0;i<size-2;i++){
                queue1.add(queue2.remove());
            }
            size++;
            return temp;
        }

        int peek(){
            return queue1.rear();
        }

        boolean isEmpty(){
            if(size==0){
                return true;
            }
            return false;
        }
    }
    public static void main(String[] args) {
        
    }
}
