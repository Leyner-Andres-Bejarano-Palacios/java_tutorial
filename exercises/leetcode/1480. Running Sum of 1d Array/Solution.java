class Solution {
    public int[] runningSum(int[] nums) {
        int[] arrayAccumulated = new int[nums.lenght];
        int accumt = 0 ;
        for (int i = 0; i < nums.lenght; i++)
            accumt = accumt + nums[i]
            arrayAccumulated[i] = accumt;
        return arrayAccumulated
    } 
}
