public class Leetcode26 {
   
    public int removeDuplicates(int[] nums) {
       if(nums.length==0)return 0;
       int i=0;//pointing to the previous element
       for(int j=1;j<nums.length;j++){
        if(nums[j]!=nums[i]){//find the unique element
            i++;
            nums[i]=nums[j];//store the element for  the next comp
        }
        
       }
       return i+1; //return the filterd array length
    }
    public static void main(String args[]){
        int arr[]={1,1,2};
        Leetcode26 s=new Leetcode26();
        int k=s.removeDuplicates(arr);
        System.out.println("Unique count = " + k);
    }
}

