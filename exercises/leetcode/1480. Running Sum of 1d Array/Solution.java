class Solution {
    public int[] runningSum(int[] nums) {
        int[] arrayAccumulated = new int[nums.length];
        int accumt = 0 ;
        for (int i = 0; i < nums.length; i++){
            accumt = accumt + nums[i];
            arrayAccumulated[i] = accumt;
        }
        return arrayAccumulated;
    } 
}
