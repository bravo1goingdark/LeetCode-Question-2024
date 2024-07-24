import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class subsetII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        return findComb(0, nums, new ArrayList<>(), new ArrayList<>());
    }

    private List<List<Integer>> findComb(int index, int[] arr, List<Integer> current, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(current));

        for (int ind = index; ind < arr.length; ind++) {
            if (ind > index && arr[ind] == arr[ind - 1]) {
                continue;  
            }
            current.add(arr[ind]);
            findComb(ind + 1, arr, current, ans);
            current.remove(current.size() - 1);
        }
        return ans;
    }
}
