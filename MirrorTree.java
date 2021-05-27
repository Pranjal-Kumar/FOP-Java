package helloworld;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MirrorTree {
    public static void main(String[] args) {

        BinaryTreeNode root = takeInputLevelWise();
        System.out.println("Original Tree:");
        BFSIterative(root);
        System.out.println("Reversed Tree:");
        mirror(root);
        BFSIterative(root);

    }

    public static void mirror(BinaryTreeNode root){

        if(root == null){
            return;
        }

        mirror(root.left);
        mirror(root.right);
        BinaryTreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        return;

    }

    public static BinaryTreeNode takeInputLevelWise(){

        Queue<BinaryTreeNode> q = new LinkedList();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Data:");
        int data = s.nextInt();

        if(data == -1){
            return null;
        }

        BinaryTreeNode root = new BinaryTreeNode(data);
        q.add(root);
        while(!q.isEmpty()){
            BinaryTreeNode curr = q.remove();
            System.out.println("Enter Left of " + curr.data + ": ");
            int left = s.nextInt();
            if(left != -1){
                curr.left = new BinaryTreeNode(left);
                q.add(curr.left);
            }
            System.out.println("Enter right of " + curr.data + ": ");
            int right = s.nextInt();
            if(right != -1){
                curr.right = new BinaryTreeNode(right);
                q.add(curr.right);
            }

        }
        return root;
    }

    public static void BFSIterative(BinaryTreeNode root){

        Queue<BinaryTreeNode> q = new LinkedList();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            BinaryTreeNode curr = q.remove();
            if(curr == null){
                System.out.println();
                if(!q.isEmpty()){
                    q.add(null);
                }
            }
            else {
                System.out.print(curr.data + " ");

                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }

}
