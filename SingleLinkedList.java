import org.w3c.dom.Node;

class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}


public class SingleLinkedList {
    static ListNode head;

    public static void insertAtHead(int num){
        ListNode newNode = new ListNode(num);
        newNode.next = head;
        head = newNode;
    }

    public static void insertAtTail(int num){
        ListNode newNode = new ListNode(num);
        if (head == null) {
            head = newNode;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public static void deleteNodeAtHead() {
        if(head != null){
            head = head.next;
        }
    }

    public static void display() {
        ListNode temp = head;
        while(temp != null) {
            System.out.println(temp.data+ " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {

        insertAtHead(10);
        insertAtHead(20);

        display();

        insertAtTail(30);
        display();

        deleteNodeAtHead();
        display();

    }
}
