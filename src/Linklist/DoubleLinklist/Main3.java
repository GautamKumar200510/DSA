

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {

    Node head, tail;

    // Insert at End
    void insertAtEnd(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Delete from Start
    void deleteFromStart() {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        if (head == tail) {
            head = tail = null;
            return;
        }

        head = head.next;
        head.prev = null;
    }

    // Delete from End
    void deleteFromEnd() {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        if (head == tail) {
            head = tail = null;
            return;
        }

        tail = tail.prev;
        tail.next = null;
    }

    // Forward Display
    void displayForward() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Backward Display
    void displayBackward() {

        Node temp = tail;

        while (temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.prev;
        }

        System.out.println("null");
    }
}

public class Main3 {

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        System.out.println("Forward Display:");
        list.displayForward();

        System.out.println("Backward Display:");
        list.displayBackward();

        list.deleteFromStart();

        System.out.println("After Delete From Start:");
        list.displayForward();

        list.deleteFromEnd();

        System.out.println("After Delete From End:");
        list.displayForward();
    }
}
