import java.util.HashMap;
import java.util.Map;

class LeetCode1 {
 
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> s = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int comp=target-nums[i];
            if (s.containsKey(comp)) {
                return new int[] { s.get(comp), i };
            }
            s.put(nums[i],i);
        }
         throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String args[]){
        int arr[]={2,7,11,15};
        int t=9;
        LeetCode1 s=new LeetCode1();
        int res[]=s.twoSum(arr,t);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}

