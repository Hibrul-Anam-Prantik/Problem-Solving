package HackerRank_30DaysOfCode;

import java.io.*;
import java.util.*;

public class Day15_LinkedList
{

//    class Solution {

        public static  Node insert(Node head,int data) {
            //Complete this method
            Node newNode = new Node(data);

            // If the list is empty, the new node becomes the head
            if (head == null) {
                return newNode;
            }

            // Traverse the list to find the last node
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }

            // Append the new node at the end of the list
            current.next = newNode;

            // Return the head of the list
            return head;
        }

        public static void display(Node head) {
            Node start = head;
            while(start != null) {
                System.out.print(start.data + " ");
                start = start.next;
            }
        }

        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            Node head = null;
            int N = sc.nextInt();

            while(N-- > 0) {
                int ele = sc.nextInt();
                head = insert(head,ele);
            }
            display(head);
            sc.close();
        }
    }

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
