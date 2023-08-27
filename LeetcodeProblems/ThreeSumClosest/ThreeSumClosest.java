
import static java.lang.Math.abs;
import java.util.*;
 
class Solution {
    public int ThreeSumClosest(int[] arr, int x) {

    Arrays.sort(arr);
    long closestSum = Integer.MAX_VALUE;

    for (int i = 0; i < arr.length - 2; i++)
    {
 
        // Two pointers initially pointing at
        // the last and the element
        // next to the fixed element
        int ptr1 = i + 1, ptr2 = arr.length - 1;
 
        // While there could be more pairs to check
        while (ptr1 < ptr2)
        {
 
            // Calculate the sum of the current triplet
            int sum = arr[i] + arr[ptr1] + arr[ptr2];
 
            // If the sum is more closer than
            // the current closest sum
            if (abs(x - sum) < abs(x - closestSum))
            {
                closestSum = sum;
            }
 
            // If sum is greater than x then decrement
            // the second pointer to get a smaller sum
            if (sum > x)
            {
                ptr2--;
            }
 
            // Else increment the first pointer
            // to get a larger sum
            else
            {
                ptr1++;
            }
        }
    }
 
    // Return the closest sum found
    return (int)closestSum;

        
        
    }
}