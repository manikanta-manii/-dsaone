package Tress;

import java.util.Scanner;

class Node{
    Node left,right;
    int data;
    public Node(int data){
        this.data=data;
    }
}

public class BinaryTreeCreation {
    static Scanner sc=null;
    public static void main(String[] args) {
        sc=new Scanner(System.in);
        Node root=createTree();
        System.out.println("Inorder :");
        inOrder(root);
        System.out.println("preorder :");
        preOrder(root);
        System.out.println("Postorder :");
        postOrder(root);
        System.out.println("height :"+heightOfTree(root));

    }
    static Node createTree(){
        Node root=null;
        System.out.println("enter data:");
        int data=sc.nextInt();
        root=new Node(data);
        if(data==-1) {
            return null;
        }
        System.out.println("enter left data for :"+data);
        root.left=createTree();
        System.out.println("enter right data for :"+data);
        root.right=createTree();
        return root;
    }
    static void inOrder(Node root){
        if(root==null)return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    static void preOrder(Node root){
        if(root==null)return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void postOrder(Node root){
        if(root==null)return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");

    }
    static int heightOfTree(Node root){
        if(root==null) return 0;
        return Math.max(heightOfTree(root.left),heightOfTree(root.right))+1;


    }



}