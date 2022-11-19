import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StonesTable {
    public static void main(String[] args) {
        
        

        Scanner sc = new Scanner(System.in);
        Set<Character> sets = new HashSet<>();
    
        int n=sc.nextInt();
        String s = sc.next();
    
        char now='\0';
        int count=0;
        
        for(int i=0;i<n;i++){
            if(now != s.charAt(i)){
                now = s.charAt(i);
            }
            else {
                count++;
            }
        }

        System.out.println(count);
        

    }
}
