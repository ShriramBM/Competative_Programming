// A utility class to pass height object
class Height {
    int h;
}

public class DiameterGeeksWeb {
    // Class to print the Diameter

        // root of the node
        Node root;

        // define height =0 globally and call
        // diameterOpt(root,height) from main
        int diameterOpt(Node root, Height height) {
            // lh --> Height of left subtree
            // rh --> Height of right subtree
            Height lh = new Height(), rh = new Height();

            if (root == null) {
                height.h = 0;
                return 0; // diameter is also 0
            }
            /*
             * ldiameter --> diameter of left subtree
             * rdiameter --> Diameter of right subtree
             * Get the heights of left and right subtrees
             * in lh and rh. And store the returned values in
             * ldiameter and ldiameter
             */
            int ldiameter = diameterOpt(root.left, lh);
            int rdiameter = diameterOpt(root.right, rh);

            // Height of current node is max of heights of left
            // and right subtrees plus 1
            // Need to learn this techque
            height.h = Math.max(lh.h, rh.h) + 1;

            return Math.max(lh.h + rh.h + 1,
                    Math.max(ldiameter, rdiameter));
        }

        // A wrapper over diameter(Node root)
        int diameter() {
            Height height = new Height();
            return diameterOpt(root, height);
        }



    // Driver Code
    public static void main(String args[]) {
        // creating a binary tree and entering the nodes
        DiameterGeeksWeb tree = new DiameterGeeksWeb();
        tree.root = BinaryTreeCreation.createTree();
        System.out.println(tree.diameter());

    }

}
