import java.util.Scanner;

class Node {
    public int data;
    Node left=null, right=null;

    public Node(){};

    public Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}


public class BinaryTreeCreation{

    public static Node createTree(){
        // First create a node

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data ");
        int data = sc.nextInt();
        

        Node new_node = null;
        if(data == -1){
            return new_node;
        }
        new_node = new Node();
        new_node.data = data;

        System.out.println("Enter the Left side of "+data);
        new_node.left = createTree();

        System.out.println("Enter the Right side of "+data);
        new_node.right = createTree();
        
        return new_node;

    }

    public static void main(String[] args) {
        createTree();
    }
    
} 