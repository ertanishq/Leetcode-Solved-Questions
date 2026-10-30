import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> checking = new HashSet<>();
        
        for(int i=0; i<nums.length; i++){
            
            if(checking.contains(nums[i])){
                return true;
            }
            checking.add(nums[i]);
        }
        return false;

    }
}