package helloworld;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeDiameter {

    public static void main(String[] args) {

        BinaryTreeNode root = takeInputLevelWise();
        System.out.println("Diameter: " + diameter(root));

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

    public  static  int diameter(BinaryTreeNode root){

        if(root == null){
            return 0;
        }

        int opt1 = height(root.left) + height(root.right);
        int opt2 = diameter(root.left);
        int opt3 = diameter(root.right);

        int ans = Math.max(opt1, Math.max(opt2,opt3));

        return ans;

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

}
