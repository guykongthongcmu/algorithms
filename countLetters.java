import java.util.HashMap;
import java.util.Map;

public class countLetters {
    public static void main(String[] args) {
        String str = "hello world";

        Map<Character, Integer> charCount = new HashMap<Character, Integer>();

        for (char c : str.toCharArray()) {
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
}
