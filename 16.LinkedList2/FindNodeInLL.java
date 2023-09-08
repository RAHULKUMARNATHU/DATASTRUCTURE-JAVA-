import java.util.Scanner;

public class FindNodeInLL {
    public static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }

    }

    public static int finNodeRecursive(Node<Integer> head, int ele) {
        if (head.next == null && head.data != ele) {
            return -1;
        }
        if (head.data == ele) {
            return 0;
        }

        int index = finNodeRecursive(head.next, ele);
        if (index == -1) {
            return index;
        }
        return 1 + index;

    }

    public static Node<Integer> takeInputLL() {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        Node<Integer> head = null, tail = null;
        while (data != -1) {
            Node<Integer> newNode = new Node<Integer>(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            }

            else {
                tail.next = newNode;
                tail = tail.next;
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static void printLL(Node<Integer> head) {
        if (head == null) {
            return;
        }
        printLL(head.next);
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInputLL();
        int position = finNodeRecursive(head, 5);
        System.out.println(position);
    }
}
