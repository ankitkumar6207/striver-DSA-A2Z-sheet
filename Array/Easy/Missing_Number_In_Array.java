/*
Missing Number
in the size of n array the array contains 1 to n-1 elements 
and here one number will be missing , which you have to find it.

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
*/

class Missing_Number_In_Array {
    public int missingNumber(int[] nums) {

/*
*Brute force:
TC = O(n^2)(it is hypothetical TC , in the worst case it will be O(n^2)but for 1 it will broke out from the inner loop at first so it is completely O(n^2))
SC = O(1)
*/

int flag =0;
for(int i=1;i<=nums.length;i++)
{
    for(int j = 0;j<nums.length;j++)
    {
        if(nums[j]==i)
        {
            flag=1;
            break;
        }
    }
    if(flag == 0)
     return i;
}

/*
**Better: we can use Hashing (to fetch the 5 you need to create a hashmap of size 6 means n+1)
TC : O(2N)
SC : O(N) since we are creating a hash array.

approach: 
1.create a hashmap of size n+1 
2.store the ocurrence of each element in the hash table
3.iterate 1 to n and check whos ocurrence is still 0 so just return it.
*/
       int N = nums.length;
       int hash[] = new int[N + 1]; //hash array

        // storing the frequencies:
        for (int i = 0; i < N - 1; i++)
            hash[a[i]]++;

        //checking the freqencies for numbers 1 to N:
        for (int i = 1; i <= N; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }

        return -1;

/*
***optimal :
 TC: O(n)
 Sc : O(1)

using sum: if the the size is 10^5 then it will be 10^5(10^5) +1 which is bigger than the size of int and you have to take long so xor one is better.
*/
        int n = nums.length;
        int sum =0;
        sum = n*(n+1)/2;
        int s2=0;
        for(int i=0;i<n;i++)
        {
            s2+=nums[i];

        }
        return sum-s2;

/*
using xor :
TC : O(n)
SC : O(1)
 a ^ a = 0     0 ^ a =a
 2 ^ 2 =0      0 ^ 2 =2
 2 ^ 2^2^2 =0

*/
    
        int n = nums.length;
        int xor1 =0;
        // for(int i=1;i<=n;i++)
        // {
        //     xor1 = xor1 ^ i;
        // }
        int xor2 = 0;
        for(int i=0;i<n;i++)
        {
            xor1 = xor1 ^ (i+1);
            xor2 = xor2 ^ nums[i];
        }
        xor1 = xor1 ^ n;

        return xor1 ^ xor2;    
    }


      public static void main(String[] args) {
        int[] arr = {0, 3, 1};
        int ans = missingNumber(arr);
        System.out.println(ans);
    }
}





