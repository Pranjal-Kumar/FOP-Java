package helloworld;

public class BinaryTree {
    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(0);

        root.left = new BinaryTreeNode(1);
        root.right = new BinaryTreeNode(2);
        root.left.left = new BinaryTreeNode(3);
        root.left.right = new BinaryTreeNode(4);
        root.right.left = new BinaryTreeNode(5);
        root.left.left.right = new BinaryTreeNode(6);

        System.out.println("Height: " + getHeight(root));

    }

    public static int getHeight(BinaryTreeNode root){
        if(root == null){
            return 0;
        }

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        int ans = Math.max(leftHeight,rightHeight) + 1;
        return ans;
    }

}
