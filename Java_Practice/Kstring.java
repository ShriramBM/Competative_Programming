
class Ogic{
    public int arr[] = new int[3];
    public void kString(int n, int k){
        if(n<1){
        
            for (int i : arr) {
                System.out.print(i+" ");
            }
            System.out.println();
            return;
        }

        for(int j=0;j<k;j++){
            arr[n-1]=j;
            kString(n-1,k);
        }


    }
}

public class Kstring {



    public static void main(String[] args) {
        Ogic o = new Ogic();
        o.kString(3,2);
        
    }
}
