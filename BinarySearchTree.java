package helloworld;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinarySearchTree {
    public static void main(String[] args) {
        BinaryTreeNode root = takeInputLevelWise();
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter key to be searched: ");
//        int key = s.nextInt();
//        System.out.println("Is key present: " + searchBST(root, key));
//        int lb = 8;
//        int ub = 14;
//        searchRange(root, lb, ub);

//        insertNode(root,5);
//        BFSIterative(root);
//        deleteNode(root,469);
//        BFSIterative(root);

//        int a = 5;
//        int b = 8;
//        System.out.println("Lowest Common Ancestor: " + LowestCommonAncestor(root,a,b));
//        System.out.println("Lowest Common Ancestor in BST: " + LowestCommonAncestorInBST(root,a,b));

        int key = 13;
        FloorCeil(root,key);
        System.out.println("Ceil of "+ key + ": " + ceil);
        System.out.println("Floor of " + key + ": " + floor);

    }

    public static BinaryTreeNode insertNode(BinaryTreeNode root, int data){

        if(root == null){
            BinaryTreeNode node = new BinaryTreeNode(data);
            return node;
        }

        if(data < root.data){
            root.left = insertNode(root.left, data);
        }
        else{
            root.right = insertNode(root.right, data);
        }

        return root;

    }

    public static BinaryTreeNode deleteNode(BinaryTreeNode root, int data){

        if(root == null){
            return null;
        }

        if(data < root.data){
            root.left = deleteNode(root.left, data);
            return root;
        }
        else if(data > root.data){
            root.right = deleteNode(root.right, data);
            return root;
        }
        else{
            if(root.left == null && root.right == null){
                return null;
            }
            else if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            else{
                BinaryTreeNode minNode = root.right;
                while(minNode.left != null){
                    minNode = minNode.left;
                }
                root.data = minNode.data;
                root.right = deleteNode(root.right, minNode.data);
                return root;
            }
        }
    }


    public static int LowestCommonAncestorInBST(BinaryTreeNode root, int a, int b){
        if(root == null){
            return -1;
        }

        if(root.data == a || root.data == b){
            return root.data;
        }

        if(root.data < a && root.data < b){
            return LowestCommonAncestorInBST(root.left, a, b);
        }
        else if(root.data > a && root.data > b){
            return LowestCommonAncestorInBST(root.right, a, b);
        }
        else{
            return root.data;
        }


    }

    public static  int LowestCommonAncestor(BinaryTreeNode root, int a, int b){

        if(root == null){
            return -1;
        }

        if(root.data == a || root.data == b){
            return root.data;
        }

        int left = LowestCommonAncestor(root.left, a, b);
        int right = LowestCommonAncestor(root.right, a, b);

        if(left == -1 && right == -1){
            return -1;
        }
        else if(left == -1){
            return right;
        }
        else if(right == -1){
            return left;
        }
        else{
            return root.data;
        }

    }

    public static boolean searchBST(BinaryTreeNode root, int key){

        if(root == null){
            return false;
        }

        if(root.data == key){
            return true;
        }
        else if(key < root.data){
            return searchBST(root.left, key);
        }
        else{
           return searchBST(root.right, key);
        }
    }


    static int ceil = Integer.MAX_VALUE;
    static int floor = Integer.MIN_VALUE;
    public static void FloorCeil(BinaryTreeNode root, int key){
        if(root == null){
            return;
        }

        if(root.data == key){
            ceil = root.data;
            floor = root.data;
            return;
        }
        else if(root.data > key){
            ceil = Math.min(ceil, root.data);
            FloorCeil(root.left, key);
        }
        else{
            floor = Math.max(floor, root.data);
            FloorCeil(root.right, key);
        }

    }

    public static void searchRange(BinaryTreeNode root, int lb, int ub){

        if(root == null){
            return;
        }

        if(lb <= root.data && ub >= root.data ){
            searchRange(root.left, lb, ub);
            System.out.print(root.data + " ");
            searchRange(root.right, lb, ub);
        }
        else if(root.data < lb){
            searchRange(root.right, lb, ub);
            System.out.print(root.data + " ");
        }
        else if(root.data > ub){
            searchRange(root.left, lb, ub);
            System.out.print(root.data + " ");
        }
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
