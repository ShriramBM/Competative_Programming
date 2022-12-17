import java.util.Scanner;

public class WordUL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        String letter = sc.next();
        int low = 0, high = 0;
        
        for (int i = 0; i < letter.length(); i++) {
            if ((int) letter.charAt(i) >= 97)
                low++;
            else
                high++;
        }
        if (low >= high)
            System.out.println(letter.toLowerCase());
        else
            System.out.println(letter.toUpperCase());

    }
}
