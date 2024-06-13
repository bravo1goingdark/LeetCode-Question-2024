import java.util.HashMap;
import java.util.Map;

public class goodSub {
    public static void main(String[] args) {
        System.out.println(countGoodSubstrings("xyzzaz"));
    }
    public static int countGoodSubstrings(String s) {
        int left = 0;
        int right = 2;
        int resultCount = 0;

        while (right < s.length()) {
            if (isUnique(s.substring(left, right + 1))) {
                resultCount++;
            }
            left++;
            right++;
        }
        return resultCount;
    }

    private static boolean isUnique(String str){
        Map<Character , Integer> countCharMap = new HashMap<>();

        for (char eachChar : str.toCharArray()) {
            if (countCharMap.containsKey(Character.valueOf(eachChar))) {
                int value = countCharMap.get(Character.valueOf(eachChar));
                countCharMap.put(Character.valueOf(eachChar), ++value);
            }else {
                countCharMap.put(Character.valueOf(eachChar), 1);
            }
        }

        for (Character val : countCharMap.keySet()) {
            Integer getCount = countCharMap.get(val);
            if (getCount > 1) {
                return false;
            }
        }
        return true;
    }
}
