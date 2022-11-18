


class Binary{

    private int arr[] = new int[4];
    public void  binaryMethod(int n){
        if(n<1){
            for(int a: arr){
                System.out.print(a+" ");
            }
            System.out.println();
            return;
        }
        arr[n-1] = 0;
        binaryMethod(n-1);
        arr[n-1]=1;
        binaryMethod(n-1);
       
    }
}


public class Bcktrac {



   
    public static void main(String[] args) {
        Binary b = new Binary();
        b.binaryMethod(4);
    }
}
