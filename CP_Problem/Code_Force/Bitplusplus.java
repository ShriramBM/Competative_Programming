import java.util.Scanner;

public class Bitplusplus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        int x = 0;
        while(t-->0){
            String bit = sc.next();
            if(bit.equals("X++") || bit.equals("++X")) x++;
            else x--;
        }
        System.out.println(x);
    }
}
