import java.util.Scanner;

class Node<T> {

    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
    }

}

public class PrintRecursive {

    public static Node<Integer> takeInput() {

        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer> head = null, tail = null;

        while (data != -1) {
            Node<Integer> currentHead = new Node<Integer>(data);

            if (head == null) {
                head = currentHead;
                tail = currentHead;
            } else {
                tail.next = currentHead;
                tail = tail.next;
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static void printRecursive(Node<Integer> head) {
        if (head == null) {
            return ;

        }
        System.out.print(head.data+" ");
        printRecursive(head.next);
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        printRecursive(head);

    }
}
