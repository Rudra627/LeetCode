public class Leetcode27 {
    public int removeElement(int[] nums, int val) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==val){
                continue;
            }
           nums[i]=nums[j];
                 i++;
           
        }
        return i;
    }
    public static void main(String args[]){
        int arr[]={3,2,2,3};
        int val=3;
        Leetcode27 s1=new Leetcode27();
        int k=s1.removeElement(arr,val);
        System.out.println(k);
    }
} 