
/*
 * 1--> 2--> 3--> 4--> 5--> 6--> 7--> null
 * 7--> 6--> 5--> 4--> 3--> 2--> 1--> null
 * 
 * 
 * 
 */

import java.util.Scanner;

public class ReverseLL {

    public static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    public static Node<Integer> reverseLL(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node<Integer> newHead =  reverseLL(head.next);
        
        head.next.next = head ;
        head.next = null ;
        return newHead ;

    }

    public static Node<Integer> takeInputLL(Scanner sc) {
        int data = sc.nextInt();

        if (data == -1) {
            return null;
        }

        Node<Integer> newNode = new Node<Integer>(data);

        newNode.next = takeInputLL(sc);
        return newNode;
    }

    public static void printLL(Node<Integer> head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        printLL(head.next);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node<Integer> head = takeInputLL(sc);
        head = reverseLL(head);
        printLL(head);

    }
}
