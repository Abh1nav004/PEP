import java.util.*;
import java.util.LinkedList;
public class ClassDeque {
    public static void main(String[] args) {
        Deque<Integer>deque = new LinkedList<>();
        deque.addFirst(6);
        deque.addFirst(5);
        deque.addLast(4);
        deque.addLast(9);
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);

        System.out.println("first el = "+deque.getFirst());
        System.out.println("last el = "+deque.getLast());
    }
}