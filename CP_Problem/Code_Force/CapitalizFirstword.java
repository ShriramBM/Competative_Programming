import java.util.Scanner;

public class CapitalizFirstword {

    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        String letter = sc.next();
        System.out.println(letter.substring(0, 1).toUpperCase()+letter.substring(1));
    }
    
}
