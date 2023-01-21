import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;



public class Dragon {

    static class Data {
        public Integer drogon;
        public Integer bonus;
    
        public Data(Integer drogon, Integer bonus) {
            this.bonus = bonus;
            this.drogon = drogon;
        }
    
        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return drogon + " " + bonus;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ini_stg = sc.nextInt();
        int test = sc.nextInt();

        List<Data> d = new ArrayList<>();

        String flag = "";
        for (int i = 0; i < test; i++) {
            d.add(new Data(sc.nextInt(), sc.nextInt()));
        }
        d  = d.stream().sorted((a, b) -> a.drogon.compareTo(b.drogon)).collect(Collectors.toList());
        for (int i = 0; i < test; i++) {
            if (d.get(i).drogon < ini_stg) {
                ini_stg += d.get(i).bonus;
                flag = "YES";
            } else {
                flag = "NO";
                break;
            }
        }
        System.out.println(flag);
        sc.close();

    }
}