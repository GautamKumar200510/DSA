// Node Class
class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Linked List Class
class Linkedlist {

    Node head;

    void insertAtBeginning(int data) {

        Node newNode = new Node(data);

        newNode.next = head;

        head = newNode;
    }

    void display() {

        Node current = head;

        while (current != null) {

            System.out.print(current.data + " -> ");

            current = current.next;
        }

        System.out.println("kuch bhi nhi");
    }
}

// Main Class
public class Linklist {

    public static void main(String[] args) {

        Linkedlist list = new Linkedlist();

        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);

        list.display();

        
    }
}