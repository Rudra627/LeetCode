public class LeetCode61 {
    public int sqrtofNum(int x){
        // APPROch is correct but it has O(n) time complexity
        // int ans=0;
        // for(int i=1;i<=x;i++){
        //     if(i*i<=x){
        //         ans=i;
        //         continue;
        //     }
        // }

        //time complexity is O(log n)
        if(x<2) return x;
        int left=1,right=x/2,ans=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(mid<=x/mid){
                mid=ans;
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        LeetCode61 s = new LeetCode61();
        int x=9;
        int ans = s.sqrtofNum(x);
        System.out.println(ans);
    }
}
