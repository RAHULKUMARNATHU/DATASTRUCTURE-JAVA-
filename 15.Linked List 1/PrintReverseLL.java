import java.util.Scanner;

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;

    }

}

public class PrintReverseLL {
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

    public static void printReverseLL(Node<Integer> head) {
        if (head == null) {
            return;
        }
        printReverseLL(head.next);
        System.out.print(head.data + " ");
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        printReverseLL(head);
    }
}
