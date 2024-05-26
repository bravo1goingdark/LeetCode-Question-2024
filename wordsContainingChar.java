import java.util.ArrayList;
import java.util.List;

public class wordsContainingChar {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String str = words[i];
            if (str.contains(String.valueOf(x))) {
                result.add(i);
            }
        }
        return result;
    }
}
