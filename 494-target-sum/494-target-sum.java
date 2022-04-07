class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int[]count = new int[1];
        findTargetSum(nums, 0, 0, target, count);
        return count[0];
    }
    public void findTargetSum(int[]nums, int idx, int ssf, int target, int[]count){
        if(idx == nums.length){
            if(ssf == target){
                count[0]++;
            }
            return;
        }
        findTargetSum(nums, idx + 1, ssf + nums[idx], target, count);
        findTargetSum(nums, idx + 1, ssf - nums[idx], target, count);
    }
}