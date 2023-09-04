import java.util.Scanner;

public class TakeInputAtIthPosition {

    public static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    public static Node<Integer> takeInputAtIthPosition(Node<Integer> head, int pos, int ele) {
        if (head == null && pos > 0) {
            return head;
        }
        if (pos == 0) {
            Node<Integer> newHead = new Node<Integer>(ele);
            newHead.next = head;
            return newHead;
        }

        else {
            head.next = takeInputAtIthPosition(head.next, pos - 1, ele);
            return head;
        }
    }

    public static Node<Integer> takeInput(Scanner sc, Node<Integer> head, Node<Integer> tail) {
        int data = sc.nextInt();

        if (data == -1) {
            return head;
        }

        Node<Integer> currentHead = new Node<Integer>(data);

        if (head == null) {
            head = currentHead;
            tail = currentHead;
        } else {
            tail.next = currentHead;
            tail = tail.next;
        }

        return takeInput(sc, head, tail);
    }

    public static void printRecursive(Node<Integer> head) {
        if (head == null) {
            return;

        }
        System.out.print(head.data + " ");
        printRecursive(head.next);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node<Integer> head = null, tail = null;
        head = takeInput(sc, head, tail);
        head = takeInputAtIthPosition(head, 3, 20);
        printRecursive(head);

    }
}
