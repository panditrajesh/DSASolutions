
/*
 * Three Sum : Given an array of N integers, your task is to find unique triplets that add up to give a sum of zero. 
 * In short, you need to return an array of all the unique triplets [arr[a], arr[b], arr[c]] such that i!=j, j!=k, k!=i, and their sum is 
 * equal to zero.
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 * 
 */
import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4 };
        int n = arr.length;
        List<List<Integer>> ans = threeSum(arr, n);
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }

    public static List<List<Integer>> threeSum(int[] arr, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            // always assign j next to i and k as last element
            int j = i + 1;
            int k = n - 1;

            // check if previous and current element is same or not, if same, continue and
            // check for next i
            if (i != 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            while (j < k) {

                // calculate sum
                int sum = arr[i] + arr[j] + arr[k];

                // if sum is greater than 0, then decrease k as we need smaller element
                // if sum is lesser than 0, increase the j as we need greater element
                // if sum is equal to 0, add the triplet to answer
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    // asList() method takes an array and convert it into list as we need to return
                    // in the form of a list
                    List<Integer> list = Arrays.asList(arr[i], arr[j], arr[k]);
                    ans.add(list);

                    // increase the pointer of j and decrease the pointer of k
                    j++;
                    k--;

                    // now check for duplicates and skip them
                    while (j < k && arr[j] == arr[j - 1]) {
                        j++;
                    }
                    while (j < k && arr[k] == arr[k + 1]) {
                        k--;
                    }
                }
            }

        }
        return ans;
    }
}
