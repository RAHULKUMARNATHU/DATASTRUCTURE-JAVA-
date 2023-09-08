import java.util.Scanner;

public class MergeTwoSortedLL {

    // public static Node<Integer> mergeTwoSortedLL(Node<Integer> head1,
    // Node<Integer> head2) {
    // if (head1 == null) {
    // return head2;
    // }

    // if (head2 == null) {
    // return head1;
    // }

    // Node<Integer> newNode = null;
    // if (head1.data > head2.data) {
    // newNode = head2;
    // newNode.next = mergeTwoSortedLL(head1, head2.next);
    // } else {
    // newNode = head1;

    // newNode.next = mergeTwoSortedLL(head1.next, head2);
    // }
    // return newNode;

    // }

    public static Node<Integer> mergeTwoSortedLL(Node<Integer> head1, Node<Integer> head2) {
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
            head2 =  head2.next ;
        } else {
            newHead = head1;
            newTail = head1;
            head1 = head1.next;
        }

        while (head1 != null && head2 != null) {
            if (head1.data > head2.data) {
                newTail.next = head2;
                head2 = head2.next;
                newTail = newTail.next ;
            } else {
                newTail.next = head1;
                newTail = newTail.next;
                head1 = head1.next ;
            }
        }

        if (head1 != null) {
            newTail.next = head1;
        }
        if (head2 != null) {
            newTail.next = head2;
        }
        return newHead ;
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

            } else {
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
        System.out.print(head.data + " ");
        printLL((head.next));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node<Integer> head1 = takeInputLL();
        Node<Integer> head2 = takeInputLL();
        head2 = mergeTwoSortedLL(head1, head2);
        printLL(head2);

    }
}
