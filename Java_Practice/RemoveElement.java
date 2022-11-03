// 

public class RemoveElement {

    public static void swap(int[] nums, int i, int j) {
        for (int a = i; a < j; a++) {
            nums[a] = nums[a + 1];
        }
    }

    public static int removeElement(int[] nums, int val) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] == val) {
                swap(nums, i, len - 1);
                i--;
                --len;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int arr[] = {0,1,2,2,3,0,4,2};
        int l = removeElement(arr, 2);
        for(int i=0;i<l;i++){
            System.out.println(arr[i]);
        }
    }

}