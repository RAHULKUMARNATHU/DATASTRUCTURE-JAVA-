/*Delete every N nodes
Send Feedback
You have been given a singly linked list of integers along with two integers, 'M,' and 'N.' Traverse the linked list such that you retain the 'M' nodes, then delete the next 'N' nodes. Continue the same until the end of the linked list.
To put it in other words, in the given linked list, you need to delete N nodes after every M nodes.
Note :
No need to print the list, it has already been taken care. Only return the new head to the list.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains the elements of the singly linked list separated by a single space.

The second line of input contains two integer values 'M,' and 'N,' respectively. A single space will separate them.
 Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
Output format :
For each test case/query, print the elements of the updated singly linked list.

Output for every test case will be printed in a seperate line.
Constraints :
1 <= t <= 10^2
0 <= P <= 10^5
Where P is the size of the singly linked list.
0 <= M <= 10^5
0 <= N <= 10^5 

Time Limit: 1sec
Sample Input 1 :
1
1 2 3 4 5 6 7 8 -1
2 2
Sample Output 1 :
1 2 5 6
Sample Input 2 :
2
10 20 30 40 50 60 -1
0 1
1 2 3 4 5 6 7 8 -1
2 3
Sample Output 2 :
1 2 6 7
Explanation of Sample Input 2 :
For the first query, we delete one node after every zero elements hence removing all the items of the list. Therefore, nothing got printed.

For the second query, we delete three nodes after every two nodes, resulting in the final list, 1 -> 2 -> 6 -> 7. */

import java.util.Scanner;

public class DeleteEveryNNode {

    public static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }

    }

    public static Node<Integer> skipMDeleteN(Node<Integer> head, int m, int n) {
        if (head == null || m == 0) {
            return null;
        }
        if(n == 0){
            return head ;
        }

        // int count = 1;
        Node<Integer> currentHead = head, prev = null;
        while (currentHead != null) {
            int skip = 1;
            int take = 1;
            while (currentHead != null & take < m) {
                if (prev == null) {
                    prev = currentHead;
                } else {
                    prev.next = currentHead;
                }
                currentHead = currentHead.next;
                take += 1;

            }
            while (currentHead != null && skip < n) {
                currentHead = currentHead.next;
                skip += 1;
            }
        }
        return head;
    }

    public static Node<Integer> takeInput(Scanner sc) {
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }
        Node<Integer> head = new Node<Integer>(data);
        head.next = takeInput(sc);
        return head;
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
        Node<Integer> head = takeInput(sc);
        head = skipMDeleteN(head, 0, 1);
        printLL(head);

    }
}