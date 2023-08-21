public class IncrementEveryEle {

    public static void printLinkedList(Node<Integer> head){

        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    public static void increment(Node<Integer> head){

        while(head != null){
            head.data+=5;
            head = head.next;
        }

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
    Node<Integer> head =  createLinkedList();
    increment(head) ; 
    printLinkedList(head);
    }
}
