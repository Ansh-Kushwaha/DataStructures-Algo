import java.util.Scanner;
public class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    public LinkedList(int n) {
        if(n<=0) {
            System.out.println("Invalid size.");
            return;
        }
        else {
            head = null;
            Scanner scan = new Scanner(System.in);
            Node temp = new Node(), last;
            System.out.print("Enter data of element 1 : ");
            temp.data = scan.nextInt();
            temp.next = head;
            head = temp;
            last = temp;
            if(n == 1) {
                scan.close();
                return;
            }
            else {
                for(int i = 2; i <= n; i++) {
                    System.out.print("Enter data of element " + i + " : ");
                    Node temp1 = new Node();
                    temp1.data = scan.nextInt();
                    temp1.next = last.next;
                    last.next = temp1;
                    last = temp1;
                }
            }
            scan.close();
        }
    }

    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
