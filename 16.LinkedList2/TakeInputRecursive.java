import java.util.Scanner;

public class TakeInputRecursive {

    public static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    public static Node<Integer> takeInputRecursive(Scanner sc, Node<Integer> head, Node<Integer> tail) {
        int data = sc.nextInt();
        if (data == -1) {
            return head;
        }

        Node<Integer> currNode = new Node<Integer>(data);
        if (head == null) {
            head = currNode;
            tail = currNode;

        } else {
            tail.next = currNode;
            tail = tail.next;
        }
        return takeInputRecursive(sc, head, tail);
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
        head = takeInputRecursive(sc, head, tail);
        printRecursive(head);
    }
}