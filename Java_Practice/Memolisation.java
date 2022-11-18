import java.util.HashMap;

public class Memolisation {

    public HashMap<Long, Long> memory = new HashMap<>();
    public  Long fibo(Long x){
        if(x < 2){
            return x;
        }
        if(memory.containsKey(x)){
            return memory.get(x);
        }
        Long  ans = fibo(x-1)+fibo(x-2);
        memory.put(x, ans);
        return ans;
    }
    
    public static void main(String[] args) {
        Memolisation m = new Memolisation();
        

        System.out.println(m.fibo(40l));
    }
}
