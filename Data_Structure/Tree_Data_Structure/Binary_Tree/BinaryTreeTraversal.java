public class BinaryTreeTraversal {
    
    
    public static void preOrderTraversal(Node root){
        if(root == null){
            return;
        }
        // Before Two recursion
        System.out.println(root.data);
        
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static void inOrderTraversal(Node root){
        if(root == null){
            return;
        }
        inOrderTraversal(root.left);
        
        // Inorder are between two Recursion
        System.out.println(root.data);

        inOrderTraversal(root.right);

    }

    public static void postOrderTraversal(Node root){
        if(root == null){
            return;
        }

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);

        // PostOrder are after two recursion
        System.out.println(root.data);
    }



    public static void main(String[] args) {
        // The Node and createTree are present in BinaryTreeCreation.java
        
        Node root = BinaryTreeCreation.createTree();
        System.out.println("Preorder Traversal");
        preOrderTraversal(root);

        System.out.println("InOrder Traversal");
        inOrderTraversal(root);

        System.out.println("PostOrder Traversal");
        postOrderTraversal(root);
    
    }
}
