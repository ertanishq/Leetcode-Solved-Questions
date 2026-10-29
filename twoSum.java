import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> checking = new HashMap<>();
        for(int i=0; i<nums.length; i++){

            int needed = target - nums[i];

            if(checking.containsKey(needed)){
                //return the index of that needed element
                return new int[] {checking.get(needed) , i};
            }
            else{
                //Store the element
                checking.put(nums[i] , i);
            }

        }
        return new int[] {};
    }
}