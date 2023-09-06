import java.util.Scanner;

public class DeleteNodeRecursive {

    public static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    public static int length(Node<Integer> head, int count) {
        // int count = 0 ;
        if (head == null) {
            return count;
        }

        return length(head.next, count + 1);

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

    public static Node<Integer> deleteNodeR(Node<Integer> head, int data) {

        if (head == null) {
            return head;
        }

        if (head.data == data) {
            return head = head.next;
        } else {
            head.next = deleteNode(head.next, data);
            return head;
        }
    }

    public static Node<Integer> deleteNode(Node<Integer> head, int data) {

        if (head == null) {
            return head;
        }

        if (head.data == data) {
            return head = head.next;
        }

        Node<Integer> tempNode = head, prevNode = head;

        while (tempNode != null) {
            if (tempNode.data == data) {
                prevNode.next = tempNode.next;
                return head;

            } else {
                prevNode = tempNode;
                tempNode = tempNode.next;
            }
        }
        return head;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node<Integer> head = takeInput(sc);
        int len = length(head, 0);
        head = deleteNode(head, 2);
        // head = deleteNodeR(head, 2);
        System.out.println(len);
        printLL(head);

    }
}
