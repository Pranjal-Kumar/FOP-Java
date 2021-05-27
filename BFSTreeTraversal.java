package helloworld;

import java.util.*;

public class BFSTreeTraversal {
    public static void main(String[] args) {

        BinaryTreeNode root = takeInputLevelWise();
////        LevelOrder(root);
//        BFSIterative(root);

        System.out.println("Left View: ");
        printLeftView(root);
        System.out.println("Right View: ");
        printRightView(root);

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

    public int findMax(BinaryTreeNode root)
    {
        //Write your code here.
        if(root == null){
            return -1;
        }

        int leftMax, rightMax;
        int max = root.data;

        if(root.left != null){
            leftMax = findMax(root.left);
            max = Math.max(leftMax, max);
        }

        if(root.right != null){
            rightMax = findMax(root.right);
            max = Math.max(rightMax, max);
        }

        return max;

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

    public static void LevelOrder(BinaryTreeNode root){

        int levels = height(root);

        for(int i=1;i<=levels;i++){
            BreadthFirstSearch(root,1,i);
        }

    }

    public static void BreadthFirstSearch(BinaryTreeNode root, int curr, int exp){

        if(root == null){
            return;
        }

        if(curr == exp){
            System.out.print(root.data + " ");
        }
        else{
            BreadthFirstSearch(root.left,curr+1,exp);
            BreadthFirstSearch(root.right,curr+1,exp);
        }

    }

    public static void printLeftView(BinaryTreeNode root){

        Queue<BinaryTreeNode> q = new LinkedList();
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                BinaryTreeNode temp = q.poll();
                if(i == 0) {
                    System.out.print(temp.data + " ");
                }

                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }

            }
            System.out.println();
        }

    }

    public static void printRightView(BinaryTreeNode root){

        Queue<BinaryTreeNode> q = new LinkedList();
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                BinaryTreeNode temp = q.poll();
                if(i == size-1) {
                    System.out.print(temp.data + " ");
                }

                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }

            }
            System.out.println();
        }

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

}
