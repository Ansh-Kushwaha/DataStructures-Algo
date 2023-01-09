package LinearList;

import java.util.Scanner;

public class LinearList {
    private int size;
    private int currSize = 0;
    private int []elements;
    public LinearList() {
        create();
    }

    public LinearList(int n) {
        size = n;
        elements = new int[n];
    }

    private void create() {
        System.out.println("Enter size of list :");
        Scanner input = new Scanner(System.in);
        size = input.nextInt();
        elements = new int[size];
        for(int i = 0; i < size; i++) {
            elements[i] = input.nextInt();
            currSize++;
        }
        input.close();
    }

    public boolean isEmpty() {
        if(size == 0)
            return true;
        return false;
    }

    public boolean isFull() {
        if(currSize == size)
            return true;
        return false;
    }

    public int size() {
        return currSize;
    }

    public int search(int n) {
        for(int i = 0; i < currSize; i++)
            if(elements[i] == n)
                return i;
        return -1;
    }

    public void insert(int k, int x) { //insert at kth position
        if(!isFull()) {
            for(int i = currSize; i > k-2; i--) {
                elements[i] = elements[i-1];
            }
            elements[k-1] = x;
            currSize++;
        }
        else
            System.out.println("List is full.");
    }

    public void delete(int k) { //delete from kth position
        if(!isEmpty()) {
            int t = elements[k-1];
            for(int i = k-1; i < currSize; i++)
                elements[i] = elements[i+1];
                currSize--;
            System.out.println("Deleted " + t);
        }
        else
            System.out.println("List is empty.");
    }

    public void reverse() {
        if(!isEmpty()) {
            for(int i = 0; i < currSize / 2; i++) {
                int t = elements[i];
                elements[i] = elements[currSize - i - 1];
                elements[currSize - i - 1] = t;
            }
        }
    }

    public void print() {
        for(int i = 0; i < currSize; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinearList l1 = new LinearList(5);
        l1.insert(1, 3);
        l1.print();
        l1.delete(3);
        l1.print();
    } 
}