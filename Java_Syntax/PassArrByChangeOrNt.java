
import java.util.Arrays;
import java.util.List;

// The program is to check whether the array will change in function or not

public class PassArrByChangeOrNt{

    public static void check(int []arr, List<Integer> a){
        arr[0] = 200;
        a.set(0, 500);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6};
        List<Integer> arrlist = Arrays.asList(1,2,3,100);
        check(arr, arrlist);

        
        System.out.println(arr[0]+" "+ arrlist.get(0));

    }
    // At last we concluded that normal array change i.e pass by value
    // Arraylist also changes
}