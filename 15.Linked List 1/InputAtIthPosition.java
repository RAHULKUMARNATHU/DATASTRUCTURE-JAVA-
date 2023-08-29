import java.util.Scanner;

public class InputAtIthPosition {

    public static void printLL(Node<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static Node<Integer> inputAtIthPosition(int data, int position, Node<Integer> head) {
        Node<Integer> newNode = new Node<Integer>(data);

        if (position == 0) {
            newNode.next = head;
            return newNode;

        }else{
            int count  = 0 ;
            Node<Integer> prev = head ;
            while(count != position - 1 && prev != null){
                count ++ ;
                prev = prev.next;
            }if(prev != null){
                /*Make before breaks */
                newNode.next = prev.next ;
                prev.next = newNode;
            }

        }

        return head;
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
        Node<Integer> head = takeInput();
        head = inputAtIthPosition(80, 2, head);
        printLL(head);

    }
}
