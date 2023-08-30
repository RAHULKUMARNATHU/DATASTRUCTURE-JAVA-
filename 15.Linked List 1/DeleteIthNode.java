import java.util.Scanner;

class LinkedList<T> {
    T data;
    LinkedList<T> next;

    LinkedList(T data) {
        this.data = data;
    }

}

public class DeleteIthNode {
    public static LinkedList<Integer> deleteIthNode(LinkedList<Integer> head, int position) {

        int count = 1;
        LinkedList<Integer> prev = head, temp;
        if (position == 0) {
            head = head.next;
            return head;
        } else {
            while (count != position - 1 && prev.next != null) {
                prev = prev.next;
                count++;
            }
            if (prev.next != null) {
                // temp = prev.next;
                // prev.next = temp.next;
                // temp.next = null;
                prev.next = prev.next.next;

            }
        }

        return head;
    }

    public static void printLL(LinkedList<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;

        }
    }

    public static LinkedList<Integer> takeInput() {
        LinkedList<Integer> head = null, tail = null;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        while (data != -1) {
            LinkedList<Integer> currentNode = new LinkedList<Integer>(data);
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

    public static void main(String[] args) {
        LinkedList<Integer> head = takeInput();
        head = deleteIthNode(head, 3);
        printLL(head);

    }

}
