import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PermutationArray {

    public static List<List<Integer>> result = new ArrayList<>();

    public static void permutationLogic(List<Integer> arr, List<Integer> perm) {

        for (int i = 0; i < arr.size(); i++) {

            ArrayList<Integer> perms = new ArrayList<>();
            perms.addAll(perm);
            perms.add(arr.get(i));

            ArrayList<Integer> nextArr = new ArrayList<>();
            nextArr.addAll(arr.subList(0, i));
            nextArr.addAll(arr.subList(i + 1, arr.size()));
            Collections.sort(perms);
            permutationLogic(nextArr, perms);
        }
        if (perm.size() == 3) {
            if(!result.contains(perm)){
                int sum = perm.stream().reduce(0, (pre, cur)-> pre+cur);
                if(sum == 0){
                    result.add(perm);
                }
            }
        }
    }

    public static void main(String[] args) {
        permutationLogic(Arrays.asList(-1, 0, 1, 2, -1, -4), new ArrayList<>());
        System.out.println(result);
    }

}
