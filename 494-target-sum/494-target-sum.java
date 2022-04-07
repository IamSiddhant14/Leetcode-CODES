class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        int[]count = new int[1];
        List<Integer>temp = new ArrayList<>();
        
        findTargetSum(nums, 0, 0, target, count, temp);
        return count[0];
        
    }
    public void findTargetSum(int[]nums, int idx, int ssf, int target, int[]count, List<Integer>temp){
        
        if(idx == nums.length){
            if(ssf == target){
                // System.out.println(temp);
                count[0]++;
            }
            return;
        }
        
        // temp.add(nums[idx]);
        findTargetSum(nums, idx + 1, ssf + nums[idx], target, count, temp);
        // temp.remove(temp.size() - 1);
        
        // temp.add(-1 * nums[idx]);
        findTargetSum(nums, idx + 1, ssf - nums[idx], target, count, temp);
        // temp.remove(temp.size() - 1);
        
    }
}