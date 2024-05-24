import java.util.HashMap;

public class jewelandstone {
    public int numJewelsInStones(String jewels, String stones) {
        int numOfJewels = 0;
        HashMap<Character,Integer> stoneMap = new HashMap<>(stones.length());

        for (int index = 0; index < stones.length(); index++) {
            char eachChar = stones.charAt(index);
            if (stoneMap.containsKey(eachChar)) {
                int value = stoneMap.get(eachChar);
                stoneMap.put(eachChar, ++value);
            }else {
                stoneMap.put(eachChar, 1);
            }
        }

        for (int index = 0; index < jewels.length(); index++) {
            char eachChar = jewels.charAt(index);
            if (stoneMap.containsKey(eachChar)) {
                numOfJewels += stoneMap.get(eachChar);
            }
        }
        return numOfJewels;

    }
}
