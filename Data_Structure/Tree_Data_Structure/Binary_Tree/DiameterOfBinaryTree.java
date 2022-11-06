// The diameter/width of a tree is defined as the number of nodes on the longest path between two end nodes. 

// The diagram below shows two trees each with a diameter of nine, the leaves that form the ends of the longest path are shaded (note that there is more than one path in each tree of length nine, but no path longer than nine nodes).
public class DiameterOfBinaryTree {

    // Node class present in BinaryTreecreation.java file
    public static int height(Node root, int count) {
        if (root == null) {
            return count;
        }

        return Math.max(
                height(root.left, count + 1),
                height(root.right, count + 1));
    }

    public static int diameter(Node root) {
        // base case if tree is empty
        if (root == null)
            return 0;

        // get the height of left and right sub-trees
        int lheight = height(root.left,0);
        int rheight = height(root.right,0);

        // get the diameter of left and right sub-trees
        int ldiameter = diameter(root.left);
        int rdiameter = diameter(root.right);

        /*
         * Return max of following three
         * 1) Diameter of left subtree
         * 2) Diameter of right subtree
         * 3) Height of left subtree + height of right
         * subtree + 1
         */
        return Math.max(lheight + rheight+1,
                Math.max(ldiameter, rdiameter));

    }

    public static void main(String[] args) {

        Node root = BinaryTreeCreation.createTree();
        System.out.println(diameter(root));

    }
}
