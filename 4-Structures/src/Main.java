import data.Person;
import structure.Queue;
import structure.Stack;
import structure.linkedlist.LinkedList;

public class Main {
    static public void main(String[] args) {
        Person ali = new Person("Ali", "Mamalian", "Mammad", "Door", "ali.mamalian@asf.sa");
        Person mamad = new Person("Mammad", "Kachalzadeh", "Akbar", "Hamoonja", "mamad.kachal@asf.sa");

        Queue queue = new Queue(5);
        if (queue.dequeue() == null)
            System.out.println("NULL");
        queue.enqueue(ali);
        queue.enqueue(mamad);
        queue.enqueue(ali);
        queue.enqueue(ali);
        boolean q1 = queue.enqueue(mamad);
        boolean q2 = queue.enqueue(ali);

        System.out.println(q1);
        System.out.println(q2);

        System.out.println(queue.dequeue().getFirstName());
        System.out.println(queue.dequeue().getFirstName());
        System.out.println(queue.dequeue().getFirstName());
        System.out.println(queue.dequeue().getFirstName());
        System.out.println(queue.dequeue().getFirstName());
        if (queue.dequeue() == null)
            System.out.println("NULL");

        System.out.println(queue.enqueue(ali));
        System.out.println(queue.dequeue().getFirstName());
        System.out.println(queue.enqueue(mamad));
        System.out.println(queue.dequeue().getFirstName());
        System.out.println(queue.enqueue(ali));
        System.out.println(queue.dequeue().getFirstName());
        System.out.println(queue.enqueue(mamad));
        System.out.println(queue.dequeue().getFirstName());
        System.out.println(queue.enqueue(ali));
        System.out.println(queue.dequeue().getFirstName());
        System.out.println(queue.enqueue(mamad));
        System.out.println(queue.dequeue().getFirstName());
        System.out.println(queue.enqueue(ali));
        System.out.println(queue.dequeue().getFirstName());
        System.out.println(queue.enqueue(mamad));
        System.out.println(queue.dequeue().getFirstName());
        System.out.println(queue.enqueue(ali));
        System.out.println(queue.dequeue().getFirstName());
        System.out.println(queue.enqueue(mamad));
        System.out.println(queue.dequeue().getFirstName());
        System.out.println(queue.enqueue(ali));
        System.out.println(queue.enqueue(mamad));
        System.out.println(queue.dequeue().getFirstName());
        System.out.println(queue.enqueue(ali));
        System.out.println(queue.enqueue(mamad));
        System.out.println(queue.enqueue(mamad));
        System.out.println(queue.dequeue().getFirstName());
        System.out.println(queue.dequeue().getFirstName());
        System.out.println(queue.enqueue(ali));
        System.out.println(queue.enqueue(mamad));
        System.out.println(queue.dequeue().getFirstName());
        System.out.println(queue.enqueue(ali));
        System.out.println(queue.enqueue(mamad));
        System.out.println(queue.enqueue(mamad));
        System.out.println(queue.dequeue().getFirstName());

        System.out.println("-----------------------");


        Stack stack = new Stack(5);
        stack.push(ali);
        stack.push(mamad);
        stack.push(ali);
        stack.push(mamad);
        boolean s1 = stack.push(mamad);
        boolean s2 = stack.push(mamad);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(stack.pop().getFirstName());
        System.out.println(stack.pop().getFirstName());
        System.out.println(stack.pop().getFirstName());
        System.out.println(stack.pop().getFirstName());
        System.out.println(stack.pop().getFirstName());
        Person nothing = stack.pop();
        if (nothing == null)
            System.out.println("Ready to meet my maker.");

        LinkedList linkedList = new LinkedList();
        linkedList.insert(mamad);
        linkedList.insert(ali);
        System.out.println("Last: " + linkedList.get().getFirstName());
        System.out.println("Deleting...");
        linkedList.delete();
        System.out.println("Last: " + linkedList.get().getFirstName());

    }
}
