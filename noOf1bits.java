public class noOf1bits {
    public int hammingWeight(int n) {
        String str = covertToBinary(n);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                count++;
            }
        }

        return count;
    }
    public String covertToBinary(int number){
        return Integer.toBinaryString(number);
    }
}
