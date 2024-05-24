import java.util.HashMap;

public class permuteDiff {
    public int findPermutationDifference(String s, String t) {
        int ans = 0;
        HashMap<Character , Integer> storeMap = new HashMap<>();
        for (int index = 0; index < s.length(); index++) {
            char eachChar = s.charAt(index);
            storeMap.put(eachChar, index);
        }
        for (int index = 0; index < t.length(); index++) {
            char eachChar = t.charAt(index);
            if (storeMap.containsKey(eachChar)) {
                ans += Math.abs(storeMap.get(eachChar) - index);
            }
        }
        return ans;
    }
}
