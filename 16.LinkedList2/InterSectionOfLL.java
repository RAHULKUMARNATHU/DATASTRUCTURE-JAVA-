import java.util.Scanner;

public class InterSectionOfLL {
    public static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    public static Node<Integer> findInterSectionNode(Node<Integer> head1, Node<Integer> head2) {

        if (head1 == null || head2 == null) {
            return null;
        }

        Node<Integer> temp  = null ;
        while (head1 != null && head2 != null) {
            if (head1.data.equals(head2.data)) {
                // return head1;
                temp = head1 ;
                temp.next =null ;
                return temp ;

            }
            if (head1.data > head2.data) {
                head2 = head2.next;

            } else {
                head1 = head1.next;

            }
            // head2 = head2.next;
        }

        return null;

    }

    public static Node<Integer> takeInputLL(Scanner sc) {
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
        Node<Integer> head1 = takeInputLL(sc);
        Node<Integer> head2 = takeInputLL(sc);
        head1 = findInterSectionNode(head1, head2);
        printLL(head1);

    }
}
