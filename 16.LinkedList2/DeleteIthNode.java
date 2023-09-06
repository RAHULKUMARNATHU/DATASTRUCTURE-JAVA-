/**
 * Delete node Recursively
Send Feedback
Given a singly linked list of integers and position 'i', delete the node present at the 'i-th' position in the linked list recursively.
 Note :
Assume that the Indexing for the linked list always starts from 0.

No need to print the list, it has already been taken care. Only return the new head to the list.
 input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains the elements of the singly linked list separated by a single space.

The second line of input contains a single integer depicting the value of 'i'.
Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
Output format :
For each test case/query, print the elements of the updated singly linked list.

Output for every test case will be printed in a seperate line.
Constraints :
1 <= t <= 10^2
0 <= M <= 10^5
Where M is the size of the singly linked list.
0 <= i < M

Time Limit:  2 sec
Sample Input 1 :
1
3 4 5 2 6 1 9 -1
3
Sample Output 1 :
3 4 5 6 1 9
Sample Input 2 :
2
30 -1
0
10 20 30 50 60 -1
4
Sample Output 2 :
10 20 30 50 
 */
import java.util.Scanner;

public class DeleteIthNode {

    public static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }

    }

    public static int lengthOfLL(Node<Integer> head) {

        if (head == null) {
            return 0;
        }
        return 1 + lengthOfLL(head.next);
    }

    public static Node<Integer> deleteIthNode(Node<Integer> head, int position) {

        if (position == 0) {
            return head != null ? head.next : null;
        }

        if (head == null) {
            return null;
        }

        head.next = deleteIthNode(head.next, position - 1);
        return head;

    }

    public static void printLL(Node<Integer> head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        printLL(head.next);
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node<Integer> head = takeInput(sc);
        // int len = lengthOfLL(head);
        head = deleteIthNode(head, 10);
        printLL(head);
        // System.out.println(len);

    }
}
