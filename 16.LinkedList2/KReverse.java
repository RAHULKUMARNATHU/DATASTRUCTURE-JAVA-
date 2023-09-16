import java.util.Scanner;

public class KReverse {

    public static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    public static Node<Integer> reverseIterative(Node<Integer> head) {

        if (head == null) {
            return null;
        }

        Node<Integer> prevNode = null;
        Node<Integer> currNode = head;
        Node<Integer> nextNode = null;

        while (currNode != null) {
            nextNode = currNode.next; // store the next node
            currNode.next = prevNode; /* reverse the pointer */
            prevNode = currNode; /* Move prev to the current Node */
            currNode = nextNode;
        }

        return prevNode;

    }

    // public static Node<Integer> reverse(Node<Integer> head) {
    // if (head == null || head.next == null) {
    // return null;
    // }

    // Node<Integer> newHead = reverse(head.next);
    // head.next.next = head;
    // head.next = null;

    // return newHead;

    // }

    public static Node<Integer> kReverse(Node<Integer> head, int k) {
        if (head == null || k <= 1) {
            return head;
        }

        Node<Integer> head1 = head, tail1 = head, head2 = null;
        int count = 1;

        while (count < k) {
            if (tail1.next == null) {
                break;
            }
            tail1 = tail1.next;
            count++;
        }
        head2 = tail1.next;
        tail1.next = null;
        head = reverseIterative(head1);

        head1.next = kReverse(head2, k);

        return head;

    }

    public static Node<Integer> takeInput(Scanner sc) {
        // Scanner sc = new Scanner(System.in);
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

    public static void printLL(Node<Integer> head) {
        if (head == null) {
            return;
        }
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node<Integer> head = takeInput(sc);
        head = kReverse(head, 2);
        printLL(head);

    }
}
