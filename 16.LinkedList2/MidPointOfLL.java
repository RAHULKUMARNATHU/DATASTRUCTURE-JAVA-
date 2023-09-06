import java.util.Scanner;

public class MidPointOfLL {
    public static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }


    /*1st approach */
    // public static int lengthOfLL(Node<Integer> head) {
    //     if (head == null) {

    //         return 0;
    //     }

    //     return 1 + lengthOfLL(head.next);
    // }

    // public static Node<Integer> findMidPointOfLL(Node<Integer> head) {
    //     if (head == null || head.next == null) {
    //         return null;
    //     }

    //     int len = lengthOfLL(head);
    //     if (len % 2 != 0) {
    //         len = len + 1;
    //     }

    //     int i = 0;

    //     while (i < len / 2 - 1) {
    //         head = head.next;
    //         i++;

    //     }
    //     return head;

    // }

    /*Second approach */
    public static Node<Integer> findMidPointOfLL(Node<Integer> head){

        if(head == null){
            return head ;
        }

        Node<Integer> fast = head.next , slow = head ;
        while( fast != null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next ;

        }
        return slow ;

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
        System.out.println(head.data + " ");
        printLL(head.next);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node<Integer> head = takeInput(sc);
        Node<Integer> newNode = findMidPointOfLL(head);
        System.out.println(newNode.data);
        // printLL(head);

    }
}
