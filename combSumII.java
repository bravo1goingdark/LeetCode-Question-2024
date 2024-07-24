import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combSumII {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        return findComb(0, candidates, target, new ArrayList<>());
    }

    private List<List<Integer>> findComb(int index, int[] arr, int target, List<Integer> res) {
        List<List<Integer>> ans = new ArrayList<>();

        if (target == 0) {
            ans.add(new ArrayList<>(res));
            return ans;
        }

        for (int ind = index; ind < arr.length; ind++) {
            if (ind > index && arr[ind] == arr[ind - 1]) {
                continue;
            }
            if (arr[ind] > target) {
                break;
            }
            res.add(arr[ind]);
            ans.addAll(findComb(ind + 1, arr, target - arr[ind], res));
            res.remove(res.size() - 1);
        }

        return ans;
    }
}
