class Stack {
    private int top, maxsize;
    private int[] stackarray;

    public Stack(int size) {
        maxsize = size;
        top = -1;
        stackarray = new int[maxsize];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxsize - 1;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Underflow");
            return -1;
        }
        return stackarray[top];
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is Overflow");
            return;
        }
        stackarray[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Underflow");
            return -1;
        }
        return stackarray[top--];
    }
}

public class Main {
    public static void main(String[] args) {

        Stack s1 = new Stack(6);

        System.out.println("Is Empty: " + s1.isEmpty());

        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);

        System.out.println("Top element: " + s1.peek());

        System.out.println("Popped: " + s1.pop());
        System.out.println("Popped: " + s1.pop());

        System.out.println("Top element: " + s1.peek());

        System.out.println("Is Full: " + s1.isFull());

        s1.push(50);
        s1.push(60);
        s1.push(70);

        s1.push(80);

        System.out.println("Popped: " + s1.pop());
        System.out.println("Popped: " + s1.pop());
        System.out.println("Popped: " + s1.pop());
        System.out.println("Popped: " + s1.pop());

        System.out.println("Popped: " + s1.pop());

        System.out.println("Is Empty: " + s1.isEmpty());
    }
}