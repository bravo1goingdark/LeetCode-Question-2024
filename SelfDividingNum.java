import java.util.ArrayList;
import java.util.List;

public class SelfDividingNum {
    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(47, 85));
    }
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int index = left; index <= right; index++) {
            if (isSelfDividingNum(index)) {
                list.add(index);
            }
        }
        return list;
    }
    private static boolean isSelfDividingNum(int num){
        int dup = num;

        while (num != 0) {
            int rem = num % 10;
            if (rem == 0) {
                return false;
            }
            if (!(dup % rem == 0)) {
                return false;
            }
            num /= 10;
        }
        return true;

    }
}
