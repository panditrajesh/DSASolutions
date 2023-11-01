/**
 * MaximumSubarraySum : You are given an array. Find the subarray having the
 * maximum sum among all the
 * subarrays
 * This is called "Kadane's Algorithm"
 */
public class MaximumSubarraySum {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 7, -4, 3, 2, -10, 9, 1 };
        // output : 11 ; subarray = [1, 2, 7, -4, 3, 2]
        int n = arr.length;
        int maximumSum = maximumSubarraySum(arr, n);
        System.out.println("Maximum subarray sum : " + maximumSum);

    }

    public static int maximumSubarraySum(int[] arr, int n) {
        int sum = 0;
        int maxSum = 0;
        if (n == 1 && arr[0] == 0) {
            return maxSum;
        }
        for (int i = 0; i < n; i++) {
            // iterate through the array and add every element to the 'sum'
            sum += arr[i];

            // now check if sum is greater than the maxsum. If yes, update the maxsum
            if (sum > maxSum) {
                maxSum = sum;
            }

            // if at any point sum becomes negative, we will make it 0 as we are not going
            // to consider it as a part of our answer
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }
}