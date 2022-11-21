import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCompareObject {

    public Integer x;
    public Integer y;

    public StreamCompareObject(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.x + " " + this.y;
    }

    public static void main(String[] args) {
        List<StreamCompareObject> d = new ArrayList<>();
        d.add(new StreamCompareObject(2, 3));
        d.add(new StreamCompareObject(6, 6));
        d.add(new StreamCompareObject(7, 0));
        d.add(new StreamCompareObject(3, 5));



        // Sorting the object as our wise
        System.out.println(d.stream().sorted((a, b) -> b.y.compareTo(a.y)).collect(Collectors.toList()));
    }
}

