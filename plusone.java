import java.util.Arrays;

public class plusone {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[] {9,9,9,9})));
    }
    public static int[] Plusone(int[] digits) {
        return strToarr(strToint(digits));
    }
    private static String strToint(int[] arr){
        StringBuilder str = new StringBuilder();
        for (int num : arr) {
            str.append(num);
        }
        long value = Long.parseLong(new String(str)) + 1;
        return Long.toString(value);
    }
    private static int[] strToarr(String str){
        int[] ans = new int[str.length()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = Character.getNumericValue(str.charAt(i));
        }
        return ans;
    }
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}
