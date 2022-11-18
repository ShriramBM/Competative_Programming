import java.util.Scanner;

public class TwoLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        while (n-- > 0){
            String str = sc.next();
            if (str.length() <= 10)
                System.out.println(str);
            else
                System.out.println(str.charAt(0) +""+(str.length() - 2)+""+ str.charAt(str.length() - 1));

        }
            
    }
}
