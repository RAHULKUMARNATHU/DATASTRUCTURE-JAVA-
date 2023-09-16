
/*
 * 1--> 2--> 3--> 4--> 5--> 6--> 7--> null
 * 7--> 6--> 5--> 4--> 3--> 2--> 1--> null
 * 
 * 
 * Reverse LL (Recursive)
Send Feedback
Given a singly linked list of integers, reverse it using recursion and return the head to the modified list. You have to do this in O(N) time complexity where N is the size of the linked list.
 Note :
No need to print the list, it has already been taken care. Only return the new head to the list.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first and the only line of each test case or query contains the elements of the singly linked list separated by a single space.
Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
Output format :
For each test case/query, print the elements of the updated singly linked list.

Output for every test case will be printed in a seperate line.
 Constraints :
1 <= t <= 10^2
0 <= M <= 10^4
Where M is the size of the singly linked list.

Time Limit: 1sec
Sample Input 1 :
1
1 2 3 4 5 6 7 8 -1
Sample Output 1 :
8 7 6 5 4 3 2 1
Sample Input 2 :
2
10 -1
10 20 30 40 50 -1
Sample Output 2 :
10 
50 40 30 20 10 








steps -------------------------------
It seems like you want to see the step-by-step output of reversing a linked list containing the values 1, 2, 3, 4, 5, and 6. Here's the process broken down step by step:

Initial Linked List: 1 -> 2 -> 3 -> 4 -> 5 -> 6

Step 1:
- Current `head`: 1
- Recursive call: `reverseLL(head.next)` with `head.next` (2)
- Recursive call stack: 1 -> reverseLL(2)

Step 2:
- Current `head`: 2
- Recursive call: `reverseLL(head.next)` with `head.next` (3)
- Recursive call stack: 1 -> 2 -> reverseLL(3)

Step 3:
- Current `head`: 3
- Recursive call: `reverseLL(head.next)` with `head.next` (4)
- Recursive call stack: 1 -> 2 -> 3 -> reverseLL(4)

Step 4:
- Current `head`: 4
- Recursive call: `reverseLL(head.next)` with `head.next` (5)
- Recursive call stack: 1 -> 2 -> 3 -> 4 -> reverseLL(5)

Step 5:
- Current `head`: 5
- Recursive call: `reverseLL(head.next)` with `head.next` (6)
- Recursive call stack: 1 -> 2 -> 3 -> 4 -> 5 -> reverseLL(6)

Step 6:
- Current `head`: 6
- Base case reached: `head` is the last node (6)
- Return `head` (6) as is.

Now, let's reverse the pointers:

Step 5:
- Current `head`: 5
- After reversing: 5 -> 6 (5.next.next = 5, 5.next = null)

Step 4:
- Current `head`: 4
- After reversing: 4 -> 5 (4.next.next = 4, 4.next = null)

Step 3:
- Current `head`: 3
- After reversing: 3 -> 4 (3.next.next = 3, 3.next = null)

Step 2:
- Current `head`: 2
- After reversing: 2 -> 3 (2.next.next = 2, 2.next = null)

Step 1:
- Current `head`: 1
- After reversing: 1 -> 2 (1.next.next = 1, 1.next = null)

Now, the reversed linked list is formed. It starts with the head that used to be the last element:

Reversed Linked List: 6 -> 5 -> 4 -> 3 -> 2 -> 1
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

        // System.out.print(head.data+ "-->");

        Node<Integer> newHead =  reverseLL(head.next);
        //  System.out.print("<--"+head.data);
         
         head.next.next = head ;
         head.next = null ;
        //  System.out.println(newHead.data+"<<<<<<<<<");
        // System.out.print("<--"+head.data);
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
