import java.io.*;

class recursion {
    static Node head;

    static class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    static Node reverse(Node head)
    {
        //Implement your function here
    }

    /* Function to print linked list */
    static void print()
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static void push(int data)
    {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }

    /* Driver program to test above function*/
    public static void main(String args[])
    {
        /* Start with the empty list */

        push(20);
        push(4);
        push(15);
        push(85);

        System.out.println("Given linked list");
        print();

        head = reverse(head);

        System.out.println("Reversed linked list");
        print();
    }
}