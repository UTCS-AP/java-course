import structure.Queue;
import structure.QueueEmptyException;
import structure.QueueFullException;

public class Main {
    public static void main(String[] args) {
        try {
            Queue<Integer> q = new Queue<Integer>(3);
            try {
                q.enqueue(1);
                q.enqueue(2);
                q.enqueue(3);
                q.enqueue(4);
            } catch (QueueFullException exception) {
                System.err.println("Queue is full!");
                exception.printStackTrace();
            }

            try {
                System.out.println(q.dequeue());
                System.out.println(q.dequeue());
                System.out.println(q.dequeue());
                System.out.println(q.dequeue());
            } catch (QueueEmptyException exception) {
                System.err.println("Queue is empty!");
                exception.printStackTrace();
            }
        } catch (NegativeArraySizeException exception) {
            System.err.println("Size is negative!");
            exception.printStackTrace();
        }
    }
}
