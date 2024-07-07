import java.util.*;

public class Priority_Classroom {
    static class Student implements Comparable<Student> {
        String name;
        int rank;

        Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("Rahul", 2));
        pq.add(new Student("Harsh", 5));
        pq.add(new Student("Aditya", 12));
        pq.add(new Student("Aryan", 7));
        pq.add(new Student("Arush", 15));
        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + "->" + pq.peek().rank);
            pq.remove();
        }
    }
}