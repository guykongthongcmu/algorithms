import java.util.HashMap;
import java.util.Map;

public class hashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Guy", 2005);
        map.put("Sal", 2005);
        map.put("Oat", 2006);
        map.put("Hikaru", 2006);
        map.put("Matt", 2006);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + ": " + value);
        }
    }
}
