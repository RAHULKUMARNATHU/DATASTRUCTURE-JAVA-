import java.util.Scanner;

public class DeleteIthNode {

    public static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }

    }

    public static int lengthOfLL(Node<Integer> head) {

        if (head == null) {
            return 0;
        }
        return 1 + lengthOfLL(head.next);
    }

    public static Node<Integer> deleteIthNode(Node<Integer> head, int position) {

        if (position == 0) {
            return head != null ? head.next : null;
        }

        if (head == null) {
            return null;
        }

        head.next = deleteIthNode(head.next, position - 1);
        return head;

    }

    public static void printLL(Node<Integer> head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        printLL(head.next);
    }

    public static Node<Integer> takeInput(Scanner sc) {
        int data = sc.nextInt();

        if (data == -1) {
            return null;
        }
        Node<Integer> newNode = new Node<Integer>(data);
        newNode.next = takeInput(sc);
        return newNode;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node<Integer> head = takeInput(sc);
        // int len = lengthOfLL(head);
        head = deleteIthNode(head, 10);
        printLL(head);
        // System.out.println(len);

    }
}
