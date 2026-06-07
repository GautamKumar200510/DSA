public class Doublelinklist {

    private void insertAtBeginning(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void displayForward() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    

class Node{
    int data;
    Node prev;
    Node next;

    Node(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }

}

class DoublyLinkedList{
    Node head, tail;

    void insertAtBeginning(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;


    }

    void displayForward(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ⇄ ");
            temp = temp.next;
        }

        System.out.println("null");

    }


}


public class Main3 {
    public static void main(String[] args) {
        Doublelinklist  list = new Doublelinklist ();
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        list.insertAtBeginning(40);

        list.displayForward();

    }
}
/*
    |       |
    |       |
    |       |
    |       |
    |       |
    |__10___|


 */

}
