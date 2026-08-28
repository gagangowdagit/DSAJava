package LinkedList;

class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    
    public void insertBeg(int val) {
        Node nn = new Node(val);
        nn.next = head;
        head = nn;
    }

    public void insertEnd(int val) {
        Node nn = new Node(val);
        if (head == null) {
            head = nn;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = nn;
    }

    public void insertPos(int val, int pos) {
        if (pos < 1) {
            System.out.println("Invalid index");
            return;
        }
        if (pos == 1) {
            insertBeg(val);
            return;
        }
        Node nn = new Node(val);
        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid index");
            return;
        }
        nn.next = temp.next;
        temp.next = nn;
    }

    public int rmBeg() {
        if (head == null) {
            System.out.println("List is Empty");
            return -1;
        }
        int res = head.data;
        head = head.next;
        return res;
    }

    public int rmEnd() {
        if (head == null) {
            System.out.println("List is Empty");
            return -1;
        }
        if (head.next == null) {
            int res = head.data;
            head = null;
            return res;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        int res = temp.next.data;
        temp.next = temp.next.next;
        return res;
    }

    public int rmpos(int pos) {
        if (pos < 1) {
            System.out.println("Position is invalid");
            return -1;
        }
        if (pos == 1) {
            return rmBeg();
        }
        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null && temp.next != null; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            System.out.println("Position is Invalid");
            return -1;
        }
        int res = temp.next.data;
        temp.next = temp.next.next;
        return res;
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.insertBeg(10);
        list1.insertBeg(20);
        list1.insertEnd(30);
        list1.insertEnd(40);
        list1.insertPos(25, 3);
        System.out.println("Removed from beginning: " + list1.rmBeg());
        System.out.println("Removed from end: " + list1.rmEnd());
        System.out.println("Removed from position: " + list1.rmpos(2));
        System.out.println("Removed from beginning: " + list1.rmBeg());
        System.out.println("Removed from end: " + list1.rmEnd());
        System.out.println("Removed from position: " + list1.rmpos(1));
    }
}
