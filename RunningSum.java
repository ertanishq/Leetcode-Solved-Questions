class Solution {
    public int[] runningSum(int[] nums) {
        int [] newArray = new int[nums.length];
        newArray[0] = nums[0];
        for(int i = 1; i<nums.length; i++){
            newArray[i] = nums[i] + newArray[i-1];
        }
        return newArray;
    }
}