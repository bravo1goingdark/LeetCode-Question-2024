public class kbeauty {
    public int divisorSubstrings(int num, int k) {
        int beauty = 0;
        String numStr = String.valueOf(num);
        
        for (int i = 0; i <= numStr.length() - k; i++) {
            String subStr = numStr.substring(i, i + k);
            int divisor = Integer.parseInt(subStr);
            
            if (divisor != 0 && num % divisor == 0) {
                beauty++;
            }
        }
        
        return beauty;
    }
}
