import java.util.Scanner;

public class MergeSortInLL {
    public static class Node<T> {
        T data;

        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    public static Node<Integer> mergeTwoSort(Node<Integer> head1, Node<Integer> head2) {
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }

        Node<Integer> newHead = null, newTail = null;

        if (head1.data > head2.data) {
            newHead = head2;
            newTail = head2;
            head2 = head2.next;
        } else {
            newHead = head1;
            newTail = head1;
            head1 = head1.next;
        }
        while (head1 != null && head2 != null) {
            if (head1.data > head2.data) {
                newTail.next = head2;
                newTail = newTail.next;
                head2 = head2.next;
            } else {
                newTail.next = head1;
                newTail = newTail.next;
                head1 = head1.next;
            }

        }

        if (head1 != null) {
            newTail.next = head1;
        }
        if (head2 != null) {
            newTail.next = head2;
        }
        return newHead;

    }

    public static Node<Integer> midPoint(Node<Integer> head) {
        if (head == null) {
            return head;
        }

        Node<Integer> fast = head, slow = head;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = head.next;

        }
        return slow;
    }

    public static Node<Integer> mergeSort(Node<Integer> head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node<Integer> midNode = midPoint(head);
        Node<Integer> part1Head = head;
        Node<Integer> part2Head = midNode.next;
        /* just break the connection of LL after midPoint */
        midNode.next = null;

        /* now sort the element */
        Node<Integer> mergeh1 = mergeSort(part1Head);
        Node<Integer> mergeh2 = mergeSort(part2Head);
        head = mergeTwoSort(mergeh1, mergeh2);
        return head;

    }

    public static Node<Integer> takeInputLL(Scanner sc) {
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }

        Node<Integer> newHead = new Node<Integer>(data);
        newHead.next = takeInputLL(sc);
        return newHead;
    }

    public static void printLL(Node<Integer> head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        printLL(head.next);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Node<Integer> head = takeInputLL(sc);
        head = mergeSort(head);
        printLL(head);

    }
}
