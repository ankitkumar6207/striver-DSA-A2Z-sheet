class Solution {
    public void moveZeroes(int[] nums) {
    //  int length = nums.length;
    //     int temp[] = new int[length];
    //     int count=0;
    //     for(int i =0; i < length ; i++)
    //     {
    //         if(nums[i] != 0){
    //           temp[i]=nums[i];
    //           count++;
    //         }
    //     }
    //     System.out.print(count);

    //     int tempLen = count;

    //     for(int i =0 ; i < tempLen; i++)
    //     {
    //        nums[i] = temp[i];
    //     }
    //     int nonZero = tempLen;
    //     for(int i = nonZero ;i < length ;i++)
    //     {
    //       nums[i] = 0;
    //     }
        
       if (nums.length == 1) {
            return;
        }

        int nonZeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }

       
         while(nonZeroIndex<nums.length){
            nums[nonZeroIndex] = 0;
            nonZeroIndex++;
        }



    }
}
