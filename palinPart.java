import java.util.ArrayList;
import java.util.List;;

public class palinPart {
    public List<List<String>> partition(String s) {
        return partition(0, s, new ArrayList<>());

    }

    /*
     * @param index begeining of an string, start from 0
     * 
     * @param str provide string
     * 
     * @param curr list to store current palindromed partitioned string
     * 
     * @return list of list that contain all possible palindrome partitioned string
     */

    private List<List<String>> partition(int index, String str, List<String> curr) {
        List<List<String>> res = new ArrayList<>();
        if (index == str.length()) {
            res.add(new ArrayList<>(curr));
            return res;
        }

        for (int ind = index; ind < str.length(); ind++) {
            if (isPalindrome(str, index, ind)) {
                curr.add(str.substring(index, ind + 1));
                res.addAll(partition(index + 1, str, curr));
                curr.remove(curr.size() - 1);
            }
        }
        return res;

    }

    private boolean isPalindrome(String str, int start, int end) {
        while (start <= end) {
            if (str.charAt(start++) != str.charAt(end++)) {
                return false;
            }
        }

        return true;
    }
}