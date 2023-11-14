



//optimal solution : Tc :O(n) SC: O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        int j=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i] != nums[i-1])
            {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;

        
    }
}
