import java.util.ArrayList;
import java.util.List;

public class combSumII {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        return findComb(0, candidates, target, new ArrayList<>());
    }

    private List<List<Integer>> findComb(int index, int[] arr, int target, List<Integer> res) {
        List<List<Integer>> ans = new ArrayList<>();

        if (index == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(res));
            }

            return ans;
        }

        res.add(arr[index]);
        ans.addAll(findComb(index + 1, arr, target - arr[index], res));
        res.remove(res.size() - 1);

        ans.addAll(findComb(index + 1, arr, target, res));
        return ans;
    }
}
