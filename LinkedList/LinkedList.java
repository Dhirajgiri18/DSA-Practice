package LinkedList;

public class LinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void addNode(int new_data) {
        Node new_Node = new Node(new_data);
        if (head == null) {
            head = new_Node;
            tail = new_Node;
        } else {
            tail.next = new_Node;
            tail = tail.next;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addNode(8);
        ll.addNode(5);
        ll.addNode(4);
        ll.addNode(9);
        ll.display();

    }
}
