import java.util.Scanner;

public class Ateam {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count=0;
        while(t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if((x+y+z)>=2){
                count++;
            }
        }
        System.out.println(count);
    }

}
