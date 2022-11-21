import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DeathsBlessing {

    public Integer x;
    public Integer y;

    public DeathsBlessing(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.x + " " + this.y;
    }

    public static int indexOF(List<DeathsBlessing> data, DeathsBlessing d) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).x == d.x && data.get(i).y == d.y)
                return i;

        }
        return -1;
    }

    public static int logic(List<DeathsBlessing> sorted_data, List<DeathsBlessing> data, int result) {

        if (data.isEmpty())
            return result;

        int index = indexOF(data, sorted_data.get(0));

        // main thing
        result = result + data.get(index).x;

        if ((index - 1) >= 0)
            data.get(index - 1).x = data.get(index - 1).x + data.get(index).y;
        if ((index + 1) < data.size())
            data.get(index + 1).x = data.get(index + 1).x + data.get(index).y;

        data.remove(index);
        sorted_data.remove(0);
        return logic(sorted_data, data, result);

    }

    public static void main(String[] args) {
        // d.stream().sorted((a, b) -> a.y.compareTo(b.y)).collect(Collectors.toList())
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            List<DeathsBlessing> data = new ArrayList<>();
            int len = sc.nextInt();
            for (int i = 0; i < len; i++)
                data.add(new DeathsBlessing(sc.nextInt(), 0));

            for (int i = 0; i < len; i++)
                data.get(i).y = sc.nextInt();

            List<DeathsBlessing> sorted_data = data.stream().sorted((a, b) -> a.y.compareTo(b.y))
                    .collect(Collectors.toList());

            System.out.println(logic(sorted_data, data, 0));
        }

    }
}
