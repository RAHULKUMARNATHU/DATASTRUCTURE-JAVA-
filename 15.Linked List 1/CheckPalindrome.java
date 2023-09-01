import java.util.Scanner;

public class CheckPalindrome {

    public static int length(Node<Integer> head) {

        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    public static boolean isPalindrome(Node<Integer> head) {

        if (head == null) {
            return true;
        }
        Node<Integer> h1 = head, h2 = head;

        int len = length(head);

        for (int i = 0; i < (len / 2); i++) {
            h2 = h2.next;
        }
        h2 = reverse(h2);

        while(h1 != null && h2 !=null){
            if(! h1.data.equals(h2.data))
            return false;
            h1 = h1.next ;
            h2 = h2.next;
        }

        return true;
    }

    public static Node<Integer> reverse(Node<Integer> head) {

        Node<Integer> curr = head, next = null, prev = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
     public static Node<Integer> takeInput() {
        Node<Integer> head = null, tail = null;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
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
        Node<Integer > head = takeInput();
    //    int count =  length(head);
    boolean check = isPalindrome(head);
       System.out.println(check);


    }


}



/*

	Following is the Node class already written for the Linked List

	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*/

// public class Solution {

// 	public static boolean isPalindrome(LinkedListNode<Integer> head) {
// 		//Your code goes here
        
//         if(head == null)
//             return true;
//         LinkedListNode<Integer> h1 = head, h2 = head;
//         int len = length(head);
        
//         for(int i=0; i<(len/2); i++){
//             h2 = h2.next;
//         }
//         h2 = reverse(h2);
        
//         while(h1 != null && h2 != null){
//             if(!h1.data.equals(h2.data))
//                 return false;
//             h1 = h1.next;
//             h2 = h2.next;
//         }
        
//         return true;
// 	}
    
//     public static int length(LinkedListNode<Integer> head){
// 		LinkedListNode<Integer> temp = head;
//         int len=0 ;
//         while(temp!=null){
//             if(temp.data != -1)
//                 len++;
//             else
//                 break;
//             temp = temp.next;
//         }
//         return len;
// 	}
    
//     public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head){
//         LinkedListNode<Integer> curr = head, next=null, prev = null;
//         while(curr != null){
//             next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }
//     	return prev;
// 	}

// }