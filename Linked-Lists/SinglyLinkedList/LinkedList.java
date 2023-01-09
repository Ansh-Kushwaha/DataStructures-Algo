package SinglyLinkedList;

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

    public boolean isFull() {
        Node temp = new Node();
        if(temp == null)
            return true;
        return false;
    }

    public boolean isEmpty() {
        if(head == null)
            return true;
        return false;
    }

    public int length() {
        Node temp = head;
        int l = 0;
        while(temp != null) {
            temp = temp.next;
            l++;
        }
        return l;
    }

    public int search(int x) {
        Node temp = head;
        int pos = 1;
        while(temp != null) {
            if(temp.data == x)
                return pos;
            else
                temp = temp.next;
        }
        return -1;
    }

    public int find(int k) {
        Node temp = head;
        int len = length();
        if(k < 1 || k > len)
            return -1;
        else
            for(int i = 0; i < k; i++)
                temp = temp.next;
        return temp.data;
    }

    public void delete(int k) { //delete kth position
        if(head == null)
            return;
        if(k < 1 || k > length())
            return;
        else if(k == 1) {
            System.out.println("Deleted " + head.data);
            head = head.next;
        }
        else {
            Node temp1 = head, temp2;
            for(int i = 1; i < k-1; i++)
                temp1 = temp1.next;
            temp2 = temp1.next;
            temp1.next = temp2.next;
            System.out.println("Deleted " + temp2.data);
        }
    }

    public void output() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
