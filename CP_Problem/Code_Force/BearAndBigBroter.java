import java.util.Scanner;

public class BearAndBigBroter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();   
        int b = sc.nextInt();

        int year=0;
        while(a<=b){
            a = a*3;
            b = b*2;
            year++;
        }
        System.out.println(year);
    }
}
