public class BrowserHistory {

    public static class Node<T> {
        T url;
        Node<T> next, prev;

        Node(T url) {
            this.url = url;
        }
    }

    Node<String> head;

    /* This is a constructor ---- constructor name and class name should be same */
    public BrowserHistory(String homePage) {
        head = new Node<String>(homePage);

    }

    public void visit(String url) {

        Node<String> currentNode = new Node<String>(url);
        head.next = currentNode;
        currentNode.prev = head;
        head = head.next;

    }

    public String back(int steps) {

        while (head.prev != null && steps-- > 0) {
            
            head = head.prev;

        }
        return head.url;

    }

    public String forward(int steps) {

        while (head.next != null && steps-- > 0) {
            head = head.next;

        }
        return head.url;

    }

    public static void main(String[] args) {
        BrowserHistory bh = new BrowserHistory("homePage");
        bh.visit("url1");
        bh.visit("url2");
        bh.visit("url3");
        bh.visit("url4");

        System.out.println("Current Page: " + bh.head.url);

        String forwardPage = bh.forward(2);

        
        System.out.println(forwardPage);
        
        String backPage = bh.back(2);
        bh.visit("url5");
        System.out.println("Current Page: " + bh.head.url);
        System.out.println(backPage);

    }
}
