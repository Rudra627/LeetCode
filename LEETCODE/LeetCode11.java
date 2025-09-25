import java.lang.*;
public class LeetCode11 {
    public int maxArea1(int arr[]){
        int n=arr.length;
        int maxArea=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int height=Math.min(arr[i],arr[j]);
                int width=j-i;
                int area=height*width;
                maxArea=Math.max(maxArea,area);
            }
        }
        return maxArea;
    }
//Optimized Approach
    public int maxArea(int[] height) {
        int n = height.length;
        int lp = 0;
        int rp = n - 1;
        int max_area = 0;

        while (lp < rp) {
            int w = rp - lp;
            int h = Math.min(height[lp], height[rp]);
            int curr_area = w * h;
            max_area = Math.max(max_area, curr_area);

            if (height[lp] < height[rp]) {
                lp++;
            } else {
                rp--;
            }
        }
        return max_area;
    }
    public static void main(String[] args) {
        LeetCode11 obj=new LeetCode11();
        int arr[]={1,8,6,2,5,4,8,3,7};
        System.out.println(obj.maxArea(arr));
    }
}
