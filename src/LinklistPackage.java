public class LinklistPackage {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        list.insertAtEnd(40);

//        list.deleteAtBeginning();
//        list.deleteAtEnd();

//        list.deleteByValue(10);

        list.reverse();

        list.display();
    }

}

/*
Node
data (value of node)
next (reference / pointer to the next node)

newNode -> 10 -> 20 -> 30 -> 12,23,,34,,5,45,6,6, 5 -> 100 ->  null

 */
// head -> [10 | next] -> [20 | next] -> [30 | next]


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

    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

    }

    void deleteAtBeginning(){
       if (head != null){
           head = head.next;
       }
    }

    void deleteAtEnd(){
        if (head == null || head.next == null){
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }

    void deleteByValue(int value){
        if (head == null) return;

        if (head.data == value){
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != value){
            current = current.next;
        }

        if (current.next != null){
            current.next = current.next.next;
        }

    }

    void reverse(){
        Node prev = null;
        Node current = head;

        while (current != null){
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;

    }


    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

}

// 10 -> null
