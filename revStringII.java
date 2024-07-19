public class revStringII {
    public String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
        int length = s.length();
        
        for (int start = 0; start < length; start += 2 * k) {
            int end = Math.min(start + k - 1, length - 1);
            rev(ch, start, end);
        }

        return new String(ch);

    }

    private static String rev(char[] ch , int from , int to){
        int start  = from;
        int end = to;

        while (start < end) {
            swap(ch, start, end);
            start++;
            end--;
        }

        return new String(ch);
    }
    private static void swap(char[] arr , int from , int to){
        char temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }
}
