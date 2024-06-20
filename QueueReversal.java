import java.util.*;
import java.util.LinkedList;
public class QueueReversal {
    public static void reverse(Queue<Integer>q){
        Stack<Integer>st = new Stack<>();
        while(!q.isEmpty()){
            st.push(q.remove());
        }
        while (!st.isEmpty()) {
            q.add(st.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer>q =new LinkedList<>();
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        reverse(q);

        while (!q.isEmpty()) {
            System.out.print(q.remove()+" ");
        }


    }
}