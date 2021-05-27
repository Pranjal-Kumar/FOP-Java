package helloworld;

import java.util.Scanner;
import java.util.Stack;

public class DFSTreeTraversal {
    public static void main(String[] args) {
//        BinaryTreeNode root = new BinaryTreeNode(1);
//        root.left = new BinaryTreeNode(2);
//        root.right = new BinaryTreeNode(3);
//        root.left.left = new BinaryTreeNode(4);
//        root.left.right = new BinaryTreeNode(5);
//        root.right.left = new BinaryTreeNode(6);
//        root.right.right = new BinaryTreeNode(7);

        BinaryTreeNode root = takeInput();

//        System.out.println("Pre Order:");
//        preOrder(root);
        System.out.println("\nIn Order:");
        inOrder(root);
//        System.out.println("\nPost Order:");
//        postOrder(root);

        System.out.println("\nIn Order Using Stack:");
        inOrderIterative(root);

//        print(root);

    }

    public static void print(BinaryTreeNode root){

        if(root == null){
            return;
        }

        System.out.print(root.data + ": ");
        if(root.left != null){
            System.out.print("L: " + root.left.data + " ");
        }
        else{
            System.out.print("L: Null ");
        }

        if(root.right != null){
            System.out.print("R: " + root.right.data + " ");
        }
        else{
            System.out.print("R: Null ");
        }

        print(root.left);
        print(root.right);

    }

    public static BinaryTreeNode takeInput(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Data:");
        int data = s.nextInt();

        if(data == -1){
            return null;
        }

        BinaryTreeNode root = new BinaryTreeNode(data);
        root.left = takeInput();
        root.right = takeInput();

        return root;

    }

    public static void inOrderIterative(BinaryTreeNode root){

        Stack<BinaryTreeNode> s = new Stack();
        BinaryTreeNode curr = root;

        while(curr != null || s.size()>0){
            while(curr != null){
                s.push(curr);
                curr = curr.left;
            }
            curr = s.pop();
            System.out.print(curr.data + " ");
            curr = curr.right;
        }

    }

    public static void preOrder(BinaryTreeNode root){

        if(root == null){
            return ;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

    public static void inOrder(BinaryTreeNode root){

        if(root == null){
            return ;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

    }

    public static void postOrder(BinaryTreeNode root){

        if(root == null){
            return ;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");

    }

}
