import java.util.Scanner;

public class GravityFlipBinarySerachTree {
    class Node {
		int key;
		Node left, right;

		public Node(int item)
		{
			key = item;
			left = right = null;
		}
	}

	// Root of BST
	Node root;

	// Constructor
	GravityFlipBinarySerachTree() { root = null; }

	GravityFlipBinarySerachTree(int value) { root = new Node(value); }

	// This method mainly calls insertRec()
	void insert(int key) { root = insertRec(root, key); }

	// A recursive function to
	// insert a new key in BST
	Node insertRec(Node root, int key)
	{
		// If the tree is empty,
		// return a new node
		if (root == null) {
			root = new Node(key);
			return root;
		}

		// Otherwise, recur down the tree
		else if (key <= root.key)
			root.left = insertRec(root.left, key);
		else if (key > root.key)
			root.right = insertRec(root.right, key);

		// Return the (unchanged) node pointer
		return root;
	}

	// This method mainly calls InorderRec()
	void inorder() { inorderRec(root); }

	// A utility function to
	// do inorder traversal of BST
	void inorderRec(Node root)
	{
		if (root != null) {
			inorderRec(root.left);
			System.out.print(root.key + " ");
			inorderRec(root.right);
		}
	}
    public static void main(String[] args) {
        GravityFlipBinarySerachTree tree = new GravityFlipBinarySerachTree();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++) tree.insert(sc.nextInt());
        tree.inorder();
        sc.close();
    }

}
