public class LeetCode162 {

    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        if (n == 1) { // Checking For single array element
            return 0;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if ((mid == 0 || nums[mid] > nums[mid - 1]) && (mid == n - 1 || nums[mid] > nums[mid + 1])) {
                return mid;
            } else if (nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        LeetCode162 s = new LeetCode162();
        int arr[] = { 1, 2, 3, 1 };
        System.out.println(s.findPeakElement(arr));
    }
}
