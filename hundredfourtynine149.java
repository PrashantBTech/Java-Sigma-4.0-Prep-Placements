//           Heaps
// 1>  Priority Queues

import java.util.PriorityQueue;

public class hundredfourtynine149 {


    static class Student implements Comparable<Student>{ // to store the Objects of student class in priority basic
        String name;
        int rank;
        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }

       @Override public int compareTo(Student s2){
        return this.rank - s2.rank; // on which basics we want the priority
       }
    }


    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(/*Comparator.reverseOrder() */);// to reverse the order

        pq.add(3); // O(logn)
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek()); // O(1)
            pq.remove(); // O(logn)
        }

        System.out.println("--------------------------------------");

        PriorityQueue<Student> prQueue = new PriorityQueue<>(/*Comparator.reverseOrder() */);

        prQueue.add(new Student("A", 4)); // O(logn)
        prQueue.add(new Student("B", 5));
        prQueue.add(new Student("C", 2));
        prQueue.add(new Student("D", 12));

         while (!prQueue.isEmpty()) {
            System.out.println(prQueue.peek().name + "->"+prQueue.peek().rank); // O(1)
            prQueue.remove(); // O(logn)
        }

    }
}
