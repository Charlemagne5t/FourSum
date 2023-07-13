import java.util.*;

public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>>  result = new HashSet<>();
        dfs( nums, 0, target,  result, new ArrayList<>(), 0);
        return new ArrayList<>(result);

    }

    private void dfs(int[] nums, int index, int target, Set<List<Integer>> result, List<Integer> currentList, int curListSum){
        if(curListSum == target && currentList.size() == 4){
            List<Integer> validList = new ArrayList<>(currentList);
            Collections.sort(validList);
            result.add(validList);
            return;
        }

        if(index == nums.length || currentList.size() > 4){
            return;
        }

        currentList.add(nums[index]);
        dfs(nums, index + 1, target, result, currentList, curListSum + nums[index]);
        currentList.remove(currentList.size() - 1);

        dfs(nums, index + 1, target, result, currentList, curListSum);

    }
}
