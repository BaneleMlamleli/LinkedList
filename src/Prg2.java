/* File: Prg2.java
 * Note: Java program to implement a Singly Linked List
 */
import java.io.*;
public class Prg2 {
    Node head; // head of list Linked list Node.
    // This inner class is made static so that main() can access it
    static class Node {
        int data;
        Node next;
        // Constructor 
        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Method to insert a new node 
    public static Prg2 insert(Prg2 list, int data) {
        // Create a new node with given data
        Node new_node = new Node(data);
        new_node.next = null;
        // If the Linked List is empty, then make the new node as head
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            // Else traverse till the last node and insert the new_node there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            // Insert the new_node at last node 
            last.next = new_node;
        }
        // Return the list by head 
        return list;
    }

    // Method to print the Prg2. 
    public static void printList(Prg2 list)
    {
        Node currNode = list.head;
        System.out.print("Prg2: ");
        // Traverse through the Prg2 
        while (currNode != null) {
            // Print the data at current node 
            System.out.print(currNode.data + " ");
            // Go to next node 
            currNode = currNode.next;
        }
    }

    // **************MAIN METHOD**************
    // method to create a Singly linked list with n nodes 
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        Prg2 list = new Prg2();
        // ******INSERTION******
        // Insert the values 
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);
        // Print the Prg2
        printList(list);
    }
}
