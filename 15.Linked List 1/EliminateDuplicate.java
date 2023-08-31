import java.util.Scanner;

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;

    }
}

public class EliminateDuplicate {

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
            Node<Integer> currNode = new Node<Integer>(data);
            if (head == null) {
                head = currNode;
                tail = currNode;
            } else {
                tail.next = currNode;
                tail = tail.next;
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static Node<Integer> eliminateDuplicate(Node<Integer> head) {

        if (head == null) {
            return head;
        }
        Node<Integer> currentHead = head;
        while (currentHead.next != null) {

            if (currentHead.data.equals(currentHead.next.data)) {
                currentHead.next = currentHead.next.next;
            } else {
                currentHead = currentHead.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        head = eliminateDuplicate(head);
        printLL(head);
    }
}
