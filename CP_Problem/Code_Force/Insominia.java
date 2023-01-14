import java.util.Scanner;

public class Insominia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int k = sc.nextInt();
        int m  = sc.nextInt();
        int n = sc.nextInt();
        int d = sc.nextInt();
        int count=0;
        for(int i=1;i<=d;i++){
            if(i%l==0 || i%k ==0 || i%m ==0|| i%n ==0){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
