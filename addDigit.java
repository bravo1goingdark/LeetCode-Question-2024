public class addDigit {
    public int addDigits(int num) {
        int ans = 0;
        if (num % 10 == 0) {
            return ans;
        }
        
        while (num > 0) {
            ans += num%10;
            num /= 10;
        }

        return addDigits(ans);
    }
}
