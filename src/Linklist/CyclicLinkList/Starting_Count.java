

class SearchValue {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Insert Node
    void insert(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node temp = head;

        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    // Search Element
    boolean search(int value) {

        if (head == null) {
            return false;
        }

        Node current = head;

        do {

            if (current.data == value) {
                return true;
            }

            current = current.next;

        } while (current != head);

        return false;
    }

    // Find Starting Node
    int findStartingNode() {

        if (head == null) {
            return -1;
        }

        return head.data;
    }

    // Count Nodes
    int countNodes() {

        if (head == null) {
            return 0;
        }

        int count = 0;
        Node temp = head;

        do {

            count++;
            temp = temp.next;

        } while (temp != head);

        return count;
    }

    // Display Circular Linked List
    void display() {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("[ Back To Head ]");
    }
}

public class Starting_Count {

    public static void main(String[] args) {

        SearchValue list = new SearchValue();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Circular Linked List:");
        list.display();

        System.out.println("\nSearch 30 : " + list.search(30));
        System.out.println("Search 60 : " + list.search(60));

        System.out.println("\nStarting Node : "
                + list.findStartingNode());

        System.out.println("Total Nodes : "
                + list.countNodes());
    }
}