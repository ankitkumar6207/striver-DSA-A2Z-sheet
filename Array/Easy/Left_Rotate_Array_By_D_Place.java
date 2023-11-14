/*Rotate array by D places:

input 1:
8
7 5 2 11 2 43 1 1
2
output 1:
2 11 2 43 1 1 7 5

explanation:
Rotate 1 steps to the left: 5 2 11 2 43 1 1 7
Rotate 2 steps to the left: 2 11 2 43 1 1 7 5

input 2:
4
5 6 7 8
3
output 2:
8 5 6 7

explanation:
Rotate 1 steps to the left: 6 7 8 5
Rotate 2 steps to the left: 7 8 5 6
Rotate 2 steps to the left: 8 5 6 7

note: if d is greater than size of array 
means if n = 5 and then d=6 then rotation by will produce same result

multiple of size of array roatation will always bring yo the original array the 
remaining is what you need to rotate.
ex: 1 2 3 4 5 6 7    d= 8 
  at the end the result look like
  2 3 4 5 6 7 1     means d = 1

[d = d % n]
 ex: d= 15
     n= 7 
     d= 15 % 7     d= 1(rotate by one place)
  */

/*
*brute force: TC = O(d)+O(n-d)+O(d) =O(n+d) SC = O(d)(extra temp array is created)

1.create a temp array and store the no. of elements till d position
2.then run a loop from dth position to last , shift all the elements
3.copy the array in the last position of array.

arr[] = {1,2,3,4,5,6,7} d=3
temp[] = {1,2,3}

step 2: shifting
for(i=d;i<n;i++)
{
    arr[i-d] = arr[i];
}
after shifting 
{4,5,6,7,5,6,7}

step3: put back temp array into the main array
j=0
for(i=n-d;i<n;i++)
{
    arr[i] = temp[j];
    j++;
}
get rid of j:
for(i=n-d;i<n;i++)
{
    arr[i]=temp[i-(n-d)];
}

*/

/*

optimal : get rid of this extra SC 
SC = O(1);
TC : O(2n)

arr[]={1,2,3,4,5,6,7} n=7 d=3
    {1,2,3} till d reverse it {3,2,1}
    {4,5,6,7} from d to n, reverse it {7,6,5,4}
    {3,2,1,7,6,5,4} from 0 to n-1 complete reverse {4,5,6,7,1,2,3}


reverse(a,a+d);
reverse(a+d,a+n);
reverse(a,a+n);
*/

// left rotaion by d places:
// #brute force 
  class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k%=nums.length;
        int temp[] = new int[k];
    
    // left rotation : 
        // for(int i=0;i<k;i++)
        // {
        //     temp[i] = nums[i];
        // }
        // for(int i=k;i<n;i++)
        // {
        //     nums[i-k] = nums[i];
        // }

        // for(int i = n-k ; i < n ; i++)
        // {
        //     nums[i] = temp[i- (n - k)];
        // }

        // right rotation : brute force
            
        // for (int i = n - k; i < n; i++) {
        // temp[i - n + k] = nums[i];
        // }
        // for (int i = n - k - 1; i >= 0; i--) {
        // nums[i + k] = nums[i];
        // }
        // for (int i = 0; i < k; i++) {
        // nums[i] = temp[i];
        // }


        // optimal : right rotation :
        // public void rotate(int[] nums, int k) {
        // k %= nums.length;
        // int n = nums.length;
        // reverseNum(nums,0,n-1);
        // reverseNum(nums,0,k-1);
        // reverseNum(nums,k,n-1);

        // optimal : left rotation 
        reverseNum(nums,0,k-1);
        reverseNum(nums,k,n-1);
        reverseNum(nums,0,n-1);
    }
    public void reverseNum(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    
    }
}






