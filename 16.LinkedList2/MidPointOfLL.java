/*
 * Mid Point Linked List
Send Feedback
For a given singly linked list of integers, find and return the node present at the middle of the list.
Note :
If the length of the singly linked list is even, then return the first middle node.

Example: Consider, 10 -> 20 -> 30 -> 40 is the given list, then the nodes present at the middle with respective data values are, 20 and 30. We return the first node with data 20.
 Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first and the only line of each test case or query contains the elements of the singly linked list separated by a single space. 
Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
 Output Format :
For each test case/query, print the data value of the node at the middle of the given list.

Output for every test case will be printed in a seperate line.
Constraints :
1 <= t <= 10^2
0 <= M <= 10^5 
Where M is the size of the singly linked list.

Time Limit: 1sec
Sample Input 1 :
1
1 2 3 4 5 -1
Sample Output 1 :
3
Sample Input 2 :
2 
-1
1 2 3 4 -1
Sample Output 2 :
2
 */



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
