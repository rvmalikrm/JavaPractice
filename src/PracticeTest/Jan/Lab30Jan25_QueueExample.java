package PracticeTest.Jan;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lab30Jan25_QueueExample {
    public static void main(String[] args) {
            Queue<Integer> queue=new PriorityQueue<>();
            queue.add(4);
            queue.add(6);
            queue.add(9);
            queue.add(2);
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.remove(4));
        System.out.println(queue);

    }
}
