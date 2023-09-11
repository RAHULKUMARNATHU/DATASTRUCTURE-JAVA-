import java.util.Scanner;

public class EvenAfterOdd {

    public static Node<Integer> evenAfterOdd(Node<Integer> head) {
    if (head == null) {
    return head;
    }

    Node<Integer> oddHead = null, oddTail = null, evenHead = null, evenTail =
    null;

    while (head != null) {
    if (head.data % 2 == 0) {
    if (evenHead == null) {
    evenHead = head;
    evenTail = head;
    head = head.next;
    } else {
    evenTail.next = head;
    evenTail = head;
    head = head.next;
    }

    } else {
    if (oddHead == null) {
    oddHead = head;
    oddTail = head;
    head = head.next;
    } else {
    oddTail.next = head;
    oddTail = head;
    head = head.next;

    }
    }
    }

    if (oddHead == null) {
    return evenHead;
    }
    if (evenHead == null) {
    return oddHead;
    }
    evenTail.next = null;
    oddTail.next = evenHead;
    return oddHead;
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

    public static void printLL(Node<Integer> head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        printLL(head.next);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Node<Integer> head = takeInput(sc);
        head = evenAfterOdd(head);
        printLL(head);
    }
}
