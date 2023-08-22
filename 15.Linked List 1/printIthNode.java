public class printIthNode {

    public static void printIthNode(Node<Integer> head, int i) {
        int count = 0;
        while (head != null) {
        if (count == i) {
        System.out.println(head.data);
        }
        count++;
        head = head.next;
        }
        // while (count != i) {
        //     count++;
        //     head = head.next;
        // }
        // System.out.println(head.data);
    }

    public static Node<Integer> createLinkedList() {
        Node<Integer> n1 = new Node<Integer>(10);
        Node<Integer> n2 = new Node<Integer>(20);
        Node<Integer> n3 = new Node<Integer>(30);
        Node<Integer> n4 = new Node<Integer>(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        return n1;
    }

    public static void main(String[] args) {
        Node<Integer> head = createLinkedList();
        printIthNode(head, 2);

    }
}
