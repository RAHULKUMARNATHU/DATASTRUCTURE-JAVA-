/*
 * Delete Node In LL
Send Feedback
You have been given a linked list of integers. Your task is to write a function that deletes a node from a given position, 'POS'.
Note :
Assume that the Indexing for the linked list always starts from 0.

If the position is greater than or equal to the length of the linked list, you should return the same linked list without any change.
Illustration :
The following images depict how the deletion has been performed.
Image-I :
Alt txt

Image-II :
Alt txt

Input format :
The first line contains an Integer 'T' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains the elements of the linked list separated by a single space. 

The second line of each test case contains the integer value of 'POS'. It denotes the position in the linked list from where the node has to be deleted.
 Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
Output format :
For each test case/query, print the resulting linked list of integers in a row, separated by a single space.

Output for every test case will be printed in a separate line.
Note:
You are not required to print the output, it has already been taken care of. Just implement the function. 
Constraints :
1 <= T <= 10^2
0 <= N <= 10^5
POS >= 0

Time Limit: 1sec
Sample Input 1 :
1 
3 4 5 2 6 1 9 -1
3
Sample Output 1 :
3 4 5 6 1 9
Sample Input 2 :
2
3 4 5 2 6 1 9 -1
0
10 20 30 40 50 60 -1
7
Sample Output 2 :
4 5 2 6 1 9
10 20 30 40 50 60
 */



import java.util.Scanner;

class LinkedList<T> {
    T data;
    LinkedList<T> next;

    LinkedList(T data) {
        this.data = data;
    }

}

public class DeleteIthNode {
    public static LinkedList<Integer> deleteIthNode(LinkedList<Integer> head, int position) {

        int count = 1;
        LinkedList<Integer> prev = head, temp;
        if (position == 0) {
            head = head.next;
            return head;
        } else {
            while (count != position - 1 && prev.next != null) {
                prev = prev.next;
                count++;
            }
            if (prev.next != null) {
                // temp = prev.next;
                // prev.next = temp.next;
                // temp.next = null;
                prev.next = prev.next.next;

            }
        }

        return head;
    }

    public static void printLL(LinkedList<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;

        }
    }

    public static LinkedList<Integer> takeInput() {
        LinkedList<Integer> head = null, tail = null;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        while (data != -1) {
            LinkedList<Integer> currentNode = new LinkedList<Integer>(data);
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
        LinkedList<Integer> head = takeInput();
        head = deleteIthNode(head, 3);
        printLL(head);

    }

}
