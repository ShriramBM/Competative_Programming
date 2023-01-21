import java.util.LinkedList;
import java.util.Scanner;

public class YetAnotherCard {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        LinkedList<Integer> cards = new LinkedList<>();
        int quiry[] = new int[q];

        for (int i = 0; i < n; i++)
            cards.add(sc.nextInt());
        for (int i = 0; i < q; i++)
            quiry[i] = sc.nextInt();

        for(int i=0;i<q;i++){
            int pos = cards.indexOf(quiry[i]);
            System.out.print((pos+1)+" ");
            int temp = quiry[i];
            cards.remove(pos);
            cards.addFirst(temp);
        }

        sc.close();
        
    }

}
