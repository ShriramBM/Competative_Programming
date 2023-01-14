import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Taxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> data = new HashMap<>();
        data.put(1, 0);
        data.put(2, 0);
        data.put(3, 0);
        data.put(4, 0);
        for (int i = 0; i < n; i++) {
            int inp = sc.nextInt();
            data.put(inp, data.get(inp) + 1);
        }
        int total = 0;
        
        total = data.get(4) + data.get(3);

        if (data.get(3) >= data.get(1))
            data.put(1, 0);
        else
            data.put(1, data.get(1) - data.get(3));
        
        total = total+ (data.get(2)/2);
        data.put(2, data.get(2)%2);
        total = total + (data.get(1)/4);
        data.put(1, data.get(1)%4);
        if(data.get(2)>0 || data.get(1)>0){
            total++;
            if(data.get(2)>0 && (data.get(1)+2)>4){
                
                    total+=2;
                }
            }
            else{
                total++;
            }
        } 

        System.out.println(total);

    }
}