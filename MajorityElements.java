
/*
 * Majority Elements (n/3)
 *  Given an array of integers. We need to return the array of the elements those are occurring more than floor of n/3 times, n is the size of the array
 * for example: 
 * i/p - [1,1,1,3,3,2,2,2] , n = 8;
 * o/p - [1,2]
 * 
 * Understanding : Always there will be maximum two numbers possible, that will apprear more than n/3 times.
 * 
 * 
 * Brute force approach: 
 *  1. traverse through the array
 *  2. initialize count to 0;
 *  2. run a loop and check if the element is appearing again or not.
 *  3. if appearing, increment the count
 *  4. now check if the count is greater than the n/3 or not. 
 *  5. if yes, then add the element at the output array
 *  6. return the array.
 */
import java.util.*;

public class MajorityElements {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 3, 3, 2, 2, 2 };
        int n = arr.length;
        ArrayList<Integer> list = majorityElements(arr, n);
        System.out.println("Majority elements are: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    // Time complexity of the problem is O(n^2) and we are also using an extra space
    // for the list that is nearly equal to linear.
    // public static ArrayList<Integer> majorityElements(int[] arr, int n) {
    // ArrayList<Integer> list = new ArrayList<>();

    // for (int i = 0; i < arr.length; i++) {

    // // it will check if the element is already present in the result or not
    // if (list.size() == 0 || list.get(0) != arr[i]) {
    // int count = 0;

    // for (int j = 0; j < arr.length; j++) {
    // if (arr[j] == arr[i]) {
    // count++;
    // }
    // }
    // if (count > (n / 3)) {
    // list.add(arr[i]);
    // }
    // }
    // // when the list size reached to 2, it will break as more than two elements
    // can
    // // not be possible
    // if (list.size() == 2)
    // break;
    // }
    // return list;
    // }

    // optimal approach : it is the extended version of the n/2 problem
    // in that we have one count and one element, here we are going to have two
    // elements and two counts for both
    // one thing we should check that, if a element is taking care by one count, the
    // another count should not count it anymore
    public static ArrayList<Integer> majorityElements(int[] v, int n) {
        // Write your code here
        ArrayList<Integer> list = new ArrayList<>();
        int count1 = 0, count2 = 0;
        int element1 = 0, element2 = 0;

        // one element that considered by one count, should not be considered by the
        // other count
        for (int i = 0; i < v.length; i++) {
            if (count1 == 0 && v[i] != element2) {
                element1 = v[i];
                count1++;
            } else if (count2 == 0 && v[i] != element1) {
                element2 = v[i];
                count2++;
            } else if (element1 == v[i]) {
                count1++;
            } else if (element2 == v[i]) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        // manual check if the elements are correct or not
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == element1)
                count1++;
            if (v[i] == element2)
                count2++;
        }
        int mini = (int) (v.length / 3) + 1;
        if (count1 >= mini)
            list.add(element1);
        if (count2 >= mini)
            list.add(element2);
        return list;
    }

}
