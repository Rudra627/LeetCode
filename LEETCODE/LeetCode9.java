
    class Leetcode9 {
    public boolean isPalindrome(int x) {
        int org=x;
        int rev=0;
        boolean isPal;
        while(x<0){
            int digit=x%10;
            rev=rev*10+digit;
            x/=10;
        }
        if( rev==org){
           isPal=true;
        }
        else
        {
            isPal=false;
           
        }
        return isPal;
    }
    public static void main(String args[]){
        Leetcode9 s1=new Leetcode9();
        int n=121;
        System.out.println(s1.isPalindrome(n));
    }
}

