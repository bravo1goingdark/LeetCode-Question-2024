import java.util.Set;
import java.util.HashSet;
public class maxStringPair {

    public int maximumNumberOfStringPairs(String[] words) {
        Set<String> reversedSet = new HashSet<>();
        int count = 0;

        for (String word : words) {
            String reversed = revString(word);
            if (reversedSet.contains(reversed)) {
                count++;
                reversedSet.remove(reversed); // Remove to avoid counting duplicates
            } else {
                reversedSet.add(word); // Add the original string
            }
        }

        return count;
    }

    public String revString(String str) {
        char[] arr = str.toCharArray();

        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swapStr(arr, start, end);
            start++;
            end--;
        }
        return new String(arr);
    }

    public void swapStr(char[] arr, int first, int second) {
        char temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}