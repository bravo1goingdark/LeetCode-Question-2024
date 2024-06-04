public class firstOccur {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        int hLen = haystack.length();
        int nLen = needle.length();
        
        // Iterate through haystack with a range that ensures needle fits
        for (int i = 0; i <= hLen - nLen; i++) {
            int j = 0;
            // Use two pointers to compare haystack and needle
            while (j < nLen && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            // If the entire needle is found in haystack
            if (j == nLen) {
                return i;
            }
        }
        return -1;
    }
}
