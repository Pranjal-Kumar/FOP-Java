package helloworld;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

public class SpiralLevelOrder {
    public static void main(String[] args) {

        BinaryTreeNode root = takeInputLevelWise();
        System.out.println("Spiral Order:");
        SpiralOrder(root);
        System.out.println("\nSpiral Order Iterative:");
        spiralIterative(root);


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

    public  static  int height(BinaryTreeNode root){

        if(root == null){
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int ans = 1 + Math.max(leftHeight,rightHeight);

        return ans;

    }

    public static void SpiralOrder(BinaryTreeNode root){

        int levels = height(root);
        boolean ltr = false;

        for(int i=1;i<=levels;i++){
            printSpiral(root,1,i,ltr);
            ltr = !ltr;
        }

    }

    public static void printSpiral(BinaryTreeNode root, int curr, int exp, boolean ltr){

        if(root == null){
            return;
        }

        if(curr == exp){
            System.out.print(root.data + " ");
        }
        else{
            if(ltr){
                printSpiral(root.left,curr+1,exp,ltr);
                printSpiral(root.right,curr+1,exp,ltr);
            }
            else{
                printSpiral(root.right,curr+1,exp,ltr);
                printSpiral(root.left,curr+1,exp,ltr);
            }
        }

    }

    public static void spiralIterative(BinaryTreeNode root){

        if(root == null){
            return;
        }

        Stack<BinaryTreeNode> curr = new Stack();
        Stack<BinaryTreeNode> next = new Stack();
        curr.push(root);
        boolean ltr = false;

        while(!curr.isEmpty()){
            BinaryTreeNode node = curr.pop();
            System.out.print(node.data + " ");

            if(ltr) {
                if (node.left != null) {
                    next.push(node.left);
                }
                if (node.right != null) {
                    next.push(node.right);
                }
            }

            else{
                if(node.right != null){
                    next.push(node.right);
                }
                if(node.left != null){
                    next.push(node.left);
                }
            }

            if(curr.isEmpty()){
                ltr = !ltr;
                Stack<BinaryTreeNode> temp = curr;
                curr = next;
                next = temp;
            }
        }

    }

}
