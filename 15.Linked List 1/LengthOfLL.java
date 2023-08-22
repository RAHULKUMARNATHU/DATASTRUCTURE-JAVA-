public class LengthOfLL {

    public static int LengthOfLL(Node<Integer> head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }

        return count;

    }

    public static Node<Integer> createLinkedList() {
        Node<Integer> n1 = new Node<Integer>(10);
        Node<Integer> n2 = new Node<Integer>(10);
        Node<Integer> n3 = new Node<Integer>(10);
        Node<Integer> n4 = new Node<Integer>(10);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        return n1;
    }

    public static void main(String[] args) {
        Node<Integer> head = createLinkedList();
        int res = LengthOfLL(head);
        System.out.println("Length of LInked List :" + res);
    }
}
