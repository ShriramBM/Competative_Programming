import java.util.Map;
import java.util.TreeMap;

public class MappingIteration {
    public static void main(String[] args) {
        Map<String, String> gfg = new TreeMap<String, String>();

        // enter name/url pair
        gfg.put("GFG", "geeksforgeeks.org");
        gfg.put("Practice", "practice.geeksforgeeks.org");
        gfg.put("Code", "code.geeksforgeeks.org");
        gfg.put("Quiz", "www.geeksforgeeks.org");

        for (Map.Entry<String, String> entry : gfg.entrySet())
            System.out.println(
                    "[" + entry.getKey()
                            + ", " + entry.getValue() + "]");
    }
}
