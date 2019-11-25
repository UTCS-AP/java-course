import structure.Queue;
import structure.QueueEmptyException;
import structure.QueueFullException;

public class Main {
    public static void main(String[] args) {
        try {
            f();
        } catch (QueueFullException e) {
            System.err.println("Queue is full!");
            e.printStackTrace();
        } catch (QueueEmptyException e) {
            System.err.println("Queue is empty!");
            e.printStackTrace();
        } finally {
            System.out.println("No matter what, this will be executed!");
        }
    }

    private static void f() throws QueueFullException, QueueEmptyException {
        try {
            Queue<Integer> q = new Queue<Integer>(3);

            q.enqueue(1);
            q.enqueue(2);
            q.enqueue(3);
            q.enqueue(4);


            System.out.println(q.dequeue());
            System.out.println(q.dequeue());
            System.out.println(q.dequeue());
            System.out.println(q.dequeue());

        } catch (NegativeArraySizeException exception) {
            System.err.println("Size is negative!");
            exception.printStackTrace();
        }
    }
}
