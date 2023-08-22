import java.util.Scanner;

public class TakeInput {

    public static void printLL(Node<Integer> head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static Node<Integer> takeInput() {
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        Node<Integer> head = null;
        while (data != -1) {
            Node<Integer> currentNode = new Node<Integer>(data);
            if (head == null) {
                /*
                 * Make current Node as head
                 */
                head = currentNode;
            } else {
                Node<Integer> tail = head;
                while (tail.next != null) {
                    tail = tail.next;
                }
                /*
                 * Now tail will refer to last node
                 * Connect current node after last node
                 */
                tail.next = currentNode;

            }

            data = s.nextInt();
        }

        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        printLL(head);
    }
}
