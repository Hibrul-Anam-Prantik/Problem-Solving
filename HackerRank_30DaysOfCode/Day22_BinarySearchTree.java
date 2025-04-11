package HackerRank_30DaysOfCode;

import java.util.*;
import java.io.*;
class Node0{
    Node0 left,right;
    int data;
    Node0(int data){
        this.data=data;
        left=right=null;
    }
}
class Day22_BinarySearchTree{

    public static int getHeight(Node0 root){
        //Write your code here
        if (root == null) return -1;
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static Node0 insert(Node0 root,int data){
        if(root==null){
            return new Node0(data);
        }
        else{
            Node0 cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node0 root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}
