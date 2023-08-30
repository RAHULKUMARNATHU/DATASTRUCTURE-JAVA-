import java.util.Scanner;

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        data = this.data;

    }

}

public class DeleteNode {

    public static Node<Integer> deleteNode(Node<Integer> head, int data) {
        if (data == head.data) {
            head = head.next;
            return head;
        }
        Node<Integer> NodeToBeDelete = head , prev = head ;
        while(NodeToBeDelete.data != data && NodeToBeDelete != null){
            prev= NodeToBeDelete;
            NodeToBeDelete = NodeToBeDelete.next;

        }
        if(NodeToBeDelete != null ){
            prev.next = NodeToBeDelete.next;
        }
        return head;
    }

    public static void printLL(Node<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static Node<Integer> takeInput() {

        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer> head = null, tail = null;
        while (data != -1) {
            Node<Integer> currentNode = new Node<Integer>(data);
            if (head == null) {
                head = currentNode;
                tail = currentNode;
            } else {
                tail.next = currentNode;
                tail = tail.next;
            }
            data = sc.nextInt();
        }
        return head;

    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        head = deleteNode(head, 10);
        printLL(head);

    }
}
