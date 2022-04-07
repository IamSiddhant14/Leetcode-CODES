class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return ways(nums, 0, 0, target);
    }
    public int ways(int[]nums, int idx, int ssf, int target){
        if(idx == nums.length ){
            if (ssf == target){
                  return 1;
            }
            return 0;
            
        }
        int count = 0;
        count += ways(nums, idx + 1, ssf + nums[idx], target);
        count += ways(nums, idx + 1, ssf - nums[idx], target);
        return count;
    }
}