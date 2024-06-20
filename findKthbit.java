public class findKthbit {
    public static void main(String[] args) {
        System.out.println(findKthBit(3, 1));
    }
    public static char findKthBit(int n, int k) {
        String str = "0";
        String newStr = "";

        for (int index = 2; index <= k; index++) {
            newStr = str + "1" + reverse(inverse(str));
            str = newStr;
        }

        return str.toCharArray()[k-1];  
    }
    private static String reverse(String str){
        int start = 0;
        int end = str.length() - 1;
        char[] ch = str.toCharArray();
        
        while (start < end) {
            swap(ch, start, end);
            start++;
            end--;
        }
        return new String(ch);
    }

    private static String inverse(String str){
        StringBuilder sb = new StringBuilder();
        for (int index = 0; index < str.length(); index++) {
            if (str.charAt(index) == '0') {
                sb.append('1');
            } else {
                sb.append('0');
            }    
        }
        return sb.toString();
    }
    private static void swap(char[] arr , int first , int second){
        char temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}