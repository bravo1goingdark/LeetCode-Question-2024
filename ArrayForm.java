import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayForm {
    public static void main(String[] args) {
        System.out.println(addToArrayForm(new int[]{1,2,0,0}, 34));
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        int n = num.length;
        int carry = k;
        List<Integer> result = new ArrayList<>();
        
        for (int i = n - 1; i >= 0; i--) {
            carry += num[i];
            result.add(carry % 10); 
            carry /= 10; 
        }

        while (carry > 0) {
            result.add(carry % 10);
            carry /= 10;
        }

        Collections.reverse(result);
        return result;
    }
}
