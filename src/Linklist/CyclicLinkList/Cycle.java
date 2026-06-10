
class SearchValue{

    Node head;

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    void insert(int data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
            newNode.next = head;
            return;
        }

        Node temp = head;
        while (temp.next != head){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;

    }

    boolean search(int valus){
        Node current = head;

        while (current != null){
            if (current.data == valus){
                return true;
            }

            current = current.next;

        }
        System.out.println("false");
        return false;

    }

    void display(){
        if (head == null) return;

        Node temp = head;
        do {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }while (temp != head);
        System.out.println("[ Back  to Head ]");
    }

}

public class Cycle {
    public static void main(String[] args) {
        SearchValue list = new SearchValue();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

//        list.display();

        System.out.println(list.search(60));

    }
}
