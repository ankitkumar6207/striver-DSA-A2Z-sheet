/*Second Largest and second smallest Number

input:
5
4 5 3 6 7
output:
6 4

explanation:
The second largest element after 7 is 6 only,
 and the second smallest element after 3 is 4.
*/

public class Second_Largest_In_Array {
    public static int secondLargest(int n, int []arr)
    {
        int largest = arr[0];
        int sLargest = -1;

/*   
*brute force : TC = O(nlogn)+O(n)
1.sort the array
2.run a loop from second largest till start if it is not equal to largest then that is    
  2nd largest 
3.if second largest is not there then return -1.
*/
 Arrays.sort(arr);
 largest = arr[n-1];
 for(int i=n-2 ;i>0;i--)
 {
    if(arr[i]!=largest)
    {
        sLargest = arr[i];
         return sLargest;
        break;
        
    }
    else return -1;
 }

/*
** Better : TC = O(n)+O(n)
 1.run a loop till the end and find the largest element in the array
 2.run a secon loop till the end if the seconglargest is greater than array element and  
   it is not equal to largest then store it into second largest.
*/

   for(int i=0;i<n;i++)
   {
    if(arr[i]>largest)
       largest = arr[i];
   }
   for(int i=0;i<n;i++)
   {
    if(arr[i]>sLargest && arr[i]!= largest){
      sLargest = arr[i];
      break;
    }
   }
   return sLargest;


/*
*** optimal : TC : O(n) 
1.if the arr[i] is greater than largest then previous largest element will be the 
secong largest element.
 [1,2,4,7,7] largest= 7 and secondlargest = 4
2.if arr[i] is not greater than largest then also check is it greater than second largest 
if yes then sLargest = arr[i]
 [1,2,3,7,3,6] here largest = 7 and second largest = 6 
 */

   
        for(int i=0;i<n;i++)
        {
            if(arr[i] > largest){
              sLargest = largest;
              largest = arr[i];
            }
            else if(arr[i]!=largest  && arr[i]>sLargest)
              {
                  sLargest = arr[i];
              }
        }
     return sLargest;
    }

    //find second smallest in the array
    public static int secondSmallest(int n, int[] arr)
    {
        
        int smallest = arr[0];
        int sSmallest = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i] < smallest){
              sSmallest = smallest;
              smallest = arr[i];
            }
            else if(arr[i]!=smallest  && arr[i]<sSmallest)
              {
                  sSmallest = arr[i];
              }
        }

     return sSmallest;
    } 
    
    public static int[] getSecondOrderElements(int n, int []a) {
        int sLargest = secondLargest(n,a);
        int sSmallest = secondSmallest(n,a);
        int[] arr = {sLargest,sSmallest};
        return arr;
         
    }


    public static void main(String ar[])
    {
        int arr[]={1,2,3,4,2,6,7,3,9,23};
        int n = arr.length;
        int result[2];
        result = getSecondOrderElements(n,arr);
        System.out.println(Arrays.toString(result));
    }
}
