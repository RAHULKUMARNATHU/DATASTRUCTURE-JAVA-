import java.util.Scanner;

public class SwapTwoNode {

    public static Node<Integer> swapTwoNode(Node<Integer> head, int pos1, int pos2) {

        if (head == null) {
            return null;

        }

        int count = 0;
        Node<Integer> tail1 = head, tail2 = head;

        while (count++ != pos1) {
            tail1 = tail1.next;
        }

        count = 0;
        while (count++ != pos2) {

            tail2 = tail2.next;
        }

        int temp = tail1.data;
        tail1.data = tail2.data;
        tail2.data = temp;

        return head;

    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        head = swapTwoNode(head, 2, 5);
        printLL(head);

    }

    public static Node<Integer> takeInput() {
        Scanner sc = new Scanner(System.in);

        int data = sc.nextInt();

        Node<Integer> head = null, tail = null;

        while (data != -1) {
            Node<Integer> newNode = new Node<Integer>(data);

            if (head == null) {
                head = newNode;
                tail = newNode;
                // tail = tail.next;
            } else {
                tail.next = newNode;
                tail = tail.next;
            }

            data = sc.nextInt();
        }
        // sc.close();
        return head;

    }

    public static void printLL(Node<Integer> head) {
        if (head == null) {
            System.out.println("Empty LL");
        }
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
