import java.util.ArrayList;
import java.util.List;

public class circleGameWinner {
    public static void main(String[] args) {
        System.out.println(findTheWinner(6, 5));
    }
    public static int findTheWinner(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for (int index = 1; index <= n; index++) {
            list.add(index);
        }
        int index = 0;

        while (list.size() > 1) {
            index = (index + k - 1) % list.size();
            list.remove(index);
        }

        return list.get(0);
    }
}
