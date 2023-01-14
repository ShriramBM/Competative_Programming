import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String vowels = "AEIOUYaeiouy";
        
        String result="";
        for(int i=0;i<str.length();i++){
            if(vowels.indexOf(str.charAt(i))>-1) continue;
            else{
                result+=("."+(char)((str.charAt(i)<97)?str.charAt(i)+32 : str.charAt(i)));
            }
        }
        System.out.println(result);
    }
}
