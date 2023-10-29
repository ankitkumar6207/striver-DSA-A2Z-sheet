/*Max Consecutive Ones
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

simple :
optimal : TC : O(n)
          SC : O(1)
*/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
      int max1 = 0;
      int count =0;

      for(int i =0 ;i<nums.length;i++)
      {
         
          if(nums[i] == 1)
          {
              count ++;
              max1 = Math.max(max1,count);

          }
          else{
              count = 0;
          }
         
     }

     return max1;

    }

    public static void main(String ar[])
    {
        int arr[] = {1,1,0,0,1,1,1,0,1,0,1,1};
        int result  = findMaxConsecutiveOnes(arr);
        System.out.print("maximum consecutive one's is ",ressult);

    }
}
