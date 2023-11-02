/**
 * TwoSum : You are given an array and a target value. Return YES if there exist
 * two numbers such that their sum is equal to the target. Otherwise, return NO.
 */

/*
 * Two pointer approach:
 * 1. Sort the array
 * 2. initialize two pointer, one at start and another at end
 * 3. run a loop and add start and end pointer
 * 4. check if sum is greater than the target, decrease the end pointer as we
 * need smaller value
 * else if sum is lesser than the target, increase the start pointer as we need
 * greater value
 * else if sum is equal to target, return "YES"
 * 5. return "NO"
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = { 2, 6, 5, 8, 11 };
        int target = 13;
        int n = arr.length; // output = YES
        String result = twoSum(arr, n, target);
        if (result == "YES") {
            System.out.println("Pair exists here, whose sum is equal to the given value");
        } else {
            System.out.println("No such pair exists in this input array");
        }

    }

    public static String twoSum(int[] arr, int n, int target) {
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else if (sum == target) {
                return "YES";
            }
        }
        return "NO";
    }

}