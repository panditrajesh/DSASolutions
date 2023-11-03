/*
 * Majority Element: You are given an array of length n. You need to find out the element which apprears more than n/2 times.
 * 
 * Approach :
 *  We can follow the brute force approach.
 *  Traverse through the array count the apprearence of every element. Then atlast check if it appears more than n/2 times,
 *  if yes, return the  element.
 * This approach will take O(n^2) time complexity. 
 * 
 * We can optimize this
 * Optimal approach: when it face same element, it will increase, otherwise decrease. atlast the element that apprears more than half will 
 * stay as every element will cancel each other
 *  1. set count = 0, element = 0;
 *  2. run a loop
 *      a. check if element is 0
 *          if yes, increase the count and set it new element
 *      b. check if element == a[i]
 *          if yes, increase the count
 *             else, decrease the count
 *  3. return element
 * 
 * 
 */
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 2, 3, 4, 2, 1 };
        int n = arr.length;
        int element = majorityElement(arr, n);
        System.out.println("The element that appears more than half of the length of the array is: " + element);
    }

    public static int majorityElement(int[] a, int n) {
        int element = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                element = a[i];
                count++;
            }
            if (element == a[i]) {
                count++;
            } else {
                count--;
            }
        }
        return element;
    }
}
