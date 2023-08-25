import java.util.Scanner;

public class ImproveTakeInput {
    public static void printLL(Node<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static Node<Integer> takeInput() {
        Scanner sc = new Scanner(System.in);
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

    public static void main(String[] args) {

        Node<Integer> headNode = takeInput();
        printLL(headNode);
    }
}
