import java.util.HashSet;
import java.util.Set;

public class repeatChar {
    public char repeatedCharacter(String s) {
        Set<Character> set = new HashSet<>();

        for (Character ch : s.toCharArray()) {
            if (set.contains(ch)) {
                return Character.valueOf(ch);
            }
            set.add(ch);
        }
        return 'f';
    }
}
