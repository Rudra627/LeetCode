
import java.util.*;
public class LeetCode14 {
    public ArrayList<Integer> AddthreeSum(int[] nums) {
         ArrayList<Integer> res = new ArrayList<>();//used to store the result value
        Arrays.sort(nums);//Step -1 to do
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicates

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    res.add(nums[i]);
                    res.add(nums[left]);
                    res.add(nums[right]);

                    // Skip duplicates for left
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    // Skip duplicates for right
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    // ✅ Move both pointers after storing triplet
                    left++;
                    right--;
                }
                else if (sum < 0) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        LeetCode14 sol = new LeetCode14();

        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        int[] nums2 = {0, 0, 0, 0};

        System.out.println("Input: " + Arrays.toString(nums1));
        System.out.println("Output: " + sol.AddthreeSum(nums1));

        System.out.println("Input: " + Arrays.toString(nums2));
        System.out.println("Output: " + sol.AddthreeSum(nums2));
    }
}

