package Queue;

class Queue {

    private int front, rear, maxsize;
    private int[] queuearray;

    public Queue(int size) {
        maxsize = size;
        front = 0;
        rear = -1;
        queuearray = new int[maxsize];
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public boolean isFull() {
        return rear == maxsize - 1;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return queuearray[front];
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is Already Full");
            return;
        }
        queuearray[++rear] = value;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int poppedValue = queuearray[front++];

        if (front > rear) {
            front = 0;
            rear = -1;
        }

        return poppedValue;
    }
}

public class Main {

    public static void main(String[] args) {

        Queue q1 = new Queue(6);

        System.out.println("Is Empty: " + q1.isEmpty());

        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);
        q1.enqueue(40);

        System.out.println("Front element: " + q1.peek());

        System.out.println("Dequeued: " + q1.dequeue());
        System.out.println("Dequeued: " + q1.dequeue());

        System.out.println("Front element: " + q1.peek());

        System.out.println("Is Full: " + q1.isFull());

        q1.enqueue(50);
        q1.enqueue(60);
        q1.enqueue(70);
        q1.enqueue(80);

        System.out.println("Dequeued: " + q1.dequeue());
        System.out.println("Dequeued: " + q1.dequeue());
        System.out.println("Dequeued: " + q1.dequeue());
        System.out.println("Dequeued: " + q1.dequeue());

        System.out.println("Dequeued: " + q1.dequeue());

        System.out.println("Is Empty: " + q1.isEmpty());
    }
}