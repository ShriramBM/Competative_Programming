import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

public class FindAnsister {
    static List<Integer> copy = new ArrayList<>();

    public static void treeAnsister(List<Integer> ansis, Node root, int val) {
        ArrayList<Integer> rec = new ArrayList<>();
        if (root == null) {
            return;
        }
        if(root.data == val){
            copy = ansis.stream().map((x)->x).collect(Collectors.toList());
        }

        // Storing the Anisistor details into an array
        rec.addAll(ansis);
        rec.add(root.data);
     
        

        treeAnsister(rec,  root.left,val);
        treeAnsister(rec,  root.right,val);

    }
    public static void main(String[] args) {
        Node root = BinaryTreeCreation.createTree();
        treeAnsister(new ArrayList<>(),  root, 4);
        System.out.println(copy);
    }

}
