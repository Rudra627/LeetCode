public class Leetcode268 {
    public int misNumber(int nums[]) {
        int n = nums.length;
        int total = n * (n + 1) / 2;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        return total - sum;
    }

    public static void main(String[] args) {
        Leetcode268 s = new Leetcode268();
        int nums[] = { 3, 0, 1 };
        int ans = s.misNumber(nums);
        System.out.println(ans);
    }
}
