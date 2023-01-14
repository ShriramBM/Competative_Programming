import java.util.Scanner;

public class ChatRoom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int j=0;
        char arr[] ={'h','e','l','l','o'};
        for(int i=0;i<str.length();i++){
            if(j == 5) break;
            if(arr[j] == str.charAt(i)) j++;
        }
        System.out.println((j==5)?"YES":"NO");
    }

}
