/*
Check Sorted Array
input:
4
0 0 0 1
output:
1
explanation:
The given array is sorted in non-decreasing order; hence the answer will be 1. 


very easy question so directly optimal solution 
optimal : TC = O(n)
1.run a loop from i=1
2.run a loop and check if the element is greater than or equal to the previous element then it 
is sorted.

*/
public class Check_Sorted_Array {
    public static int isSorted(int n, int []a) {
        for(int i=1;i<n;i++)
        {
            if(a[i]>=a[i-1])
            {
              
            }
            else return 0;
        }
        return 1;
    }

    public static void main(String ar[])
    {
        int arr[]={1,2,3,3,5,6,7,8};
        int n = arr.length;
        int rs = isSorted(n,arr);
        if(rs == 1)
        {
            System.out.println("sorted");
        }
        else{
            System.out.print("unsorted");
        }
    }
}
